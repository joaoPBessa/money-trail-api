# Revenue Type Specification

**Approved**: 2026-11-26 - user: "Aprovado, pode seguir"

## Problem Statement

money-trail-api users need to categorize where their income comes from (own salary, spouse's
salary, meal voucher, refunds, investment redemptions, etc.) before income entries can reference a
category. Today there is no such lookup table. This is a simple domain/reference entity, the
second CRUD in the app after `distribution-method`, following the same layered pattern.

## Goals

- [ ] A client can create, list, fetch by id, update and delete a revenue type through a REST API.
- [ ] The database always contains the 6 standard revenue types out of the box, via migration -
      no manual seeding step required.
- [ ] Invalid or duplicate input is rejected before anything is persisted.

## Out of Scope

Explicitly excluded. Documented to prevent scope creep.

| Feature | Reason |
| ------- | ------ |
| Linking a revenue type to income entries/transactions | Future feature; this spec only covers CRUD on the type itself |
| Authentication / authorization / per-user scoping | No auth system exists in the project yet (no security starter in `pom.xml`); the app is currently single-tenant |
| Soft delete / history of removed types | Hard delete chosen, same as `distribution-method` |
| Pagination on the list endpoint | Expected dataset is a handful of types; add later if it grows |
| Protecting the 6 pre-seeded types from edit/delete | User decision during discuss: treat every row the same, keep the table simple |
| Any field beyond `name` (e.g. description, icon, active flag) | User explicitly asked for "a bastante simples ... tabela de domínio" |

---

## Assumptions & Open Questions

Every ambiguity is resolved or recorded here - nothing is left silently unclear.

| Assumption / decision | Chosen default | Rationale | Confirmed? |
| --- | --- | --- | --- |
| Name uniqueness | Unique, case-insensitive, trimmed (`UNIQUE` index on `lower(name)`) | User decision during discuss | y |
| Seed-data protection | None - the 6 seeded rows are ordinary records, editable/deletable like any other | User decision during discuss | y |
| Testing strategy | Unit tests (service + controller, mocked) **and** a new end-to-end acceptance-test suite (`@SpringBootTest`, real Postgres, real Flyway migration) | User decision during discuss | y |
| Entity shape | Single `name` field (`VARCHAR(100)`, required, 1-100 chars after trim) + server-managed `id`/`createdAt`/`updatedAt` | User explicitly asked for a simple domain table; mirrors `distribution_methods.title` bound | y |
| User / tenant scoping | None - table has no `user_id` column, entity is global | No auth infrastructure exists in the codebase yet (fact, not a product guess) | y |
| List ordering | Ordered by `created_at` ascending | Deterministic default absent any requested sort/filter, consistent with `distribution-method` | y |
| Validation error shape | Field-level failures (blank/too-long name) use Spring's default `@Valid` 400 response; business-rule failures (409 duplicate, 404 not found) reuse the existing `GlobalExceptionHandler`/`ApiError` from `distribution-method`, extended with this feature's exceptions | Reuses the cross-cutting error handler already in the codebase instead of inventing a parallel shape | y |
| Seed values & order | `Saldo Disponível`, `Salário Próprio`, `Salário Cônjuge`, `Vale Refeição/Alimentação`, `Estorno`, `Resgate de Aplicação`, inserted in this order by the migration | Exact list and order given by the user in this session | y |
| Endpoint/entity naming | `RevenueType` entity, `revenue_types` table, `/api/revenue-types` endpoint (English identifiers; seeded data values stay in Portuguese as given) | Repository convention: code in English (confirmed project convention), domain data as provided by the user | y |

**Open questions:** none - all resolved or logged above.

---

## User Stories

### P1: Manage Revenue Types ⭐ MVP

**User Story**: As a money-trail-api user, I want to create, view, update and delete revenue types,
with the 6 standard ones already available out of the box, so that I can categorize my income
sources and later reuse these categories when registering income.

**Why P1**: This is the second domain entity in the app; later features (income entries) will
reference it. There is no smaller useful slice - a type that can be created but never read,
updated or deleted is not usable, and the standard types must exist without any manual setup.

**Acceptance Criteria** (each line is one EARS pattern):

1. WHEN a client submits `POST /api/revenue-types` with a `name` that is non-blank and at most 100
   characters after trim, THEN the system SHALL create the revenue type and respond
   `201 Created` with the created resource and a `Location` header pointing to
   `GET /api/revenue-types/{id}`.
2. IF a `POST` or `PUT` request has a missing or blank `name` THEN the system SHALL respond
   `400 Bad Request` and SHALL NOT persist any change.
3. IF a `POST` or `PUT` request has a `name` longer than 100 characters after trim THEN the system
   SHALL respond `400 Bad Request` and SHALL NOT persist any change.
4. IF a `POST` request's `name` matches, case-insensitively and after trim, the name of an existing
   revenue type THEN the system SHALL respond `409 Conflict` and SHALL NOT create a new record.
5. WHEN a client submits `GET /api/revenue-types` THEN the system SHALL respond `200 OK` with a
   JSON array of all revenue types ordered by `createdAt` ascending.
6. WHEN a client submits `GET /api/revenue-types/{id}` for an id that exists THEN the system SHALL
   respond `200 OK` with that revenue type.
7. IF a client submits `GET /api/revenue-types/{id}` for an id that does not exist THEN the system
   SHALL respond `404 Not Found`.
8. WHEN a client submits `PUT /api/revenue-types/{id}` for an id that exists, with a body that
   passes the checks in criteria 2-3, THEN the system SHALL update that type's `name` and respond
   `200 OK` with the updated resource.
9. IF a client submits `PUT /api/revenue-types/{id}` for an id that does not exist THEN the system
   SHALL respond `404 Not Found` and SHALL NOT create a record.
10. IF a `PUT` request's `name` matches, case-insensitively and after trim, the name of a
    *different* existing revenue type THEN the system SHALL respond `409 Conflict` and SHALL NOT
    update the record.
11. WHEN a client submits `DELETE /api/revenue-types/{id}` for an id that exists THEN the system
    SHALL delete that revenue type and respond `204 No Content`.
12. IF a client submits `DELETE /api/revenue-types/{id}` for an id that does not exist THEN the
    system SHALL respond `404 Not Found`.
13. The system SHALL generate each revenue type's `id` as a server-side UUID; a client-supplied
    `id` in the request body SHALL be ignored.
14. The system SHALL ensure, via a database migration applied on startup, that the 6 standard
    revenue types (`Saldo Disponível`, `Salário Próprio`, `Salário Cônjuge`,
    `Vale Refeição/Alimentação`, `Estorno`, `Resgate de Aplicação`) exist without any client
    request.

**Independent Test**: On a fresh database, confirm via `GET /api/revenue-types` that the 6 seeded
types are present. Create a new type (e.g. name "Prêmio") via `POST`, confirm it appears via
`GET /api/revenue-types` and `GET /api/revenue-types/{id}`, change its name via `PUT`, confirm the
change via `GET`, then `DELETE` it and confirm a subsequent `GET` returns `404`. Also `PUT` one of
the 6 seeded types and confirm the update is accepted (no special protection).

---

## Edge Cases

- IF the same name is submitted with different casing (`"Prêmio"` vs `"PRÊMIO"`) or surrounding
  whitespace (`" Prêmio "`) THEN the system SHALL treat them as the same name for the uniqueness
  check (AC 4, AC 10).
- IF a `PUT` request submits the type's own current name unchanged THEN the system SHALL accept it
  (not a conflict with itself).
- IF a `PUT` or `DELETE` targets one of the 6 seeded types THEN the system SHALL process it exactly
  like any other record (no protection), per the discuss decision.
- IF `name` is exactly 100 characters after trim THEN the system SHALL accept it (boundary of the
  valid range); 101 characters SHALL be rejected (AC 3).

---

## Requirement Traceability

| Requirement ID | Story | Acceptance Criteria | Phase | Status |
| --- | --- | --- | --- | ------- |
| REV-01 | P1: Manage Revenue Types | Create (AC 1-4, 13) | Tasks | Pending |
| REV-02 | P1: Manage Revenue Types | List (AC 5) | Tasks | Pending |
| REV-03 | P1: Manage Revenue Types | Get by id (AC 6-7) | Tasks | Pending |
| REV-04 | P1: Manage Revenue Types | Update (AC 2-3, 8-10) | Tasks | Pending |
| REV-05 | P1: Manage Revenue Types | Delete (AC 11-12) | Tasks | Pending |
| REV-06 | P1: Manage Revenue Types | Seed data (AC 14) | Tasks | Pending |

**ID format:** `REV-NN`

**Status values:** Pending → In Design → In Tasks → Implementing → Verified

**Coverage:** 14 total ACs, 0 mapped to tasks yet, 0 unmapped.

---

## Sources

- User request in this session (chat, 2026-11-26): "Faremos agora nesse projeto um crud para os
  tipos de receita. A tabela pode ser bastante simples, uma tabela de domínio... [6 seed values]...
  Faça os endpoints, utilize TDD e cubra todos os cenários com teste de aceitação" - settles the
  entity's shape (single-field domain table), the 6 seed values and their order, full CRUD, TDD,
  and the requirement for acceptance tests.
- Discuss answers in this session (2026-11-26): name uniqueness, no seed-data protection, unit +
  acceptance testing strategy - settle the three product decisions above.
- `.specs/features/distribution-method/spec.md` and its implementation - precedent for the
  layered pattern (entity/repository/service/controller/exception/`GlobalExceptionHandler`) this
  feature reuses.

---

## Success Criteria

How we know the feature is successful:

- [ ] A client can create, list, fetch, update and delete a revenue type via the 5 documented
      endpoints, exactly as described in AC 1-13.
- [ ] The 6 standard revenue types exist on a fresh database with no manual step (AC 14).
- [ ] Invalid input (missing/blank name, name over 100 chars) is rejected with `400` and nothing is
      persisted.
- [ ] A duplicate name (case-insensitive, trim-insensitive) is rejected with `409` on both create
      and update.
- [ ] Every acceptance criterion has a unit test (mock verifications use explicit arguments or
      argument captors - never `any()`) **and** is exercised by the end-to-end acceptance suite
      against a real database.

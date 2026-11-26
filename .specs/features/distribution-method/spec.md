# Distribution Method Specification

**Approved**: 2026-11-26 - user: "Aprovar, pode implementar"

## Problem Statement

Users of money-trail-api need a way to define *how* their monthly income is split between
spending and investing (e.g. the "90/10 method": 90% to spend, 10% to invest). Today there is no
way to register, inspect, change or remove such a method. This is the first domain entity in the
app and the foundation that later features (expense tracking, investment goals) will build on.

## Goals

- [ ] A client can create, list, fetch by id, update and delete a distribution method through a REST API.
- [ ] Every distribution method always represents a complete split: spend % + investment % = 100.
- [ ] Invalid or duplicate input is rejected before anything is persisted.

## Out of Scope

Explicitly excluded. Documented to prevent scope creep.

| Feature | Reason |
| ------- | ------ |
| Linking a method to expenses, transactions or investment goals | Future feature; this spec only covers CRUD on the method itself |
| Authentication / authorization / per-user scoping | No auth system exists in the project yet (no security starter in `pom.xml`); the app is currently single-tenant |
| Soft delete / history of removed methods | Hard delete chosen for the MVP (see Assumptions) |
| Pagination on the list endpoint | Expected dataset is a handful of methods; add later if it grows |
| Marking one method as the user's "active" method | Not requested - this spec only covers managing the methods themselves |
| Decimal / fractional percentages (e.g. 33.33%) | Decided during discussion: integers only |

---

## Assumptions & Open Questions

Every ambiguity is resolved or recorded here - nothing is left silently unclear.

| Assumption / decision | Chosen default | Rationale | Confirmed? |
| --- | --- | --- | --- |
| Percentages must sum to 100 | `spendPercentage + investmentPercentage = 100`, enforced at service layer and as a DB CHECK constraint | User decision during discuss: a "distribution" method only makes sense as a complete split | y |
| Percentage precision | Integers only (`INTEGER`, 0-100 inclusive) | User decision during discuss | y |
| Title uniqueness | Unique, case-insensitive (`UNIQUE` index on `lower(title)`) | User decision during discuss | y |
| Delete semantics | Hard delete (row removed) | User decision during discuss: no other entity references this table yet | y |
| User / tenant scoping | None - table has no `user_id` column, entity is global | No auth infrastructure exists in the codebase yet (fact, not a product guess) | y |
| Title length bound | `VARCHAR(100)`, required, 1-100 chars after trim | Reasonable bound for a short label like "90/10"; prevents unbounded input | y |
| List ordering | Ordered by `created_at` ascending | Deterministic default absent any requested sort/filter | y |
| Validation error shape | Field-level failures (blank title, out-of-range percentage) use Spring's default `@Valid` 400 response; business-rule failures (sum ≠ 100) and 404/409 raised by the service layer return a small JSON body `{"status": <int>, "message": <string>}` via a `@RestControllerAdvice` | Reuses Spring's built-in mechanism for field validation instead of inventing a parallel shape; a minimal custom body for the cases Spring doesn't cover out of the box | y |

**Open questions:** none - all resolved or logged above.

---

## User Stories

### P1: Manage Distribution Methods ⭐ MVP

**User Story**: As a money-trail-api user, I want to create, view, update and delete my income
distribution methods so that I can define and later reuse how my income is split between spending
and investing.

**Why P1**: This is the first domain entity in the app; later features (goals, expense tracking)
depend on it existing. There is no smaller useful slice - a method that can be created but never
read, updated or deleted is not usable.

**Acceptance Criteria** (each line is one EARS pattern):

1. WHEN a client submits `POST /api/distribution-methods` with a non-blank `title`, and
   `spendPercentage` + `investmentPercentage` are integers between 0 and 100 that sum to 100, THEN
   the system SHALL create the distribution method and respond `201 Created` with the created
   resource and a `Location` header pointing to `GET /api/distribution-methods/{id}`.
2. IF a `POST` or `PUT` request has a missing or blank `title` THEN the system SHALL respond
   `400 Bad Request` and SHALL NOT persist any change.
3. IF a `POST` or `PUT` request has `spendPercentage` or `investmentPercentage` missing, non-integer,
   or outside the inclusive range 0-100 THEN the system SHALL respond `400 Bad Request` and SHALL
   NOT persist any change.
4. IF a `POST` or `PUT` request has `spendPercentage + investmentPercentage` not equal to 100 THEN
   the system SHALL respond `400 Bad Request` and SHALL NOT persist any change.
5. IF a `POST` request's `title` matches, case-insensitively, the title of an existing distribution
   method THEN the system SHALL respond `409 Conflict` and SHALL NOT create a new record.
6. WHEN a client submits `GET /api/distribution-methods` THEN the system SHALL respond `200 OK`
   with a JSON array of all distribution methods ordered by `createdAt` ascending, or an empty
   array when none exist.
7. WHEN a client submits `GET /api/distribution-methods/{id}` for an id that exists THEN the
   system SHALL respond `200 OK` with that distribution method.
8. IF a client submits `GET /api/distribution-methods/{id}` for an id that does not exist THEN the
   system SHALL respond `404 Not Found`.
9. WHEN a client submits `PUT /api/distribution-methods/{id}` for an id that exists, with a body
   that passes the checks in criteria 2-4, THEN the system SHALL update that method's `title`,
   `spendPercentage` and `investmentPercentage` and respond `200 OK` with the updated resource.
10. IF a client submits `PUT /api/distribution-methods/{id}` for an id that does not exist THEN the
    system SHALL respond `404 Not Found` and SHALL NOT create a record.
11. IF a `PUT` request's `title` matches, case-insensitively, the title of a *different* existing
    distribution method THEN the system SHALL respond `409 Conflict` and SHALL NOT update the
    record.
12. WHEN a client submits `DELETE /api/distribution-methods/{id}` for an id that exists THEN the
    system SHALL delete that distribution method and respond `204 No Content`.
13. IF a client submits `DELETE /api/distribution-methods/{id}` for an id that does not exist THEN
    the system SHALL respond `404 Not Found`.
14. The system SHALL generate each distribution method's `id` as a server-side UUID; a client-
    supplied `id` in the request body SHALL be ignored.

**Independent Test**: Create a method (e.g. title "90/10", spendPercentage 90, investmentPercentage
10) via `POST`, confirm it appears via `GET /api/distribution-methods` and
`GET /api/distribution-methods/{id}`, change its title via `PUT`, confirm the change via `GET`,
then `DELETE` it and confirm a subsequent `GET` returns `404`.

---

## Edge Cases

- IF `spendPercentage` is `0` and `investmentPercentage` is `100` (or vice-versa) THEN the system
  SHALL accept it (boundary of the valid range, sum is still 100).
- IF `spendPercentage` or `investmentPercentage` is negative, or greater than 100, THEN the system
  SHALL respond `400 Bad Request` (covered by AC 3).
- IF the same title is submitted with different casing (`"90/10"` vs `"90/10"` vs `"90/10 "` after
  trim) THEN the system SHALL treat them as the same title for the uniqueness check (AC 5, AC 11).
- IF a `PUT` request submits the method's own current title unchanged THEN the system SHALL accept
  it (not a conflict with itself).

---

## Requirement Traceability

| Requirement ID | Story | Acceptance Criteria | Phase | Status |
| --- | --- | --- | --- | ------- |
| DIST-01 | P1: Manage Distribution Methods | Create (AC 1-5, 14) | Tasks | Pending |
| DIST-02 | P1: Manage Distribution Methods | List (AC 6) | Tasks | Pending |
| DIST-03 | P1: Manage Distribution Methods | Get by id (AC 7-8) | Tasks | Pending |
| DIST-04 | P1: Manage Distribution Methods | Update (AC 2-4, 9-11) | Tasks | Pending |
| DIST-05 | P1: Manage Distribution Methods | Delete (AC 12-13) | Tasks | Pending |

**ID format:** `DIST-NN`

**Status values:** Pending → In Design → In Tasks → Implementing → Verified

**Coverage:** 14 total ACs, 0 mapped to tasks yet, 0 unmapped.

---

## Sources

- User request in this session (chat, 2026-11-26): "o primeiro [CRUD] será o método de distribuição
  de renda... título, quantidade para gasto no mês e quantidade para investimento" - settles the
  entity's shape (title + two percentages) and that it is a simple CRUD.
- Discuss answers in this session (2026-11-26): sum-to-100 rule, integer-only percentages, unique
  title, hard delete - settle the four product decisions above.

---

## Success Criteria

How we know the feature is successful:

- [ ] A client can create, list, fetch, update and delete a distribution method via the 5
      documented endpoints, exactly as described in AC 1-14.
- [ ] Invalid input (missing/blank title, out-of-range or non-integer percentage, sum ≠ 100) is
      rejected with `400` and nothing is persisted.
- [ ] A duplicate title (case-insensitive) is rejected with `409` on both create and update.
- [ ] Every acceptance criterion has a unit test, and mock verifications use explicit arguments or
      argument captors - never `any()`.

# Revenue Type Context

**Gathered:** 2026-11-26
**Spec:** `.specs/features/revenue-type/spec.md`
**Status:** Ready for design

---

## Feature Boundary

A CRUD REST API for "revenue types" (`tipos de receita`): a simple domain/lookup table with a
single `name` field, pre-seeded via migration with 6 fixed values, fully manageable (create, list,
get, update, delete) like any other record.

---

## Implementation Decisions

### Uniqueness

- `name` is unique, case-insensitive, trimmed - same rule as `distribution_methods.title`.
- A `POST`/`PUT` whose `name` matches an existing one (ignoring case/whitespace) returns
  `409 Conflict`; a `PUT` keeping the record's own current name is not a conflict with itself.

### Seed-data protection

- None. The 6 pre-seeded rows are ordinary records: `PUT`/`DELETE` work on them exactly as on any
  user-created row. No `is_system` flag, no extra column.

### Testing strategy

- Two layers, both via TDD:
  1. Unit tests (service + controller, Mockito mocks, no `any()`) - same shape as
     `DistributionMethodServiceTest` / `DistributionMethodControllerTest`.
  2. A new acceptance-test suite: `@SpringBootTest(webEnvironment = RANDOM_PORT)` +
     `TestRestTemplate` (or MockMvc with a full context) against the real Postgres instance
     already available locally (`docker-compose.yml`) and in CI (`.github/workflows/ci.yml`
     already starts a `postgres:17-alpine` service for `./mvnw -B verify`). Runs the Flyway
     migration for real and asserts the 6 seeded rows exist, then exercises every CRUD scenario
     end-to-end through HTTP.

---

## Specific References

- Entity/table shape and conventions mirror `distribution_methods`
  (`.specs/features/distribution-method/spec.md`, `src/main/java/com/moneytrail/api/distributionmethod/`).
- Seed values (exact Portuguese labels, insertion order): Saldo Disponível, Salário Próprio,
  Salário Cônjuge, Vale Refeição/Alimentação, Estorno, Resgate de Aplicação.

---

## Deferred Ideas

None - discussion stayed within feature scope.

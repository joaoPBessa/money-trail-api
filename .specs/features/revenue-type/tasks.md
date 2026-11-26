# Revenue Type Tasks

## Execution Protocol (MANDATORY -- do not skip)

Implement these tasks with the `tlc-spec-driven` skill: **activate it by name and follow its
Execute flow and Critical Rules.** Do not search for skill files by filesystem path. The skill is
the source of truth for the full flow (per-task cycle, sub-agent delegation, the walk,
check_proofs, the Verifier and the screens sub-agent).

**If the skill cannot be activated, STOP and tell the user - do not proceed without it.**

Each task below follows TDD per the user's explicit instruction: write the task's test(s) first
(red), implement the minimum to pass (green), then gate + commit. Mock verifications use explicit
arguments or `ArgumentCaptor` - never Mockito's `any()`.

---

**Spec**: `.specs/features/revenue-type/spec.md`
**Design**: skipped - standard layered Spring Boot CRUD (entity / repository / service /
controller), reusing the `distribution-method` pattern and its shared `GlobalExceptionHandler` /
`ApiError`. No architectural decision to record.
**Status**: Approved
**Approved**: 2026-11-26 - user: "Aprovado, pode seguir" (tasks)
**Build**: `./mvnw -B verify`

---

## Test Coverage Matrix

> Generated from codebase and spec - confirm before Execute. Guidelines found: none
> (no `AGENTS.md`/`CONTRIBUTING.md`/testing doc in the repo). Sampled
> `DistributionMethodServiceTest`/`DistributionMethodControllerTest` (standalone Mockito unit
> tests, no Spring context, no DB) as the existing floor, and `MoneyTrailApiApplicationTests`
> (`@SpringBootTest`, full context + real Postgres via Flyway) as the only full-context precedent.
> The user's explicit decision in this feature's discuss phase adds a second, acceptance-level
> layer on top of that floor - unit tests alone are not sufficient here.

| Code Layer | Required Test Type | Coverage Expectation | Location Pattern | Run Command |
| --- | --- | --- | --- | --- |
| Service (`RevenueTypeService`) | unit | All branches; 1:1 to spec AC 1-14 and the Edge Cases section | `src/test/java/com/moneytrail/api/revenuetype/RevenueTypeServiceTest.java` | `./mvnw -q test -Dtest=RevenueTypeServiceTest` |
| Controller (`RevenueTypeController`) | unit | Every endpoint: happy path + every 400/404/409 path from the spec's ACs | `src/test/java/com/moneytrail/api/revenuetype/RevenueTypeControllerTest.java` | `./mvnw -q test -Dtest=RevenueTypeControllerTest` |
| Acceptance (full stack, HTTP → real Postgres) | acceptance (e2e) | Every AC exercised end-to-end at least once, including the 6 seeded rows and the no-protection edge cases, via `@SpringBootTest` + `MockMvc` (real context, real Flyway-migrated DB, same thread so `@Transactional` rolls back each test) | `src/test/java/com/moneytrail/api/revenuetype/RevenueTypeAcceptanceTest.java` | `./mvnw -q test -Dtest=RevenueTypeAcceptanceTest` (needs Postgres reachable - `docker-compose up -d` locally, already provided by CI) |
| Repository (`RevenueTypeRepository`) | none | Thin Spring Data derived queries (`existsByNameIgnoreCase...`, `findAllByOrderByCreatedAtAsc`); exercised indirectly through the Service unit tests' mocked contract and directly by the acceptance suite | - | build gate only |
| Entity / migration (`RevenueType`, `V3__create_revenue_types_table.sql`) | none | Build gate only; also exercised by the acceptance suite's seed-data check | - | build gate only |

**Note on Repository/Entity scope:** same as `distribution-method` - DB-level constraints (unique
`lower(name)` index) are a safety net behind the Service-layer check, not separately unit-tested;
the acceptance suite does exercise the real constraint end-to-end (C30).

## Gate Check Commands

> Generated from codebase - confirm before Execute.

| Gate Level | When to Use | Command |
| --- | --- | --- |
| Quick | After a task with unit tests only (no DB needed) | `./mvnw -q test -Dtest=<TestClass>` |
| Acceptance | After T9 (needs Postgres reachable, e.g. `docker-compose up -d`) | `./mvnw -q test -Dtest=RevenueTypeAcceptanceTest` |
| Build | After a phase completes, or for migration/entity/repository/exception/DTO tasks with no dedicated test | `./mvnw -B verify` |

---

## Execution Plan

Phases are ordered and run sequentially - each phase completes before the next begins, and tasks
within a phase execute in order.

### Phase 1: Foundation

```
T1 → T2 → T3
```

### Phase 2: Core Implementation

```
T4 → T5
T2 → T6
T3 → T7
T4 → T7
T5 → T8
T6 → T8
T7 → T8
```

### Phase 3: Acceptance

```
T8 → T9
```

---

## Task Breakdown

### T1: Create the `revenue_types` migration with the 6 seeded rows

**What**: Add a Flyway migration creating the `revenue_types` table: `id UUID PRIMARY KEY DEFAULT
gen_random_uuid()`, `name VARCHAR(100) NOT NULL`, `created_at TIMESTAMPTZ NOT NULL DEFAULT now()`,
`updated_at TIMESTAMPTZ NOT NULL DEFAULT now()`; a unique index on `lower(name)`; then `INSERT`
the 6 standard types, in order: Saldo Disponível, Salário Próprio, Salário Cônjuge, Vale
Refeição/Alimentação, Estorno, Resgate de Aplicação.
**Where**: `src/main/resources/db/migration/V3__create_revenue_types_table.sql`
**Depends on**: None
**Reuses**: `V1__init.sql` (pgcrypto extension already enabled for `gen_random_uuid()`);
`V2__create_distribution_methods_table.sql` for column/index conventions
**Requirement**: REV-01, REV-02, REV-03, REV-04, REV-05 (schema), REV-06 (AC 14)

**Done when**:

- [x] Migration file follows the `V[N]__description.sql` naming convention from the README
- [x] Table, unique index and the 6 `INSERT` rows (exact Portuguese labels, exact order) are present
- [x] `./mvnw -B verify` passes (Flyway applies the migration on context load)

**Tests**: none (build gate only)
**Gate**: build

**Commit**: `feat(revenue-type): add revenue_types migration with seeded data`

---

### T2: Create the `RevenueType` entity

**What**: JPA entity mapping to `revenue_types`: `id` (`UUID`, generated), `name`,
`createdAt`/`updatedAt` (set via `@CreationTimestamp`/`@UpdateTimestamp`, never settable by
callers).
**Where**: `src/main/java/com/moneytrail/api/revenuetype/RevenueType.java`
**Depends on**: T1
**Reuses**: `DistributionMethod` entity shape/annotations as a style template
**Requirement**: REV-01, REV-02, REV-03, REV-04, REV-05 (schema), AC 13

**Done when**:

- [x] Entity maps every column from T1's migration with `ddl-auto: validate` passing (no schema
      mismatch)
- [x] `id` has no public setter the application code can call with a client-supplied value
- [x] `./mvnw -B verify` passes

**Tests**: none (build gate only)
**Gate**: build

**Commit**: `feat(revenue-type): add RevenueType entity`

---

### T3: Create `RevenueTypeRepository`

**What**: `Repository` interface extending `JpaRepository<RevenueType, UUID>` with
`existsByNameIgnoreCase(String name)`, `existsByNameIgnoreCaseAndIdNot(String name, UUID id)`, and
`findAllByOrderByCreatedAtAsc()`.
**Where**: `src/main/java/com/moneytrail/api/revenuetype/RevenueTypeRepository.java`
**Depends on**: T2
**Reuses**: Spring Data JPA derived query methods (no custom `@Query` needed), same pattern as
`DistributionMethodRepository`
**Requirement**: REV-01 (AC 4), REV-02 (AC 5), REV-04 (AC 10)

**Done when**:

- [x] The three derived query methods compile against the entity from T2
- [x] `./mvnw -B verify` passes

**Tests**: none (thin Spring Data derived queries; exercised via T7's mocked-repository unit tests
and T9's acceptance suite)
**Gate**: build

**Commit**: `feat(revenue-type): add RevenueTypeRepository`

---

### T4: Create the feature's exception types

**What**: Two unchecked exceptions: `RevenueTypeNotFoundException`,
`DuplicateRevenueTypeNameException` - each a thin `RuntimeException` subclass with a message
constructor. No "invalid" exception is needed here (unlike `distribution-method`'s percentage-sum
rule) - the only domain-only rule is name uniqueness; blank/length checks are pure bean validation
(400 via Spring's default handling), not a custom exception.
**Where**: `src/main/java/com/moneytrail/api/revenuetype/exception/RevenueTypeNotFoundException.java`,
`src/main/java/com/moneytrail/api/revenuetype/exception/DuplicateRevenueTypeNameException.java`
**Depends on**: None
**Reuses**: `distribution-method`'s exception shape as a style template
**Requirement**: REV-01 (AC 4), REV-03 (AC 7), REV-04 (AC 9, AC 10), REV-05 (AC 12)

**Done when**:

- [x] Both exceptions exist with a single `String message` constructor
- [x] `./mvnw -B verify` passes

**Tests**: none (exercised by T7's service tests asserting the exception is thrown, and by T8's
controller tests asserting the HTTP mapping)
**Gate**: build

**Commit**: `feat(revenue-type): add domain exception types`

---

### T5: Map exceptions to HTTP responses

**What**: Extend the existing `GlobalExceptionHandler` (shared, in `com.moneytrail.api.error`) with
two more `@ExceptionHandler` methods: `RevenueTypeNotFoundException` → 404,
`DuplicateRevenueTypeNameException` → 409, each returning the existing `ApiError` body. No new
error-shape type is introduced.
**Where**: `src/main/java/com/moneytrail/api/error/GlobalExceptionHandler.java` (modify)
**Depends on**: T4
**Reuses**: `ApiError` record and `GlobalExceptionHandler` class already added for
`distribution-method`
**Requirement**: REV-01 (AC 4), REV-03 (AC 7), REV-04 (AC 9, AC 10), REV-05 (AC 12)

**Done when**:

- [x] `GlobalExceptionHandler` has one `@ExceptionHandler` per exception from T4, returning the
      correct status and an `ApiError` body
- [x] The existing `distribution-method` exception handlers are untouched
- [x] `./mvnw -B verify` passes

**Tests**: none (exercised by T8's controller tests and T9's acceptance suite, which trigger each
exception and assert the resulting status + body)
**Gate**: build

**Commit**: `feat(revenue-type): map domain exceptions to HTTP responses`

---

### T6: Create the request/response DTOs

**What**: `RevenueTypeRequest` (`name` with `@NotBlank @Size(max = 100)`) and
`RevenueTypeResponse` (`id`, `name`, `createdAt`, `updatedAt`), both as Java records. `name` is the
only field on the request - there is no `id` field, so a client-supplied id has nothing to bind to
(satisfies AC 13 structurally).
**Where**: `src/main/java/com/moneytrail/api/revenuetype/dto/RevenueTypeRequest.java`,
`src/main/java/com/moneytrail/api/revenuetype/dto/RevenueTypeResponse.java`
**Depends on**: T2
**Reuses**: `RevenueType` field names/types from T2 for the response mapping;
`DistributionMethodRequest`/`Response` as a style template
**Requirement**: REV-01 (AC 2, 3), REV-02, REV-03, REV-04 (AC 2, 3)

**Done when**:

- [x] `RevenueTypeRequest` carries the bean-validation annotations listed above
- [x] `RevenueTypeResponse` exposes every field a client needs to display the type
- [x] `./mvnw -B verify` passes

**Tests**: none (the bean-validation annotations are exercised by T8's controller tests and T9's
acceptance suite, which assert the resulting 400)
**Gate**: build

**Commit**: `feat(revenue-type): add request and response DTOs`

---

### T7: Create `RevenueTypeService`

**What**: `RevenueTypeService` interface + `RevenueTypeServiceImpl` with `create(String name)`,
`findAll()`, `findById(UUID id)`, `update(UUID id, String name)`, `delete(UUID id)`. Business
rules: name must be unique case-insensitively (trimmed), excluding the record's own current name
on update (else `DuplicateRevenueTypeNameException`); id must exist for
`findById`/`update`/`delete` (else `RevenueTypeNotFoundException`). No protection on the 6 seeded
rows - they are handled identically to any other row.
**Where**: `src/main/java/com/moneytrail/api/revenuetype/RevenueTypeService.java`,
`src/main/java/com/moneytrail/api/revenuetype/RevenueTypeServiceImpl.java`
**Depends on**: T3, T4
**Reuses**: `RevenueTypeRepository` from T3, exception types from T4
**Requirement**: REV-01, REV-02, REV-03, REV-04, REV-05

**Done when**:

- [x] Every branch in **What** has a passing unit test in `RevenueTypeServiceTest`, with the
      repository mocked via Mockito and every `verify(...)` call using an explicit argument or an
      `ArgumentCaptor` - never `any()`
- [x] Test count: 12 tests pass (S1-S12 below; no silent deletions)
- [x] `./mvnw -q test -Dtest=RevenueTypeServiceTest` passes

**Tests**: unit
**Gate**: quick

**Commit**: `feat(revenue-type): add RevenueTypeService`

---

### T8: Create `RevenueTypeController`

**What**: `@RestController` at `/api/revenue-types` with `POST` (create, 201 + `Location`), `GET`
(list, 200), `GET /{id}` (200/404), `PUT /{id}` (200/404/409), `DELETE /{id}` (204/404), delegating
to `RevenueTypeService` and mapping `RevenueTypeRequest` / `RevenueTypeResponse`.
**Where**: `src/main/java/com/moneytrail/api/revenuetype/RevenueTypeController.java`
**Depends on**: T5, T6, T7
**Reuses**: `RevenueTypeService` from T7, DTOs from T6, `GlobalExceptionHandler` from T5
**Requirement**: REV-01, REV-02, REV-03, REV-04, REV-05

**Done when**:

- [ ] All 5 endpoints exist with the exact status codes from the spec's AC 1-12
- [ ] Every endpoint has a passing unit test in `RevenueTypeControllerTest` (standalone MockMvc +
      Mockito-mocked service, no Spring context - same style as
      `DistributionMethodControllerTest`), with every `verify(...)` call using an explicit
      argument or an `ArgumentCaptor` - never `any()`
- [ ] Test count: 13 tests pass (C1-C13 below; no silent deletions)
- [ ] `./mvnw -q test -Dtest=RevenueTypeControllerTest` passes
- [ ] `./mvnw -B verify` passes (full build gate, end of Phase 2)

**Tests**: unit
**Gate**: quick, then build (phase completion)

**Commit**: `feat(revenue-type): add RevenueTypeController`

---

### T9: Create the `RevenueTypeAcceptanceTest` suite

**What**: An acceptance-test class using `@SpringBootTest(webEnvironment =
SpringBootTest.WebEnvironment.MOCK)` + `@AutoConfigureMockMvc` + `@Transactional` (so each test
runs in the real Spring context against the real Postgres instance, through the full
controller→service→repository→DB stack, and rolls back after each test, leaving only the 6
migration-seeded rows). Exercises every AC end-to-end at least once: the seeded rows, the full
create/list/get/update/delete lifecycle, every 400/404/409 branch, and the two no-protection edge
cases (editing/deleting a seeded row).
**Where**: `src/test/java/com/moneytrail/api/revenuetype/RevenueTypeAcceptanceTest.java`
**Depends on**: T8
**Reuses**: the full stack built in T1-T8; no mocks - this is the one test class in the feature
that talks to a real database
**Requirement**: REV-01, REV-02, REV-03, REV-04, REV-05, REV-06

**Done when**:

- [ ] Postgres is reachable (`docker-compose up -d` locally; already provided as a CI service) and
      `./mvnw -q test -Dtest=RevenueTypeAcceptanceTest` passes against it
- [ ] Every scenario in **What** has a passing test, named A1-A15 below (no silent deletions):
      Test count: 15 tests pass
- [ ] `./mvnw -B verify` passes (full build gate, end of Phase 3 - feature complete)

**Tests**: acceptance (e2e)
**Gate**: acceptance, then build (phase completion)

**Commit**: `test(revenue-type): add end-to-end acceptance suite`

---

## Checks

**Build**: `./mvnw -B verify`

**Note on proofs:** same as `distribution-method` - Maven Surefire prints no per-test console line
on a pass, so each check below is a lone proof targeting exactly one test method with
`-Dtest=Class#method -DfailIfNoTests=true`, which makes Maven fail (non-zero exit) when the filter
matches no test, so a renamed or typo'd method name is caught.

### Service layer (`RevenueTypeServiceTest`)

**C1** - Creating a type with a unique name is saved with a server-generated id (REV-01, AC 1, AC 13)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#create_savesAndReturnsType_whenValidAndNameUnique`

**C2** - A name matching an existing one case-insensitively is rejected on create (REV-01, AC 4)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#create_throwsDuplicate_whenNameExistsCaseInsensitive`

**C3** - A name differing only by whitespace is treated as duplicate on create (REV-01, Edge Cases)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#create_throwsDuplicate_whenNameDiffersOnlyByWhitespace`

**C4** - Listing returns every type ordered by `createdAt` ascending (REV-02, AC 5)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#findAll_returnsAllOrderedByCreatedAtAscending`

**C5** - Fetching an existing id returns that type (REV-03, AC 6)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#findById_returnsType_whenExists`

**C6** - Fetching a missing id raises not-found (REV-03, AC 7)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#findById_throwsNotFound_whenIdMissing`

**C7** - Updating an existing type with a valid body saves the new name (REV-04, AC 8)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#update_savesChangesAndReturnsType_whenExistsAndValid`

**C8** - Updating a missing id raises not-found, nothing is saved (REV-04, AC 9)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#update_throwsNotFound_whenIdMissing`

**C9** - Updating to a name used by a *different* type raises duplicate (REV-04, AC 10)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#update_throwsDuplicate_whenNameUsedByDifferentType`

**C10** - Updating a type while keeping its own current name is accepted (REV-04, Edge Cases)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#update_allowsSameTypeKeepingItsOwnName`

**C11** - Deleting an existing type removes it (REV-05, AC 11)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#delete_removesType_whenExists`

**C12** - Deleting a missing id raises not-found (REV-05, AC 12)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeServiceTest#delete_throwsNotFound_whenIdMissing`

### Controller layer (`RevenueTypeControllerTest`)

**C13** - `POST` with a valid body responds 201 with a `Location` header pointing at the created
resource (REV-01, AC 1)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#createType_returns201WithLocationHeader_whenServiceSucceeds`

**C14** - `POST`/`PUT` with a blank name responds 400 (REV-01/04, AC 2)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#createType_returns400_whenNameBlank`

**C15** - `POST`/`PUT` with a name over 100 characters responds 400 (REV-01/04, AC 3)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#createType_returns400_whenNameTooLong`

**C16** - `POST` responds 409 when the service rejects a duplicate name (REV-01, AC 4)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#createType_returns409_whenServiceThrowsDuplicate`

**C17** - `GET` (list) responds 200 with every type (REV-02, AC 5)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#listTypes_returns200WithAllTypes_whenServiceReturnsThem`

**C18** - `GET` (list) responds 200 with an empty array when none exist (REV-02, AC 5)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#listTypes_returns200WithEmptyArray_whenNoneExist`

**C19** - `GET /{id}` responds 200 with the type when it exists (REV-03, AC 6)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#getType_returns200WithBody_whenExists`

**C20** - `GET /{id}` responds 404 when the id doesn't exist (REV-03, AC 7)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#getType_returns404_whenServiceThrowsNotFound`

**C21** - `PUT /{id}` responds 200 with the updated type when it succeeds (REV-04, AC 8)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#updateType_returns200WithUpdatedBody_whenServiceSucceeds`

**C22** - `PUT /{id}` responds 404 when the id doesn't exist (REV-04, AC 9)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#updateType_returns404_whenServiceThrowsNotFound`

**C23** - `PUT /{id}` responds 409 when the service rejects a duplicate name (REV-04, AC 10)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#updateType_returns409_whenServiceThrowsDuplicate`

**C24** - `DELETE /{id}` responds 204 when the id exists (REV-05, AC 11)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#deleteType_returns204_whenServiceSucceeds`

**C25** - `DELETE /{id}` responds 404 when the id doesn't exist (REV-05, AC 12)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeControllerTest#deleteType_returns404_whenServiceThrowsNotFound`

### Acceptance layer (`RevenueTypeAcceptanceTest`, real Postgres end-to-end)

**C26** - A fresh database contains the 6 seeded revenue types, in order (REV-06, AC 14)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#freshDatabase_containsSixSeededRevenueTypes`

**C27** - Creating a revenue type end-to-end persists it and responds 201 with a `Location` header
(REV-01, AC 1, AC 13)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#createRevenueType_persistsAndReturns201WithLocation`

**C28** - Creating with a blank name responds 400 end-to-end, nothing persisted (REV-01, AC 2)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#createRevenueType_returns400_whenNameBlank`

**C29** - Creating with a name over 100 characters responds 400 end-to-end (REV-01, AC 3)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#createRevenueType_returns400_whenNameExceeds100Chars`

**C30** - Creating with a name duplicating an existing one (case-insensitive) responds 409
end-to-end against the real unique index, nothing new persisted (REV-01, AC 4)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#createRevenueType_returns409_whenNameDuplicatesExistingCaseInsensitive`

**C31** - Listing end-to-end returns every persisted type (REV-02, AC 5)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#listRevenueTypes_returns200WithAllPersistedTypes`

**C32** - Fetching an existing id end-to-end responds 200 with that type (REV-03, AC 6)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#getRevenueType_returns200_whenExists`

**C33** - Fetching a missing id end-to-end responds 404 (REV-03, AC 7)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#getRevenueType_returns404_whenMissing`

**C34** - Updating end-to-end persists the new name and responds 200 (REV-04, AC 8)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#updateRevenueType_returns200AndPersistsChange_whenValid`

**C35** - Updating a missing id end-to-end responds 404, nothing created (REV-04, AC 9)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#updateRevenueType_returns404_whenIdMissing`

**C36** - Updating to a name used by a different type end-to-end responds 409 (REV-04, AC 10)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#updateRevenueType_returns409_whenNameDuplicatesDifferentType`

**C37** - Updating one of the 6 seeded types end-to-end is accepted with no protection (REV-04,
Edge Cases)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#updateASeededType_isAcceptedWithNoProtection`

**C38** - Deleting end-to-end removes the record and responds 204 (REV-05, AC 11)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#deleteRevenueType_returns204AndRemovesRecord_whenExists`

**C39** - Deleting a missing id end-to-end responds 404 (REV-05, AC 12)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#deleteRevenueType_returns404_whenIdMissing`

**C40** - Deleting one of the 6 seeded types end-to-end is accepted with no protection (REV-05,
Edge Cases)
Proof: `./mvnw -q test -DfailIfNoTests=true -Dtest=RevenueTypeAcceptanceTest#deleteASeededType_isAcceptedWithNoProtection`

---

## Handoff

The feature's live state, written as it happens - a compaction gives no warning.

**Settled mid-build:** none yet
**Dispatched:** none yet
**Walked:** none yet (REST API only, no screens)

---

## Phase Execution Map

```
Phase 1 → Phase 2 → Phase 3

Phase 1:  T1 ------→ T2 ------→ T3
Phase 2:  T4 ------→ T5
          T2 ------→ T6
          T3 ------→ T7
          T4 ------→ T7
          T5 ------→ T8
          T6 ------→ T8
          T7 ------→ T8
Phase 3:  T8 ------→ T9
```

Execution is strictly sequential. 9 tasks total: just over the ~8-task single-batch threshold, so
the sub-agent offer is presented before Execute begins (batch split at the Phase 2/Phase 3
boundary: Phase 1 + Phase 2 = 8 tasks, Phase 3 = 1 task) - the user may decline and run it inline.

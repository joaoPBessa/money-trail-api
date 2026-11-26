# Distribution Method Tasks

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

**Spec**: `.specs/features/distribution-method/spec.md`
**Design**: skipped - standard layered Spring Boot CRUD (entity / repository / service /
controller), no architectural decision to record.
**Status**: Approved
**Approved**: 2026-11-26 - user: "Aprovar, pode implementar"
**Build**: `./mvnw -B verify`
**Run service**: `./mvnw -q test -Dtest=DistributionMethodServiceTest`
**Run controller**: `./mvnw -q test -Dtest=DistributionMethodControllerTest`

---

## Test Coverage Matrix

> Generated from codebase and spec - confirm before Execute. Guidelines found: none (no
> `AGENTS.md`/`CONTRIBUTING.md`/testing doc in the repo). Strong defaults applied, scoped to the
> user's explicit instruction for this feature: unit tests only (TDD, no `any()`). The only
> existing test (`MoneyTrailApiApplicationTests`) is a context-load smoke test and sets no layer
> convention to sample from.

| Code Layer | Required Test Type | Coverage Expectation | Location Pattern | Run Command |
| --- | --- | --- | --- | --- |
| Service (`DistributionMethodService`) | unit | All branches; 1:1 to spec AC 1-14 and the Edge Cases section | `src/test/java/com/moneytrail/api/distributionmethod/DistributionMethodServiceTest.java` | `./mvnw -q test -Dtest=DistributionMethodServiceTest` |
| Controller (`DistributionMethodController`) | unit | Every endpoint: happy path + every 400/404/409 path from the spec's ACs | `src/test/java/com/moneytrail/api/distributionmethod/DistributionMethodControllerTest.java` | `./mvnw -q test -Dtest=DistributionMethodControllerTest` |
| Repository (`DistributionMethodRepository`) | none | Thin Spring Data derived queries (`existsByTitleIgnoreCase...`, `findAllByOrderByCreatedAtAsc`); exercised indirectly through the Service unit tests' mocked contract and by the Build gate | - | build gate only |
| Entity / migration (`DistributionMethod`, `V2__create_distribution_methods_table.sql`) | none | Build gate only (application context load + Flyway migration apply); DB `CHECK`/`UNIQUE` constraints are a structural safety net behind the service-level checks, not separately tested | - | build gate only |

**Note on Repository/Entity scope:** this leaves the DB-level constraints (`CHECK sum = 100`,
unique `lower(title)` index) unverified by an automated test - they are a safety net behind the
Service-layer checks, which *are* tested. If DB-level coverage (e.g. a `@DataJpaTest` asserting a
raw constraint violation) turns out to matter, it is a one-task addition; flagged here rather than
decided silently.

## Gate Check Commands

> Generated from codebase - confirm before Execute.

| Gate Level | When to Use | Command |
| --- | --- | --- |
| Quick | After a task with unit tests only | `./mvnw -q test -Dtest=<TestClass>` |
| Build | After a phase completes, or for entity/migration/repository/DTO/exception tasks with no dedicated test | `./mvnw -B verify` |

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

---

## Task Breakdown

### T1: Create the `distribution_methods` migration

**What**: Add a Flyway migration creating the `distribution_methods` table: `id UUID PRIMARY KEY
DEFAULT gen_random_uuid()`, `title VARCHAR(100) NOT NULL`, `spend_percentage INTEGER NOT NULL`,
`investment_percentage INTEGER NOT NULL`, `created_at TIMESTAMPTZ NOT NULL DEFAULT now()`,
`updated_at TIMESTAMPTZ NOT NULL DEFAULT now()`; a unique index on `lower(title)`; `CHECK`
constraints for `0 <= spend_percentage <= 100`, `0 <= investment_percentage <= 100`, and
`spend_percentage + investment_percentage = 100`.
**Where**: `src/main/resources/db/migration/V2__create_distribution_methods_table.sql`
**Depends on**: None
**Reuses**: `V1__init.sql` (pgcrypto extension already enabled for `gen_random_uuid()`)
**Requirement**: DIST-01, DIST-02, DIST-03, DIST-04, DIST-05 (schema)

**Done when**:

- [x] Migration file follows the `V[N]__description.sql` naming convention from the README
- [x] All columns, the unique index and the three `CHECK` constraints are present
- [x] `./mvnw -B verify` passes (Flyway applies the migration on context load)

**Tests**: none (build gate only)
**Gate**: build

**Commit**: `feat(distribution-method): add distribution_methods migration`

---

### T2: Create the `DistributionMethod` entity

**What**: JPA entity mapping to `distribution_methods`: `id` (`UUID`, generated), `title`,
`spendPercentage`, `investmentPercentage`, `createdAt`/`updatedAt` (set via
`@CreationTimestamp`/`@UpdateTimestamp`, never settable by callers).
**Where**: `src/main/java/com/moneytrail/api/distributionmethod/DistributionMethod.java`
**Depends on**: T1
**Reuses**: none (first entity in the project)
**Requirement**: DIST-01, DIST-02, DIST-03, DIST-04, DIST-05 (schema), AC 14

**Done when**:

- [x] Entity maps every column from T1's migration with `ddl-auto: validate` passing (no schema
      mismatch)
- [x] `id` has no public setter the application code can call with a client-supplied value
- [x] `./mvnw -B verify` passes

**Tests**: none (build gate only)
**Gate**: build

**Commit**: `feat(distribution-method): add DistributionMethod entity`

---

### T3: Create `DistributionMethodRepository`

**What**: `Repository` interface extending `JpaRepository<DistributionMethod, UUID>` with
`existsByTitleIgnoreCase(String title)`,
`existsByTitleIgnoreCaseAndIdNot(String title, UUID id)`, and
`findAllByOrderByCreatedAtAsc()`.
**Where**: `src/main/java/com/moneytrail/api/distributionmethod/DistributionMethodRepository.java`
**Depends on**: T2
**Reuses**: Spring Data JPA derived query methods (no custom `@Query` needed)
**Requirement**: DIST-01 (AC 5), DIST-02 (AC 6), DIST-04 (AC 11)

**Done when**:

- [ ] The three derived query methods compile against the entity from T2
- [ ] `./mvnw -B verify` passes

**Tests**: none (thin Spring Data derived queries; exercised via T7's mocked-repository unit
tests and the Build gate)
**Gate**: build

**Commit**: `feat(distribution-method): add DistributionMethodRepository`

---

### T4: Create the feature's exception types

**What**: Three unchecked exceptions: `DistributionMethodNotFoundException`,
`DuplicateDistributionMethodTitleException`, `InvalidDistributionMethodException` - each a thin
`RuntimeException` subclass with a message constructor.
**Where**: `src/main/java/com/moneytrail/api/distributionmethod/exception/DistributionMethodNotFoundException.java`,
`src/main/java/com/moneytrail/api/distributionmethod/exception/DuplicateDistributionMethodTitleException.java`,
`src/main/java/com/moneytrail/api/distributionmethod/exception/InvalidDistributionMethodException.java`
**Depends on**: None
**Reuses**: none
**Requirement**: DIST-01 (AC 4, 5), DIST-03 (AC 8), DIST-04 (AC 10, 11), DIST-05 (AC 13)

**Done when**:

- [ ] All three exceptions exist with a single `String message` constructor
- [ ] `./mvnw -B verify` passes

**Tests**: none (exercised by T7's service tests asserting the exception is thrown, and by T8's
controller tests asserting the HTTP mapping - this is a merge-forward: the types can't be
meaningfully tested until something throws and catches them)
**Gate**: build

**Commit**: `feat(distribution-method): add domain exception types`

---

### T5: Map exceptions to HTTP responses

**What**: `ApiError` record (`status: int`, `message: String`) and a `@RestControllerAdvice`
`GlobalExceptionHandler` mapping `DistributionMethodNotFoundException` → 404,
`DuplicateDistributionMethodTitleException` → 409, `InvalidDistributionMethodException` → 400,
each with an `ApiError` body.
**Where**: `src/main/java/com/moneytrail/api/error/ApiError.java`,
`src/main/java/com/moneytrail/api/error/GlobalExceptionHandler.java`
**Depends on**: T4
**Reuses**: none (first cross-cutting error handler in the project; placed outside the feature
package so later features can reuse it)
**Requirement**: DIST-01 (AC 4, 5), DIST-03 (AC 8), DIST-04 (AC 10, 11), DIST-05 (AC 13)

**Done when**:

- [ ] `GlobalExceptionHandler` has one `@ExceptionHandler` per exception from T4, returning the
      correct status and an `ApiError` body
- [ ] `./mvnw -B verify` passes

**Tests**: none (exercised by T8's controller tests, which trigger each exception through the
mocked service and assert the resulting status + body)
**Gate**: build

**Commit**: `feat(distribution-method): map domain exceptions to HTTP responses`

---

### T6: Create the request/response DTOs

**What**: `DistributionMethodRequest` (`title` with `@NotBlank @Size(max = 100)`,
`spendPercentage` and `investmentPercentage` with `@NotNull @Min(0) @Max(100)`) and
`DistributionMethodResponse` (`id`, `title`, `spendPercentage`, `investmentPercentage`,
`createdAt`, `updatedAt`), both as Java records.
**Where**: `src/main/java/com/moneytrail/api/distributionmethod/dto/DistributionMethodRequest.java`,
`src/main/java/com/moneytrail/api/distributionmethod/dto/DistributionMethodResponse.java`
**Depends on**: T2
**Reuses**: `DistributionMethod` field names/types from T2 for the response mapping
**Requirement**: DIST-01 (AC 2, 3), DIST-02, DIST-03, DIST-04 (AC 2, 3)

**Done when**:

- [ ] `DistributionMethodRequest` carries the bean-validation annotations listed above
- [ ] `DistributionMethodResponse` exposes every field a client needs to display the method
- [ ] `./mvnw -B verify` passes

**Tests**: none (the bean-validation annotations are exercised by T8's controller tests, which
assert the resulting 400)
**Gate**: build

**Commit**: `feat(distribution-method): add request and response DTOs`

---

### T7: Create `DistributionMethodService`

**What**: `DistributionMethodService` interface + `DistributionMethodServiceImpl` with
`create(String title, int spendPercentage, int investmentPercentage)`, `findAll()`,
`findById(UUID id)`, `update(UUID id, String title, int spendPercentage, int investmentPercentage)`,
`delete(UUID id)`. Business rules: percentages must sum to 100 (else
`InvalidDistributionMethodException`); title must be unique case-insensitively, excluding the
record's own current title on update (else `DuplicateDistributionMethodTitleException`); id must
exist for `findById`/`update`/`delete` (else `DistributionMethodNotFoundException`).
**Where**: `src/main/java/com/moneytrail/api/distributionmethod/DistributionMethodService.java`,
`src/main/java/com/moneytrail/api/distributionmethod/DistributionMethodServiceImpl.java`
**Depends on**: T3, T4
**Reuses**: `DistributionMethodRepository` from T3, exception types from T4
**Requirement**: DIST-01, DIST-02, DIST-03, DIST-04, DIST-05

**Done when**:

- [ ] Every branch in **What** has a passing unit test in `DistributionMethodServiceTest`, with
      the repository mocked via Mockito and every `verify(...)` call using an explicit argument or
      an `ArgumentCaptor` - never `any()`
- [ ] Test count: 13 tests pass (S1-S13 below; no silent deletions)
- [ ] `./mvnw -q test -Dtest=DistributionMethodServiceTest` passes

**Tests**: unit
**Gate**: quick

**Commit**: `feat(distribution-method): add DistributionMethodService`

---

### T8: Create `DistributionMethodController`

**What**: `@RestController` at `/api/distribution-methods` with `POST` (create, 201 + `Location`),
`GET` (list, 200), `GET /{id}` (200/404), `PUT /{id}` (200/404/409), `DELETE /{id}` (204/404),
delegating to `DistributionMethodService` and mapping `DistributionMethodRequest` /
`DistributionMethodResponse`.
**Where**: `src/main/java/com/moneytrail/api/distributionmethod/DistributionMethodController.java`
**Depends on**: T5, T6, T7
**Reuses**: `DistributionMethodService` from T7, DTOs from T6, `GlobalExceptionHandler` from T5
**Requirement**: DIST-01, DIST-02, DIST-03, DIST-04, DIST-05

**Done when**:

- [ ] All 5 endpoints exist with the exact status codes from the spec's AC 1-13
- [ ] Every endpoint has a passing unit test in `DistributionMethodControllerTest` (MockMvc +
      Mockito-mocked service), with every `verify(...)` call using an explicit argument or an
      `ArgumentCaptor` - never `any()`
- [ ] Test count: 14 tests pass (C1-C14 below; no silent deletions)
- [ ] `./mvnw -q test -Dtest=DistributionMethodControllerTest` passes
- [ ] `./mvnw -B verify` passes (full build gate, end of Phase 2)

**Tests**: unit
**Gate**: quick, then build (phase completion)

**Commit**: `feat(distribution-method): add DistributionMethodController`

---

## Checks

**Run service**: `./mvnw -q test -Dtest=DistributionMethodServiceTest`
**Run controller**: `./mvnw -q test -Dtest=DistributionMethodControllerTest`
**Build**: `./mvnw -B verify`

**C1** - Creating a method with a unique title and percentages summing to 100 is saved with a
server-generated id (DIST-01, AC 1, AC 14)
Proof: run service | ✔ create_savesAndReturnsMethod_whenValidAndTitleUnique()

**C2** - Percentages not summing to 100 are rejected before persistence, on create (DIST-01, AC 4)
Proof: run service | ✔ create_throwsInvalid_whenPercentagesDoNotSumTo100()

**C3** - A title matching an existing one case-insensitively is rejected on create (DIST-01, AC 5)
Proof: run service | ✔ create_throwsDuplicate_whenTitleExistsCaseInsensitive()

**C4** - Listing returns every method ordered by `createdAt` ascending (DIST-02, AC 6)
Proof: run service | ✔ findAll_returnsAllOrderedByCreatedAtAscending()

**C5** - Fetching an existing id returns that method (DIST-03, AC 7)
Proof: run service | ✔ findById_returnsMethod_whenExists()

**C6** - Fetching a missing id raises not-found (DIST-03, AC 8)
Proof: run service | ✔ findById_throwsNotFound_whenIdMissing()

**C7** - Updating an existing method with a valid body saves the new values (DIST-04, AC 9)
Proof: run service | ✔ update_savesChangesAndReturnsMethod_whenExistsAndValid()

**C8** - Updating a missing id raises not-found, nothing is saved (DIST-04, AC 10)
Proof: run service | ✔ update_throwsNotFound_whenIdMissing()

**C9** - Updating to a title used by a *different* method raises duplicate (DIST-04, AC 11)
Proof: run service | ✔ update_throwsDuplicate_whenTitleUsedByDifferentMethod()

**C10** - Updating a method while keeping its own current title is accepted, not a duplicate of
itself (DIST-04, Edge Cases)
Proof: run service | ✔ update_allowsSameMethodKeepingItsOwnTitle()

**C11** - Updating with percentages not summing to 100 is rejected (DIST-04, AC 4)
Proof: run service | ✔ update_throwsInvalid_whenPercentagesDoNotSumTo100()

**C12** - Deleting an existing method removes it (DIST-05, AC 12)
Proof: run service | ✔ delete_removesMethod_whenExists()

**C13** - Deleting a missing id raises not-found (DIST-05, AC 13)
Proof: run service | ✔ delete_throwsNotFound_whenIdMissing()

**C14** - `POST` with a valid body responds 201 with a `Location` header pointing at the created
resource (DIST-01, AC 1)
Proof: run controller | ✔ createMethod_returns201WithLocationHeader_whenServiceSucceeds()

**C15** - `POST`/`PUT` with a blank title responds 400 (DIST-01/04, AC 2)
Proof: run controller | ✔ createMethod_returns400_whenTitleBlank()

**C16** - `POST`/`PUT` with an out-of-range percentage responds 400 (DIST-01/04, AC 3)
Proof: run controller | ✔ createMethod_returns400_whenPercentageOutOfRange()

**C17** - `POST` responds 400 when the service rejects the percentage sum (DIST-01, AC 4)
Proof: run controller | ✔ createMethod_returns400_whenServiceThrowsInvalid()

**C18** - `POST` responds 409 when the service rejects a duplicate title (DIST-01, AC 5)
Proof: run controller | ✔ createMethod_returns409_whenServiceThrowsDuplicate()

**C19** - `GET` (list) responds 200 with every method, and with an empty array when none exist
(DIST-02, AC 6)
Proof: run controller | ✔ listMethods_returns200WithEmptyArray_whenNoneExist()

**C20** - `GET /{id}` responds 200 with the method when it exists, 404 when it doesn't (DIST-03,
AC 7, AC 8)
Proof: run controller | ✔ getMethod_returns404_whenServiceThrowsNotFound()

**C21** - `PUT /{id}` responds 200 with the updated method, 404 when missing, 409 on duplicate
(DIST-04, AC 9, 10, 11)
Proof: run controller | ✔ updateMethod_returns200WithUpdatedBody_whenServiceSucceeds()

**C22** - `DELETE /{id}` responds 204 when it exists, 404 when missing (DIST-05, AC 12, AC 13)
Proof: run controller | ✔ deleteMethod_returns204_whenServiceSucceeds()

---

## Handoff

The feature's live state, written as it happens - a compaction gives no warning.

**Settled mid-build:** none yet - tasks not started
**Dispatched:** none - single batch (8 tasks), executed inline, no sub-agents
**Walked:** none yet

---

## Phase Execution Map

```
Phase 1 → Phase 2

Phase 1:  T1 ------→ T2 ------→ T3
Phase 2:  T4 ------→ T5
          T2 ------→ T6
          T3 ------→ T7
          T4 ------→ T7
          T5 ------→ T8
          T6 ------→ T8
          T7 ------→ T8
```

Execution is strictly sequential within a phase; T4 has no dependency on T1-T3 but is sequenced
into Phase 2 to keep the phase boundary at "schema done" vs. "application code." A single agent
works one task at a time, in order; with only 8 tasks total this runs inline, no sub-agent
delegation offered.

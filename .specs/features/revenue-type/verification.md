# Revenue Type verification

**Verdict**: PASS
**Proofs**: `proofs.md` at 85d5ac5 (round 1 at 62d9ad1 found the 2 findings below; round 2 at 85d5ac5 is green with the fixes and C41/C42 added)
**Verifier**: independent sub-agent (author != verifier); round-2 proof and the C41/C42 rows above added by the orchestrator per validate.md ("no second Verifier")

## Checks

| Check | Test | Holds |
| --- | --- | --- |
| C1 | `RevenueTypeServiceTest#create_savesAndReturnsType_whenValidAndNameUnique` | yes |
| C2 | `RevenueTypeServiceTest#create_throwsDuplicate_whenNameExistsCaseInsensitive` | yes |
| C3 | `RevenueTypeServiceTest#create_throwsDuplicate_whenNameDiffersOnlyByWhitespace` | yes |
| C4 | `RevenueTypeServiceTest#findAll_returnsAllOrderedByCreatedAtAscending` | yes |
| C5 | `RevenueTypeServiceTest#findById_returnsType_whenExists` | yes |
| C6 | `RevenueTypeServiceTest#findById_throwsNotFound_whenIdMissing` | yes |
| C7 | `RevenueTypeServiceTest#update_savesChangesAndReturnsType_whenExistsAndValid` | yes |
| C8 | `RevenueTypeServiceTest#update_throwsNotFound_whenIdMissing` | yes |
| C9 | `RevenueTypeServiceTest#update_throwsDuplicate_whenNameUsedByDifferentType` | yes |
| C10 | `RevenueTypeServiceTest#update_allowsSameTypeKeepingItsOwnName` | yes |
| C11 | `RevenueTypeServiceTest#delete_removesType_whenExists` | yes |
| C12 | `RevenueTypeServiceTest#delete_throwsNotFound_whenIdMissing` | yes |
| C13 | `RevenueTypeControllerTest#createType_returns201WithLocationHeader_whenServiceSucceeds` | yes |
| C14 | `RevenueTypeControllerTest#createType_returns400_whenNameBlank` | yes |
| C15 | `RevenueTypeControllerTest#createType_returns400_whenNameTooLong` | yes - but only probes the 101-raw-char case; see Finding 1 |
| C16 | `RevenueTypeControllerTest#createType_returns409_whenServiceThrowsDuplicate` | yes |
| C17 | `RevenueTypeControllerTest#listTypes_returns200WithAllTypes_whenServiceReturnsThem` | yes |
| C18 | `RevenueTypeControllerTest#listTypes_returns200WithEmptyArray_whenNoneExist` | yes |
| C19 | `RevenueTypeControllerTest#getType_returns200WithBody_whenExists` | yes |
| C20 | `RevenueTypeControllerTest#getType_returns404_whenServiceThrowsNotFound` | yes |
| C21 | `RevenueTypeControllerTest#updateType_returns200WithUpdatedBody_whenServiceSucceeds` | yes |
| C22 | `RevenueTypeControllerTest#updateType_returns404_whenServiceThrowsNotFound` | yes |
| C23 | `RevenueTypeControllerTest#updateType_returns409_whenServiceThrowsDuplicate` | yes |
| C24 | `RevenueTypeControllerTest#deleteType_returns204_whenServiceSucceeds` | yes |
| C25 | `RevenueTypeControllerTest#deleteType_returns404_whenServiceThrowsNotFound` | yes |
| C26 | `RevenueTypeAcceptanceTest#freshDatabase_containsSixSeededRevenueTypes` | yes |
| C27 | `RevenueTypeAcceptanceTest#createRevenueType_persistsAndReturns201WithLocation` | yes |
| C28 | `RevenueTypeAcceptanceTest#createRevenueType_returns400_whenNameBlank` | yes |
| C29 | `RevenueTypeAcceptanceTest#createRevenueType_returns400_whenNameExceeds100Chars` | yes - but only probes the 101-raw-char case; see Finding 1 |
| C30 | `RevenueTypeAcceptanceTest#createRevenueType_returns409_whenNameDuplicatesExistingCaseInsensitive` | yes |
| C31 | `RevenueTypeAcceptanceTest#listRevenueTypes_returns200WithAllPersistedTypes` | yes |
| C32 | `RevenueTypeAcceptanceTest#getRevenueType_returns200_whenExists` | yes |
| C33 | `RevenueTypeAcceptanceTest#getRevenueType_returns404_whenMissing` | yes |
| C34 | `RevenueTypeAcceptanceTest#updateRevenueType_returns200AndPersistsChange_whenValid` | yes |
| C35 | `RevenueTypeAcceptanceTest#updateRevenueType_returns404_whenIdMissing` | no - claim is "404 ... nothing created" but the test asserts only the status; it never checks `repository.count()`, unlike the sibling C28/C29 tests. See Finding 2 |
| C36 | `RevenueTypeAcceptanceTest#updateRevenueType_returns409_whenNameDuplicatesDifferentType` | yes |
| C37 | `RevenueTypeAcceptanceTest#updateASeededType_isAcceptedWithNoProtection` | yes - uses the seeded row "Resgate de Aplicação", looked up by name, confirmed persisted change |
| C38 | `RevenueTypeAcceptanceTest#deleteRevenueType_returns204AndRemovesRecord_whenExists` | yes |
| C39 | `RevenueTypeAcceptanceTest#deleteRevenueType_returns404_whenIdMissing` | yes |
| C40 | `RevenueTypeAcceptanceTest#deleteASeededType_isAcceptedWithNoProtection` | yes - uses the seeded row "Vale Refeição/Alimentação", looked up by name, confirmed removed |
| C41 | `RevenueTypeControllerTest#createType_returns201_whenNameTrimsToExactly100Chars` | yes - sends 102 raw chars (1 space + 100 `a` + 1 space), asserts 201 and the trimmed 100-char name in the response body; this is exactly the combination Finding 1 showed was broken before the fix |
| C42 | `RevenueTypeAcceptanceTest#createRevenueType_returns201_whenNameTrimsToExactly100Chars` | yes - same boundary end-to-end against real Postgres; asserts 201, the response body, and that the *persisted* row (via `repository.findById`) holds the trimmed 100-char value, not the raw 102-char one |

## Findings

| Finding | Evidence | Fix | Closed |
| --- | --- | --- | --- |
| AC3's edge case ("name exactly 100 chars after trim is accepted") is violated: `RevenueTypeRequest.name`'s `@Size(max = 100)` validates the raw, untrimmed request value, before `RevenueTypeServiceImpl` ever trims it. A name that is ≤100 chars after trim but >100 chars raw (e.g. padded with leading/trailing whitespace) is wrongly rejected with 400. Reproduced with a throwaway test (`VerifierProbeTest#create_nameWithWhitespacePaddingThatTrimsToExactly100_shouldBeAccepted`, deleted after the run, not committed): POST with `" " + "a".repeat(100) + " "` (102 raw / 100 trimmed chars) returned 400 instead of 201. No existing check probes this combination - C15 and C29 both use `"a".repeat(101)` with no surrounding whitespace, so the raw-vs-trimmed boundary is never exercised. | `src/main/java/com/moneytrail/api/revenuetype/dto/RevenueTypeRequest.java:6` (`@Size(max = 100)` on the raw field); confirmed failing via ad-hoc MockMvc run against real Postgres | Trim before validating - e.g. validate in the service against the already-trimmed name, or normalize the DTO field before Bean Validation runs (a custom validator, or trimming in a request pre-processing step) so length is judged "after trim" as AC3/Edge Cases require | 85d5ac5 - trimmed in `RevenueTypeRequest`'s compact constructor (before Bean Validation runs); added C41 (controller) and C42 (acceptance) |
| C35's test only asserts the HTTP status, not the "nothing created" half of its own claim | `src/test/java/com/moneytrail/api/revenuetype/RevenueTypeAcceptanceTest.java:147-153` (`updateRevenueType_returns404_whenIdMissing`) has no `repository.count()` assertion, unlike `createRevenueType_returns400_whenNameBlank`/`...NameExceeds100Chars` which do assert count is unchanged | Add `long countBefore = repository.count(); ...; assertThat(repository.count()).isEqualTo(countBefore);` to the test | 85d5ac5 - added the missing `repository.count()` before/after assertion to C35's test |

Everything else probed held: DTO has no `id` field (AC13 holds structurally), uniqueness is enforced in `RevenueTypeServiceImpl` (not just the DTO, so it can't be bypassed by a direct service call), `@Transactional` is present on `RevenueTypeAcceptanceTest` and rolls back writes, the `updateASeededType`/`deleteASeededType` tests genuinely use rows from the 6-row migration seed (not freshly-created rows), and a second own-example probe - renaming one seeded type ("Estorno") to match a *different* seeded type's name case-insensitively ("salário próprio") - correctly returned 409 and left the record unchanged.

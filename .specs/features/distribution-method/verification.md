# Distribution Method verification

**Verdict**: PASS
**Proofs**: `proofs.md` at d69478b (round 2; round 1 was at 5a995b7)
**Verifier**: independent sub-agent (author != verifier)
**Round**: 2

## Checks

| Check | Test | Holds |
| --- | --- | --- |
| C1 | `DistributionMethodServiceTest#create_savesAndReturnsMethod_whenValidAndTitleUnique` | yes |
| C2 | `DistributionMethodServiceTest#create_throwsInvalid_whenPercentagesDoNotSumTo100` | yes |
| C3 | `DistributionMethodServiceTest#create_throwsDuplicate_whenTitleExistsCaseInsensitive` | yes |
| C4 | `DistributionMethodServiceTest#findAll_returnsAllOrderedByCreatedAtAscending` | yes |
| C5 | `DistributionMethodServiceTest#findById_returnsMethod_whenExists` | yes |
| C6 | `DistributionMethodServiceTest#findById_throwsNotFound_whenIdMissing` | yes |
| C7 | `DistributionMethodServiceTest#update_savesChangesAndReturnsMethod_whenExistsAndValid` | yes |
| C8 | `DistributionMethodServiceTest#update_throwsNotFound_whenIdMissing` | yes |
| C9 | `DistributionMethodServiceTest#update_throwsDuplicate_whenTitleUsedByDifferentMethod` | yes |
| C10 | `DistributionMethodServiceTest#update_allowsSameMethodKeepingItsOwnTitle` | yes |
| C11 | `DistributionMethodServiceTest#update_throwsInvalid_whenPercentagesDoNotSumTo100` | yes |
| C12 | `DistributionMethodServiceTest#delete_removesMethod_whenExists` | yes |
| C13 | `DistributionMethodServiceTest#delete_throwsNotFound_whenIdMissing` | yes |
| C14 | `DistributionMethodControllerTest#createMethod_returns201WithLocationHeader_whenServiceSucceeds` | yes |
| C15 | `DistributionMethodControllerTest#createMethod_returns400_whenTitleBlank` | yes |
| C16 | `DistributionMethodControllerTest#createMethod_returns400_whenPercentageOutOfRange` | yes |
| C17 | `DistributionMethodControllerTest#createMethod_returns400_whenServiceThrowsInvalid` | yes |
| C18 | `DistributionMethodControllerTest#createMethod_returns409_whenServiceThrowsDuplicate` | yes |
| C19 | `DistributionMethodControllerTest#listMethods_returns200WithEmptyArray_whenNoneExist` | yes |
| C20 | `DistributionMethodControllerTest#getMethod_returns404_whenServiceThrowsNotFound` | yes - narrowed to the 404 branch only |
| C21 | `DistributionMethodControllerTest#updateMethod_returns200WithUpdatedBody_whenServiceSucceeds` | yes - narrowed to the 200 branch only |
| C22 | `DistributionMethodControllerTest#deleteMethod_returns204_whenServiceSucceeds` | yes - narrowed to the 204 branch only |
| C23 | `DistributionMethodControllerTest#getMethod_returns200WithBody_whenExists` | yes |
| C24 | `DistributionMethodControllerTest#updateMethod_returns404_whenServiceThrowsNotFound` | yes |
| C25 | `DistributionMethodControllerTest#updateMethod_returns409_whenServiceThrowsDuplicate` | yes |
| C26 | `DistributionMethodControllerTest#deleteMethod_returns404_whenServiceThrowsNotFound` | yes |
| C27 | `DistributionMethodServiceTest#create_throwsInvalid_whenPercentageOutOfRangeEvenIfSumIs100` | yes |
| C28 | `DistributionMethodServiceTest#create_throwsDuplicate_whenTitleDiffersOnlyByWhitespace` | yes |

## Findings

| Finding | Evidence | Fix | Closed |
| --- | --- | --- | --- |
| C20/C21/C22's single cited proof does not cover every status code the check's own one-line description claims | C20 cites only `getMethod_returns404_whenServiceThrowsNotFound` though its description claims both 200 and 404; the 200 case is actually tested by `getMethod_returns200WithBody_whenExists`, which exists in the file but isn't the cited proof. Same pattern for C21 (`updateMethod_returns404_...`, `updateMethod_returns409_...` exist but aren't cited) and C22 (`deleteMethod_returns404_...` exists but isn't cited) | Narrowed C20/C21/C22 to the single branch each already proves; added C23-C26 citing the previously-uncited tests for the other branches | d69478b |
| Title uniqueness is not whitespace-insensitive, contradicting the spec's Edge Cases section | spec.md's Edge Cases explicitly requires `"90/10"` and `"90/10 "` (after trim) to be treated as the same title for the uniqueness check (AC5, AC11). No code in `DistributionMethodServiceImpl`, `DistributionMethodRequest`, or `DistributionMethod` trims the title (confirmed via grep: no `.trim()`/`.strip()` anywhere under `src/main/java/com/moneytrail/api`); `existsByTitleIgnoreCase(AndIdNot)` and the DB's `lower(title)` unique index are case-insensitive but not whitespace-insensitive. A title of `" 90/10"` would be accepted as distinct from an existing `"90/10"`. None of the 22 checks submits a title with leading/trailing whitespace | `create`/`update` now trim the title before the uniqueness check and before persistence; added `create_throwsDuplicate_whenTitleDiffersOnlyByWhitespace` (C28) | d69478b |
| Service layer validates only the percentage sum, not each percentage's 0-100 range, so an out-of-range pair that still sums to 100 is accepted by application code | `DistributionMethodServiceImpl.validatePercentageSum` only checks `spendPercentage + investmentPercentage != 100`; it never checks each value is within `[0, 100]`. AC3's range requirement is enforced solely by `@Min(0) @Max(100)` on `DistributionMethodRequest`, i.e. only when the service is reached through the controller's `@Valid` DTO. The DB `CHECK` constraints are the only remaining backstop, and a violation there isn't mapped by `GlobalExceptionHandler` (which only handles the three domain exceptions), so it would surface as an unhandled 500 instead of the spec's 400. None of the 13 service tests (C1-C13) exercises an out-of-range-but-summing-to-100 pair (e.g. spendPercentage=-50, investmentPercentage=150) | Renamed `validatePercentageSum` to `validatePercentages`, added an explicit `0 <= x <= 100` range check before the sum check; added `create_throwsInvalid_whenPercentageOutOfRangeEvenIfSumIs100` (C27) | d69478b |

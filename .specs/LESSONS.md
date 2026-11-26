# LESSONS - auto-maintained by scripts/lessons.py

> Machine-owned. Do NOT hand-edit. Changes are overwritten on the next `lessons.py` write.
> Canonical state lives in `.specs/lessons.json`. Edit lessons only via the script.
> promote_threshold=2 distinct features · window_days=45 · quarantine_threshold=2

## Confirmed (load these at Plan/Checks)

Corroborated across multiple features. Safe to apply as guidance.

_none_

## Candidates (under observation - do NOT load as guidance yet)

Seen once or not yet corroborated. Tracked, not trusted.

### L-001 - When a check's one-line claim bundles multiple HTTP status codes for one endpoint, cite one test per status code (one check per branch) instead of a single proof - a single proof only covers the branch its named test exercises.
- signal: `weak_test` · recurrence: 1 feature(s) · scope: `api/checks` · harmful: 0
- features: distribution-method
- evidence: C20,C21,C22 (api/checks)
- last seen: 2026-11-26T17:49:29Z

### L-002 - A uniqueness rule stated as case-insensitive in the spec's Edge Cases often also implies whitespace-insensitive (trim before comparing and before persisting) - write that test explicitly, it is easy to miss.
- signal: `ac_gap` · recurrence: 1 feature(s) · scope: `domain/validation` · harmful: 0
- features: distribution-method
- evidence: AC5,AC11 (domain/validation)
- last seen: 2026-11-26T17:49:29Z

### L-003 - A business rule enforced only by the DTO's bean validation (e.g. @Min/@Max) is not enforced for callers that reach the service directly - duplicate range/bound checks at the service layer too, not just at the controller boundary.
- signal: `ac_gap` · recurrence: 1 feature(s) · scope: `domain/validation` · harmful: 0
- features: distribution-method
- evidence: AC3 (domain/validation)
- last seen: 2026-11-26T17:49:29Z

## Quarantined (failed when applied - ignore)

A confirmed lesson that recurred alongside failure. Kept for the maintainer to review.

_none_

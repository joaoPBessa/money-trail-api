# STATE

## Decisions

### AD-001
- **Decision**: Every new implementation starts on a new branch created from an up-to-date `main`, named after the feature being worked on (e.g. `feat/<feature-name>`) - never reusing a leftover branch (such as a prior scaffolding branch) whose name no longer matches what it contains.
- **Reason**: A branch named after work that already landed (e.g. `chore/project-scaffolding`) stops describing its contents once unrelated feature commits pile up on it, misleading reviewers and PR history about what the branch/PR actually changes.
- **Trade-off**: One extra `git checkout -b` per feature instead of continuing on whatever branch happens to be checked out; requires remembering to pull `main` first.
- **Scope**: Governs branch creation for every feature/fix going forward, in this repository.
- **Date**: 2026-11-26
- **Status**: active

## Handoff

None yet.

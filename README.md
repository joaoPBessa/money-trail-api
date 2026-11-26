# money-trail-api

A personal finance tracking API, built to help manage income, expenses, and
overall cash flow.

## Tech stack

- **Java 25**
- **Spring Boot 4.2.0** (Spring Web MVC, Spring Data JPA, Validation, Actuator)
- **PostgreSQL** as the primary database
- **Flyway** for database migrations
- **Maven** (with the Maven Wrapper, `mvnw`) as the build tool

## Prerequisites

- JDK 25+
- Docker (to run PostgreSQL locally via `docker-compose`)

## Running locally

1. Start a local PostgreSQL instance:

   ```powershell
   docker compose up -d
   ```

   This starts a PostgreSQL 17 container with:
   - database: `money_trail`
   - user: `money_trail`
   - password: `money_trail`
   - port: `5432`

2. Run the application:

   ```powershell
   ./mvnw spring-boot:run
   ```

   On startup, Flyway automatically applies any pending migrations found in
   `src/main/resources/db/migration`.

3. The application exposes health/info endpoints under `/actuator`.

### Configuration

The application reads its datasource configuration from environment
variables, with sensible defaults matching the `docker-compose.yml` setup:

| Variable      | Default                                       |
|---------------|------------------------------------------------|
| `DB_URL`      | `jdbc:postgresql://localhost:5432/money_trail` |
| `DB_USERNAME` | `money_trail`                                  |
| `DB_PASSWORD` | `money_trail`                                  |

## Database migrations

Schema changes are managed with Flyway. Migration files live in
`src/main/resources/db/migration` and follow Flyway's naming convention
(e.g. `V2__add_transactions_table.sql`). Never edit a migration that has
already been merged — add a new one instead.

## Running tests

Tests run against a real PostgreSQL instance, so make sure one is running
(see [Running locally](#running-locally)) before executing:

```powershell
./mvnw verify
```

## Continuous Integration

Every pull request triggers a GitHub Actions workflow
(`.github/workflows/ci.yml`) that builds the project and runs the test suite
against a disposable PostgreSQL service container. The `main` branch is
protected: direct pushes are blocked, and pull requests can only be merged
once the CI check passes.

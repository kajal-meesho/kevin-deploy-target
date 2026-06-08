# kevin-deploy-target

Tiny Spring Boot service used as the target repo for **Kevin's Week 4 POC**.

## Why this repo exists

Kevin (an autonomous SDLC agent in DrishtiX) needs a real service repo to demonstrate
the full Week 4 pipeline:

1. `/kevin SPSE-X` in Slack
2. AI conversation → plan review → implementation review
3. **Docker test runner runs `mvn test` against this repo**
4. PR opens with Kevin's new code committed alongside the existing `pom.xml`
5. User clicks Merge in Slack
6. **Kevin builds this `Dockerfile`** into a container
7. **Canary container starts on a free localhost port** (18100–18199 range)
8. Evaluator agent reads health/latency metrics from the canary
9. LLM verdict → auto-promote (canary becomes stable) OR auto-rollback (canary killed)

## What's inside

```
pom.xml                                    ← Spring Boot 2.7 + JUnit 5
Dockerfile                                 ← multi-stage build → eclipse-temurin:17-jre
src/main/java/com/example/demo/
  DemoApplication.java                     ← Spring Boot entry point
  HealthController.java                    ← GET /health → {"status":"UP"}
  MathUtils.java                           ← simple utility class
src/test/java/com/example/demo/
  MathUtilsTest.java                       ← 3 JUnit tests
  DemoApplicationTests.java                ← Spring context smoke test
```

## Build and run manually

```bash
mvn -B test           # runs the 4 tests (~10s on a warm cache)
mvn -B package        # produces target/kevin-deploy-target.jar

docker build -t kevin-deploy-target:dev .
docker run --rm -p 18100:8080 kevin-deploy-target:dev
curl localhost:18100/health
```

## What Kevin does to this repo

When a user runs `/kevin SPSE-XXXX` and answers Kevin's questions, Kevin will:

- Add new `.java` files alongside `MathUtils.java`
- Add corresponding tests alongside `MathUtilsTest.java`
- Update `plan.md` with the design doc
- Open a PR on a `feature/spse-xxxx-ai-summary` branch
- After tests pass and you click Merge, build this repo's Dockerfile and
  run the resulting image as a canary on a localhost port

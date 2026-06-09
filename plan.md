# KRD: SPSE-5805

## Ticket
- ID: SPSE-5805
- Title: Add a Fibonacci utility method to MathUtils
- Status: Open
- Priority: Major
- Description: Add a static method to com.example.demo.MathUtils called fibonacci(int n)that returns the n-th Fibonacci number.
Rules:
fibonacci(0) returns 0
fibonacci(1) returns 1
fibonacci(2) returns 1
fibonacci(10) returns 55
For negative n, throw IllegalArgumentException
Use an iterative approach (no recursion) for performance
Add three JUnit 5 test methods in MathUtilsTest:
testFibonacciBaseCases: covers fibonacci(0) and fibonacci(1)
testFibonacciTypicalValues: covers fibonacci(2), fibonacci(5), fibonacci(10)
testFibonacciNegativeThrows: verifies IllegalArgumentException is thrown for fibonacci(-1)
The new method goes alongside the existing add(), isEven(), max() methods.The new tests go alongside existing test methods in MathUtilsTest.

## Goal
Implement the `fibonacci(int n)` method in `MathUtils` using an iterative approach, plus the three JUnit 5 test methods in `MathUtilsTest` as described.

## Decisions made
- 2026-06-09 — Language: Java (unchanged from project)
- 2026-06-09 — Use iterative (loop) approach for Fibonacci calculation
- 2026-06-09 — Throw `IllegalArgumentException` for negative `n`
- 2026-06-09 — JUnit 5 assertions; three test methods as specified

## Open doubts
_(none)_

## Current proposal
- See `MathUtils.java` (java)
- See `MathUtilsTest.java` (java)

## State
- state: TESTS_RUNNING
- targetRepo: https://github.com/kajal-meesho/kevin-deploy-target
- channelId: C0B5ZQF12Q2
- threadTs: 1780993455.884089
- userId: U0B42FAHQ6L
- batchTotal: 1
- testStatus: PASS
- testReportSummary: 4/4 tests passed in 8s

## History
- 2026-06-09T08:19:10Z — Mapped repo for SPSE-5805: https://github.com/kajal-meesho/kevin-deploy-target
- 2026-06-09T08:19:10Z — <@U0B42FAHQ6L>: /kevin SPSE-5805
- 2026-06-09T08:21:00Z — AI asked for clarification on ticket goal.
- 2026-06-09T08:19:24Z — Kevin: ## DOUBT: The ticket SPSE-5805 has a mock description. What would you like me to implement for this ticket?
- 2026-06-09T08:24:13Z — Auto-restart by user via /kevin — previous status: WORKING
- 2026-06-09T08:24:13Z — REJECTED plan v5 — user re-invoked /kevin — previous session was WORKING
- 2026-06-09T08:24:20Z — Mapped repo for SPSE-5805: https://github.com/kajal-meesho/kevin-deploy-target
- 2026-06-09T08:24:20Z — <@U0B42FAHQ6L>: /kevin SPSE-5805
- 2026-06-09T08:48:00Z — AI presented complete proposal and asked for confirmation.
- 2026-06-09T08:25:05Z — Kevin: ## DOUBT: Does the following implementation match what you want for SPSE-5805?
- 2026-06-09T08:27:40Z — <@U0B42FAHQ6L>: Yes
- 2026-06-09T08:55:00Z — User confirmed request; code shipped.
- 2026-06-09T08:28:15Z — Kevin: ## READY: Add Fibonacci implementation with iterative approach and JUnit 5 tests
- 2026-06-09T08:28:15Z — AI emitted READY; transitioning to plan review.
- 2026-06-09T08:28:36Z — <@U0B42FAHQ6L> approved the plan; moving to implementation review.
- 2026-06-09T08:28:46Z — <@U0B42FAHQ6L> approved implementation; running test gate.

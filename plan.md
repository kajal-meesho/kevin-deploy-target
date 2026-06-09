# KRD: SPSE-5806

## Ticket
- ID: SPSE-5806
- Title: Add a power-of-two checker to MathUtils
- Status: Open
- Priority: Major
- Description: Add a static method to com.example.demo.MathUtils called isPowerOfTwo(int n)that returns true when n is a positive power of two (1, 2, 4, 8, 16, …).
Rules:
isPowerOfTwo(1) returns true (2^0)
isPowerOfTwo(2) returns true
isPowerOfTwo(16) returns true
isPowerOfTwo(0) returns false
isPowerOfTwo(3) returns false
For negative n, return false
Add two JUnit 5 test methods in MathUtilsTest:
testPowerOfTwoPositives: covers 1, 2, 4, 8, 16
testPowerOfTwoRejections: covers 0, 3, -2

## Goal
Implement the `isPowerOfTwo(int n)` static method in `MathUtils` (using a classic bitwise check) and add the two specified JUnit 5 test methods in `MathUtilsTest`.

## Decisions made
- 2026-06-09 — Implementation: `return n > 0 && (n & (n - 1)) == 0`
- 2026-06-09 — Test methods exactly as described in the ticket

## Open doubts
_(none)_

## Current proposal
- See `src/main/java/com/example/demo/MathUtils.java` (java)
- See `src/test/java/com/example/demo/MathUtilsTest.java` (java)

## State
- state: TESTS_RUNNING
- targetRepo: https://github.com/kajal-meesho/kevin-deploy-target
- channelId: C0B5ZQF12Q2
- threadTs: 1780994114.793009
- userId: U0B42FAHQ6L
- batchTotal: 1
- testStatus: PASS
- testReportSummary: 3/3 tests passed in 6s

## History
- 2026-06-09T08:35:18Z — Mapped repo for SPSE-5806: https://github.com/kajal-meesho/kevin-deploy-target
- 2026-06-09T08:35:18Z — <@U0B42FAHQ6L>: /kevin SPSE-5806
- 2026-06-09T11:25:00Z — Session resumed; provided full implementation with bitwise algorithm and two JUnit 5 test methods.
- 2026-06-09T08:36:02Z — Kevin: ## READY: Java `isPowerOfTwo(int)` implementation with JUnit 5 tests.
- 2026-06-09T08:36:02Z — AI emitted READY; transitioning to plan review.
- 2026-06-09T08:36:09Z — <@U0B42FAHQ6L> approved the plan; moving to implementation review.
- 2026-06-09T08:36:16Z — <@U0B42FAHQ6L> approved implementation; running test gate.

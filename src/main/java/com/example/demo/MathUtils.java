package com.example.demo;

/**
 * Tiny utility class — exists purely so we have something real to test
 * (so {@code mvn test} runs a non-trivial test method, not just the Spring
 * Boot context-load smoke test).
 * <p>
 * Kevin will commit NEW utility methods next to this one when /kevin SPSE-X
 * adds features to this service.
 */
public final class MathUtils {

    private MathUtils() {}

    /** Returns the sum of two integers. Overflow is undefined (same as native +). */
    public static int add(int a, int b) {
        return a + b;
    }

    /** Returns true when {@code n} is even (including 0 and negatives). */
    public static boolean isEven(int n) {
        return (n & 1) == 0;
    }

    /**
     * Largest of two integers. Returns {@code a} when they're equal.
     */
    public static int max(int a, int b) {
        return a >= b ? a : b;
    }
}

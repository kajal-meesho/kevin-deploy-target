package com.example.demo;

public final class MathUtils {

    private MathUtils() {}

    /**
     * Checks if a positive integer is a power of two.
     *
     * @param n the integer to check
     * @return true if n is a positive power of two (1, 2, 4, ...), false otherwise
     */
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    // Existing utility methods remain unchanged.
}
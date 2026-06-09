package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void testPowerOfTwoPositives() {
        assertTrue(MathUtils.isPowerOfTwo(1));
        assertTrue(MathUtils.isPowerOfTwo(2));
        assertTrue(MathUtils.isPowerOfTwo(4));
        assertTrue(MathUtils.isPowerOfTwo(8));
        assertTrue(MathUtils.isPowerOfTwo(16));
    }

    @Test
    void testPowerOfTwoRejections() {
        assertFalse(MathUtils.isPowerOfTwo(0));
        assertFalse(MathUtils.isPowerOfTwo(3));
        assertFalse(MathUtils.isPowerOfTwo(-2));
    }
}
package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tests for {@link MathUtils}. These run inside Kevin's DockerTestRunner
 * to demonstrate the test-gate firing real {@code mvn test} against a
 * real Maven project before any PR opens.
 */
class MathUtilsTest {

    @Test
    void addReturnsSum() {
        assertEquals(5, MathUtils.add(2, 3));
        assertEquals(0, MathUtils.add(-1, 1));
        assertEquals(-7, MathUtils.add(-3, -4));
    }

    @Test
    void isEvenIdentifiesEvenNumbers() {
        assertTrue(MathUtils.isEven(0));
        assertTrue(MathUtils.isEven(2));
        assertTrue(MathUtils.isEven(-4));
        assertFalse(MathUtils.isEven(1));
        assertFalse(MathUtils.isEven(-7));
    }

    @Test
    void maxReturnsLargest() {
        assertEquals(7, MathUtils.max(3, 7));
        assertEquals(5, MathUtils.max(5, 5));
        assertEquals(-1, MathUtils.max(-1, -10));
    }
}

package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void testFibonacciBaseCases() {
        assertEquals(0, MathUtils.fibonacci(0));
        assertEquals(1, MathUtils.fibonacci(1));
    }

    @Test
    void testFibonacciTypicalValues() {
        assertEquals(1, MathUtils.fibonacci(2));
        assertEquals(5, MathUtils.fibonacci(5));
        assertEquals(55, MathUtils.fibonacci(10));
    }

    @Test
    void testFibonacciNegativeThrows() {
        assertThrows(IllegalArgumentException.class, () -> MathUtils.fibonacci(-1));
    }
}
package org.example;

import org.junit.Test;

import static org.junit.Assert.*;


public class ClosestToZeroTest {
    @Test(expected = IllegalArgumentException.class)
    public void testEmptyArray() {
        ClosestToZero.findClosestToZero(new int[]{});
    }

    @Test
    public void testSingleElement() {
        assertEquals(5, ClosestToZero.findClosestToZero(new int[]{5}));
    }

    @Test
    public void testSingleElementZero() {
        assertEquals(0, ClosestToZero.findClosestToZero(new int[]{0}));
    }

    @Test
    public void testWithZeroIncluded() {
        assertEquals(0, ClosestToZero.findClosestToZero(new int[]{0, 1, 2}));
    }

    @Test
    public void testAllNegativeNumbers() {
        assertEquals(-3, ClosestToZero.findClosestToZero(new int[]{-3, -5, -10}));
    }

    @Test
    public void testArrayWithRepeatedElements() {
        assertEquals(2, ClosestToZero.findClosestToZero(new int[]{2, 3, 2}));
    }


    @Test
    public void testMultipleClosest() {
        assertEquals(2, ClosestToZero.findClosestToZero(new int[]{-2, 2}));
    }


    @Test
    public void testNormalCase() {
        assertEquals(1, ClosestToZero.findClosestToZero(new int[]{1, 2, 3}));
    }


}

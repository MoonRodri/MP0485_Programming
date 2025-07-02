package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

public class P15_AveragingTest {

    // Tests for sum
    @Test
    public void testSumPositiveNumbers() {
        int expected = 10;
        int actual = P15_Averaging.sum(1, 2, 3, 4);
        assertEquals("Expected sum of (1, 2, 3, 4) to be " + expected + " but was " + actual, expected, actual);
    }

    @Test
    public void testSumZeros() {
        int expected = 0;
        int actual = P15_Averaging.sum(0, 0, 0, 0);
        assertEquals("Expected sum of (0, 0, 0, 0) to be " + expected + " but was " + actual, expected, actual);
    }

    @Test
    public void testSumNegativeNumbers() {
        int expected = -10;
        int actual = P15_Averaging.sum(-1, -2, -3, -4);
        assertEquals("Expected sum of (-1, -2, -3, -4) to be " + expected + " but was " + actual, expected, actual);
    }

    @Test
    public void testSumSameNumbers() {
        int expected = 20;
        int actual = P15_Averaging.sum(5, 5, 5, 5);
        assertEquals("Expected sum of (5, 5, 5, 5) to be " + expected + " but was " + actual, expected, actual);
    }

    // Tests for getAverage
    @Test
    public void testAveragePositiveNumbers() {
        double expected = 2.5;
        double actual = P15_Averaging.getAverage(1, 2, 3, 4);
        assertEquals("Expected average of (1, 2, 3, 4) to be " + expected + " but was " + actual, expected, actual, 0.0001);
    }

    @Test
    public void testAverageZeros() {
        double expected = 0.0;
        double actual = P15_Averaging.getAverage(0, 0, 0, 0);
        assertEquals("Expected average of (0, 0, 0, 0) to be " + expected + " but was " + actual, expected, actual, 0.0001);
    }

    @Test
    public void testAverageNegativeNumbers() {
        double expected = -2.5;
        double actual = P15_Averaging.getAverage(-1, -2, -3, -4);
        assertEquals("Expected average of (-1, -2, -3, -4) to be " + expected + " but was " + actual, expected, actual, 0.0001);
    }

    @Test
    public void testAverageSameNumbers() {
        double expected = 5.0;
        double actual = P15_Averaging.getAverage(5, 5, 5, 5);
        assertEquals("Expected average of (5, 5, 5, 5) to be " + expected + " but was " + actual, expected, actual, 0.0001);
    }
}

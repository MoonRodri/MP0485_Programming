package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

public class P11_SummationTest {

    @Test
    public void testSumWithPositiveNumbers() {
        int result = P11_Summation.sum(4, 3, 6, 1);
        assertEquals("Sum of 4, 3, 6, 1 should be 14", 14, result);
    }

    @Test
    public void testSumWithZeros() {
        int result = P11_Summation.sum(0, 0, 0, 0);
        assertEquals("Sum of 0, 0, 0, 0 should be 0", 0, result);
    }

    @Test
    public void testSumWithNegativeNumbers() {
        int result = P11_Summation.sum(-1, -2, -3, -4);
        assertEquals("Sum of -1, -2, -3, -4 should be -10", -10, result);
    }

    @Test
    public void testSumWithMixedNumbers() {
        int result = P11_Summation.sum(-1, 2, -3, 4);
        assertEquals("Sum of -1, 2, -3, 4 should be 2", 2, result);
    }
}

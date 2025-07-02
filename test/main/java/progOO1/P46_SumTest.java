package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class P46_SumTest {

    @Test
    public void testSumWithPositiveAndNegativeNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);

        int result = P46_Sum.sum(numbers);
        assertEquals("Sum of [3, 2, 6, -1] should be 10", 10, result);
    }

    @Test
    public void testSumWithEmptyList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        int result = P46_Sum.sum(numbers);
        assertEquals("Sum of empty list should be 0", 0, result);
    }

    @Test
    public void testSumWithAllZeros() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);
        int result = P46_Sum.sum(numbers);
        assertEquals("Sum of [0,0,0] should be 0", 0, result);
    }

    @Test
    public void testSumWithSingleElement() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        int result = P46_Sum.sum(numbers);
        assertEquals("Sum of [42] should be 42", 42, result);
    }
}

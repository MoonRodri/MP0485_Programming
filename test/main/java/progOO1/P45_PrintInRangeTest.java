package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;

public class P45_PrintInRangeTest {

    private String runPrintInRange(ArrayList<Integer> numbers, int lower, int upper) {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        try {
            P45_PrintInRange.printNumbersInRange(numbers, lower, upper);
            return outContent.toString().replace("\r\n", "\n").trim();
        } finally {
            System.setOut(originalOut);
        }
    }

    @Test
    public void testPrintNumbersInRange() {
        ArrayList<Integer> numbers = new ArrayList<>();
        // Add numbers as in the example
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);
        numbers.add(11);
        numbers.add(4);
        numbers.add(7);
        numbers.add(-11);
        numbers.add(8);
        numbers.add(13);

        String output = runPrintInRange(numbers, 0, 5);

        String expectedHeader = "The numbers in range [0, 5]";
        assertTrue("Output should contain the header '" + expectedHeader + "' but was:\n" + output,
                output.contains(expectedHeader));

        // Expected numbers inside range: 3, 2, 5, 1, 4
        assertTrue("Output should contain '1' but was:\n" + output, output.contains("1"));
        assertTrue("Output should contain '2' but was:\n" + output, output.contains("2"));
        assertTrue("Output should contain '3' but was:\n" + output, output.contains("3"));
        assertTrue("Output should contain '4' but was:\n" + output, output.contains("4"));
        assertTrue("Output should contain '5' but was:\n" + output, output.contains("5"));

        // Numbers outside range should NOT appear
        assertFalse("Output should NOT contain '-1' but was:\n" + output, output.contains("-1"));
        assertFalse("Output should NOT contain '6' but was:\n" + output, output.contains("6"));
        assertFalse("Output should NOT contain '7' but was:\n" + output, output.contains("7"));
        assertFalse("Output should NOT contain '8' but was:\n" + output, output.contains("8"));
        assertFalse("Output should NOT contain '11' but was:\n" + output, output.contains("11"));
        assertFalse("Output should NOT contain '13' but was:\n" + output, output.contains("13"));
        assertFalse("Output should NOT contain '-11' but was:\n" + output, output.contains("-11"));
    }

    @Test
    public void testEmptyList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        String output = runPrintInRange(numbers, 0, 10);

        String expected = "The numbers in range [0, 10]";
        assertEquals("Output for empty list should only contain header", expected, output);
    }

    @Test
    public void testNoNumbersInRange() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(-10);
        numbers.add(-5);
        numbers.add(-1);
        String output = runPrintInRange(numbers, 0, 5);

        String expected = "The numbers in range [0, 5]";
        assertEquals("Output when no numbers in range should only contain header", expected, output);
    }
}

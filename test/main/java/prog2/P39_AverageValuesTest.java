package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P39_AverageValuesTest {

    @Test
    public void testAverageCalculationWithThreeValues() {
        String input = "10\n20\n30\n-1\n"; // values to average
        String expectedSubstring = "Average of values: 20.0";

        String output = runWithInput(input);
        assertTrue("Expected output to contain average 20.0", output.contains(expectedSubstring));
    }

    @Test
    public void testAverageWithNoValuesEntered() {
        String input = "-1\n";
        String expected = "The average of the values could not be calculated.";

        String output = runWithInput(input);
        assertTrue("Expected message for no input values", output.contains(expected));
    }

    @Test
    public void testAverageWithOneValue() {
        String input = "15\n-1\n";
        String expected = "Average of values: 15.0";

        String output = runWithInput(input);
        assertTrue("Expected average for single value 15", output.contains(expected));
    }
    
    @Test
    public void testAverageWithZeroValue() {
        String input = "0\n-1\n";
        String expected = "Average of values: 0.0";

        String output = runWithInput(input);
        assertTrue("Expected average for single value 0", output.contains(expected));
    }

    // Helper method to simulate input and capture output
    private String runWithInput(String data) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        ByteArrayOutputStream testOut = new ByteArrayOutputStream();
        System.setIn(testIn);
        System.setOut(new PrintStream(testOut));

        try {
            P39_AverageValues.main(new String[0]);
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }

        return testOut.toString();
    }
}

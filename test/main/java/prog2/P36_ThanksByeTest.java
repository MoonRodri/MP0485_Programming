package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P36_ThanksByeTest {

    private void testOutput(String input, String[] expectedLines) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            P36_ThanksBye.main(new String[0]);

            String[] outputLines = outContent.toString().split("\\R");

            for (String expected : expectedLines) {
                boolean found = false;
                for (String line : outputLines) {
                    if (line.trim().equals(expected.trim())) {
                        found = true;
                        break;
                    }
                }
                assertTrue("Expected line not found: " + expected, found);
            }

        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testMixedNumbers() {
        String input = "2\n3\n4\n5\n-1\n";
        String[] expected = {
            "Thx! Bye!",
            "Sum: 14",
            "Numbers: 4",
            "Average: 3.5",
            "Even: 2",
            "Odd: 2"
        };
        testOutput(input, expected);
    }

    @Test
    public void testAllEven() {
        String input = "2\n4\n6\n-1\n";
        String[] expected = {
            "Sum: 12",
            "Numbers: 3",
            "Average: 4.0",
            "Even: 3",
            "Odd: 0"
        };
        testOutput(input, expected);
    }

    @Test
    public void testAllOdd() {
        String input = "1\n3\n5\n-1\n";
        String[] expected = {
            "Sum: 9",
            "Numbers: 3",
            "Average: 3.0",
            "Even: 0",
            "Odd: 3"
        };
        testOutput(input, expected);
    }

    @Test
    public void testNoNumbers() {
        String input = "-1\n";
        String[] expected = {
            "Sum: 0",
            "Numbers: 0",
            "Average: NaN",
            "Even: 0",
            "Odd: 0"
        };
        testOutput(input, expected);
    }
}

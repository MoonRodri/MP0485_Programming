package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P24_NumberOfNumbersTest {

    private void testOutput(String input, String expectedOutput) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            P24_NumberOfNumbers.main(new String[0]);

            String output = outContent.toString();
            assertTrue("Expected output not found. Output was:\n" + output,
                    output.contains(expectedOutput));
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testNoNumbers() {
        testOutput("0\n", "Number of numbers: 0");
    }

    @Test
    public void testOneNumber() {
        testOutput("5\n0\n", "Number of numbers: 1");
    }

    @Test
    public void testMultipleNumbers() {
        testOutput("3\n7\n10\n0\n", "Number of numbers: 3");
    }

    @Test
    public void testWithNegativeNumbers() {
        testOutput("-1\n-5\n0\n", "Number of numbers: 2");
    }
}

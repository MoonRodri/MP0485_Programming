package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P41_IndexOfSmallestTest {

    private String runWithInput(String input) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));

            P41_IndexOfSmallest.main(new String[0]);

            return out.toString().replace("\r\n", "\n").trim();

        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testSingleSmallestOnce() {
        String input = "5\n3\n7\n9999\n";
        String output = runWithInput(input);

        assertTrue("Output should contain 'Smallest number: 3', but was:\n" + output,
                   output.contains("Smallest number: 3"));
        assertTrue("Output should contain 'Found at index: 1', but was:\n" + output,
                   output.contains("Found at index: 1"));
    }

    @Test
    public void testSmallestMultipleTimes() {
        String input = "4\n2\n2\n5\n9999\n";
        String output = runWithInput(input);

        assertTrue("Output should contain 'Smallest number: 2', but was:\n" + output,
                   output.contains("Smallest number: 2"));
        assertTrue("Output should contain 'Found at index: 1', but was:\n" + output,
                   output.contains("Found at index: 1"));
        assertTrue("Output should contain 'Found at index: 2', but was:\n" + output,
                   output.contains("Found at index: 2"));
    }

    @Test
    public void testAllSameNumbers() {
        String input = "3\n3\n3\n3\n9999\n";
        String output = runWithInput(input);

        assertTrue("Output should contain 'Smallest number: 3', but was:\n" + output,
                   output.contains("Smallest number: 3"));
        assertTrue("Output should contain 4 occurrences of 'Found at index:', but was:\n" + output,
                   countOccurrences(output, "Found at index:") == 4);
    }

    @Test
    public void testSingleElement() {
        String input = "42\n9999\n";
        String output = runWithInput(input);

        assertTrue("Output should contain 'Smallest number: 42', but was:\n" + output,
                   output.contains("Smallest number: 42"));
        assertTrue("Output should contain 'Found at index: 0', but was:\n" + output,
                   output.contains("Found at index: 0"));
    }

    // Helper method to count occurrences of a substring
    private int countOccurrences(String str, String sub) {
        int count = 0;
        int idx = 0;
        while ((idx = str.indexOf(sub, idx)) != -1) {
            count++;
            idx += sub.length();
        }
        return count;
    }
}

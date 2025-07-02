package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P40_IndexOfTest {

    private String runWithInput(String input) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));

            P40_IndexOf.main(new String[0]);

            return out.toString().replace("\r\n", "\n").trim();

        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testNumberFoundOnce() {
        String input = "5\n3\n7\n-1\n7\n";
        String output = runWithInput(input);
        assertTrue("Output should contain prompt 'Search for?', but was:\n" + output, 
                   output.contains("Search for?"));
        assertTrue("Output should contain '7 is at index 2', but was:\n" + output, 
                   output.contains("7 is at index 2"));
        assertFalse("Output should NOT contain '7 is at index 0', but was:\n" + output, 
                    output.contains("7 is at index 0"));
        assertFalse("Output should NOT contain '7 is at index 1', but was:\n" + output, 
                    output.contains("7 is at index 1"));
    }

    @Test
    public void testNumberFoundMultipleTimes() {
        String input = "2\n7\n2\n9\n7\n-1\n7\n";
        String output = runWithInput(input);
        assertTrue("Output should contain prompt 'Search for?', but was:\n" + output, 
                   output.contains("Search for?"));
        assertTrue("Output should contain '7 is at index 1', but was:\n" + output, 
                   output.contains("7 is at index 1"));
        assertTrue("Output should contain '7 is at index 4', but was:\n" + output, 
                   output.contains("7 is at index 4"));
    }

    @Test
    public void testNumberNotFound() {
        String input = "1\n2\n3\n4\n-1\n10\n";
        String output = runWithInput(input);
        assertTrue("Output should contain prompt 'Search for?', but was:\n" + output, 
                   output.contains("Search for?"));
        assertFalse("Output should NOT contain '10 is at index', but was:\n" + output, 
                    output.contains("10 is at index"));
    }

    @Test
    public void testEmptyList() {
        String input = "-1\n5\n";
        String output = runWithInput(input);
        assertTrue("Output should contain prompt 'Search for?', but was:\n" + output, 
                   output.contains("Search for?"));
        assertFalse("Output should NOT contain '5 is at index', but was:\n" + output, 
                    output.contains("5 is at index"));
    }

    @Test
    public void testNumberFoundAtStartAndEnd() {
        String input = "9\n3\n4\n9\n-1\n9\n";
        String output = runWithInput(input);
        assertTrue("Output should contain prompt 'Search for?', but was:\n" + output, 
                   output.contains("Search for?"));
        assertTrue("Output should contain '9 is at index 0', but was:\n" + output, 
                   output.contains("9 is at index 0"));
        assertTrue("Output should contain '9 is at index 3', but was:\n" + output, 
                   output.contains("9 is at index 3"));
    }
}

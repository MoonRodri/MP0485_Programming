package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P44_OnTheListTest {

    private String runWithInput(String input) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));

            P44_OnTheList.main(new String[0]);

            return out.toString().replace("\r\n", "\n").trim();

        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testItemFound() {
        String input = "apple\nbanana\ncherry\n\nbanana\n";
        String output = runWithInput(input);

        assertTrue("Expected prompt 'Search for?' in output, but got:\n" + output,
                   output.contains("Search for?"));
        assertTrue("Expected 'banana was found!' in output, but got:\n" + output,
                   output.contains("banana was found!"));
    }

    @Test
    public void testItemNotFound() {
        String input = "apple\nbanana\ncherry\n\norange\n";
        String output = runWithInput(input);

        assertTrue("Expected prompt 'Search for?' in output, but got:\n" + output,
                   output.contains("Search for?"));
        assertTrue("Expected 'orange was not found!' in output, but got:\n" + output,
                   output.contains("orange was not found!"));
    }

    @Test
    public void testEmptyList() {
        String input = "\napple\n";
        String output = runWithInput(input);

        assertTrue("Expected prompt 'Search for?' in output, but got:\n" + output,
                   output.contains("Search for?"));
        assertTrue("Expected 'apple was not found!' in output, but got:\n" + output,
                   output.contains("apple was not found!"));
    }
}

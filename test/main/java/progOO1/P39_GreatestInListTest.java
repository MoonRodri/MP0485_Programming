package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;

public class P39_GreatestInListTest {

    private String runWithInput(String input) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));

            P39_GreatestInList.main(new String[0]);

            return out.toString().replace("\r\n", "\n").trim();

        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testGreatestNumberSimple() {
        String input = "5\n3\n8\n-1\n";
        String output = runWithInput(input);
        assertTrue("Output should contain 'The greatest number: 8'", output.contains("The greatest number: 8"));
    }

    @Test
    public void testGreatestNumberSingleElement() {
        String input = "42\n-1\n";
        String output = runWithInput(input);
        assertTrue("Output should contain 'The greatest number: 42'", output.contains("The greatest number: 42"));
    }

    @Test
    public void testGreatestNumberAllSame() {
        String input = "7\n7\n7\n7\n-1\n";
        String output = runWithInput(input);
        assertTrue("Output should contain 'The greatest number: 7'", output.contains("The greatest number: 7"));
    }

    @Test
    public void testGreatestNumberNegativeValues() {
        String input = "-3\n-10\n-1\n-1\n";
        String output = runWithInput(input);
        assertTrue("Output should contain 'The greatest number: -3'", output.contains("The greatest number: -3"));
    }
}

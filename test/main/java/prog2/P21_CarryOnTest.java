package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P21_CarryOnTest {

    private void testOutput(String input, int expectedPromptCount) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            P21_CarryOn.main(new String[0]);

            String output = outContent.toString();
            long promptCount = output.lines()
                                     .filter(line -> line.trim().equals("Carry on?"))
                                     .count();

            assertEquals("Expected prompt count does not match.", expectedPromptCount, promptCount);
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testSingleNo() {
        testOutput("no\n", 1);
    }

    @Test
    public void testTwoIterations() {
        testOutput("yes\nno\n", 2);
    }

    @Test
    public void testMultipleIterations() {
        testOutput("go\nmaybe\nyep\nno\n", 4);
    }
}

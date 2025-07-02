package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;

public class P22_IsItTrueTest {

    private String runWithInput(String input) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));

            P22_IsItTrue.main(new String[0]);

            return out.toString().replace("\r\n", "\n").trim();

        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testCorrectString() {
        String input = "true\n";
        String output = runWithInput(input);

        assertTrue(output.contains("Give a string:"));
        assertTrue(output.contains("You got it right!"));
    }

    @Test
    public void testIncorrectString() {
        String input = "false\n";
        String output = runWithInput(input);

        assertTrue(output.contains("Give a string:"));
        assertTrue(output.contains("Try again!"));
    }

    @Test
    public void testEmptyString() {
        String input = "\n";
        String output = runWithInput(input);

        assertTrue(output.contains("Give a string:"));
        assertTrue(output.contains("Try again!"));
    }
}

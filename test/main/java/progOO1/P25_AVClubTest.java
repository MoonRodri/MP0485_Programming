package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P25_AVClubTest {

    private String runWithInput(String input) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));

            P25_AVClub.main(new String[0]);

            return out.toString().replace("\r\n", "\n").trim();

        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testWordsWithAv() {
        String output = runWithInput("bravo java cave\n\n");
        String[] expected = {"bravo", "java", "cave"};
        for (String word : expected) {
            assertTrue("Expected output to contain: " + word, output.contains(word));
        }
    }

    @Test
    public void testWordsWithoutAv() {
        String output = runWithInput("hello world test\n\n");
        assertEquals("", output);
    }

    @Test
    public void testMixedWords() {
        String output = runWithInput("travel banana save apple\n\n");
        String[] expected = {"travel", "save"};
        for (String word : expected) {
            assertTrue("Expected output to contain: " + word, output.contains(word));
        }
        assertFalse(output.contains("banana"));
        assertFalse(output.contains("apple"));
    }

    @Test
    public void testEmptyInput() {
        String output = runWithInput("\n");
        assertEquals("", output);
    }
}

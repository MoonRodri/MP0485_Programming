package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P26_FirstWordsTest {

    private String runWithInput(String input) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));

            P26_FirstWords.main(new String[0]);

            return out.toString().replace("\r\n", "\n").trim();

        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testSingleLine() {
        String output = runWithInput("hello world\n\n");
        assertEquals("hello", output);
    }

    @Test
    public void testMultipleLines() {
        String output = runWithInput("java rules\npython wins\n\n");
        String[] lines = output.split("\n");
        assertEquals("java", lines[0]);
        assertEquals("python", lines[1]);
    }

    @Test
    public void testOnlyOneWordPerLine() {
        String output = runWithInput("hello\nworld\n\n");
        String[] lines = output.split("\n");
        assertEquals("hello", lines[0]);
        assertEquals("world", lines[1]);
    }

    @Test
    public void testEmptyInput() {
        String output = runWithInput("\n");
        assertEquals("", output);
    }
}

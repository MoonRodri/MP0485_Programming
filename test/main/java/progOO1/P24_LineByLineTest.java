package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P24_LineByLineTest {

    private String runWithInput(String input) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));

            P24_LineByLine.main(new String[0]);

            return out.toString().replace("\r\n", "\n").trim();

        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testSingleLineInput() {
        String output = runWithInput("this is a test\n\n");
        String[] lines = output.split("\n");

        assertArrayEquals(new String[]{"this", "is", "a", "test"}, lines);
    }

    @Test
    public void testMultipleLinesInput() {
        String output = runWithInput("hello world\nunit test case\n\n");
        String[] lines = output.split("\n");

        assertArrayEquals(new String[]{
            "hello", "world",
            "unit", "test", "case"
        }, lines);
    }

    @Test
    public void testSingleWord() {
        String output = runWithInput("Java\n\n");
        assertEquals("Java", output);
    }

    @Test
    public void testEmptyInput() {
        String output = runWithInput("\n");
        assertEquals("", output);
    }
}

package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P03_FromOneToParameterTest {

    @Test
    public void testPrintUntilNumber2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        try {
            P03_FromOneToParameter.printUntilNumber(2);
        } finally {
            System.setOut(originalOut);
        }

        String[] lines = out.toString().trim().split("\\r?\\n");
        assertEquals("Should print two lines", 2, lines.length);
        assertEquals("First line should be '1'", "1", lines[0].trim());
        assertEquals("Second line should be '2'", "2", lines[1].trim());
    }

    @Test
    public void testPrintUntilNumber5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        try {
            P03_FromOneToParameter.printUntilNumber(5);
        } finally {
            System.setOut(originalOut);
        }

        String[] lines = out.toString().trim().split("\\r?\\n");
        assertEquals("Should print five lines", 5, lines.length);
        for (int i = 0; i < 5; i++) {
            assertEquals("Line " + (i + 1) + " should be " + (i + 1), String.valueOf(i + 1), lines[i].trim());
        }
    }

    @Test
    public void testPrintUntilNumber0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        try {
            P03_FromOneToParameter.printUntilNumber(0);
        } finally {
            System.setOut(originalOut);
        }

        String output = out.toString().trim();
        assertTrue("Should not print anything for 0", output.isEmpty());
    }
}

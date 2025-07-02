package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P02_ReprintTest {

    @Test
    public void testPrintTextOnce() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            P02_Reprint.printText();
        } finally {
            System.setOut(originalOut); // Always restore System.out
        }

        String expected = "In a hole in the ground there lived a method";
        String actual = outContent.toString().trim();
        assertEquals("Output of printText() should match expected", expected, actual);
    }

    @Test
    public void testPrintTextThreeTimes() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            for (int i = 0; i < 3; i++) {
                P02_Reprint.printText();
            }
        } finally {
            System.setOut(originalOut);
        }

        String[] lines = outContent.toString().trim().split("\\r?\\n");
        assertEquals("Should print three lines", 3, lines.length);
        for (String line : lines) {
            assertEquals("Each line should be the expected text",
                "In a hole in the ground there lived a method", line.trim());
        }
    }
}

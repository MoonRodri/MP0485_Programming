package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P04_FromParameterToOneTest {

    @Test
    public void testPrintFrom5To1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        try {
            P04_FromParameterToOne.printFromNumberToOne(5);
        } finally {
            System.setOut(originalOut);
        }

        String[] lines = out.toString().trim().split("\\r?\\n");
        assertEquals("Should print 5 lines", 5, lines.length);
        for (int i = 0; i < 5; i++) {
            assertEquals("Line " + (i + 1) + " should be " + (5 - i), String.valueOf(5 - i), lines[i].trim());
        }
    }

    @Test
    public void testPrintFrom3To1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        try {
            P04_FromParameterToOne.printFromNumberToOne(3);
        } finally {
            System.setOut(originalOut);
        }

        String[] lines = out.toString().trim().split("\\r?\\n");
        assertArrayEquals(new String[]{"3", "2", "1"}, lines);
    }

    @Test
    public void testPrintFrom1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        try {
            P04_FromParameterToOne.printFromNumberToOne(1);
        } finally {
            System.setOut(originalOut);
        }

        assertEquals("Should print just one line with 1", "1", out.toString().trim());
    }

    @Test
    public void testPrintFrom0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        try {
            P04_FromParameterToOne.printFromNumberToOne(0);
        } finally {
            System.setOut(originalOut);
        }

        assertTrue("Should not print anything for 0", out.toString().trim().isEmpty());
    }
}

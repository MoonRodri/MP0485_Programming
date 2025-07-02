package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P19_RightTriangleTest {

    private String runPrintTriangle(int size) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            P19_RightTriangle.printTriangle(size);
        } finally {
            System.setOut(originalOut);
        }

        return outContent.toString().replace("\r\n", "\n");
    }

    @Test
    public void testTriangleSize1() {
        String expected = "*\n";
        assertEquals(expected, runPrintTriangle(1));
    }

    @Test
    public void testTriangleSize3() {
        String expected = 
              "  *\n" +
              " **\n" +
              "***\n";
        assertEquals(expected, runPrintTriangle(3));
    }

    @Test
    public void testTriangleSize5() {
        String expected = 
              "    *\n" +
              "   **\n" +
              "  ***\n" +
              " ****\n" +
              "*****\n";
        assertEquals(expected, runPrintTriangle(5));
    }

    @Test
    public void testTriangleSize0() {
        // No output expected for size 0
        assertEquals("", runPrintTriangle(0));
    }
}

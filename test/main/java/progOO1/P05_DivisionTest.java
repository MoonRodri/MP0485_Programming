package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P05_DivisionTest {

    @Test
    public void testDivisionTwoByOne() {
        assertPrintedOutput("2.0", 2, 1);
    }

    @Test
    public void testDivisionThreeByFive() {
        assertPrintedOutput("0.6", 3, 5);
    }

    @Test
    public void testDivisionZeroByAnyNumber() {
        assertPrintedOutput("0.0", 0, 5);
    }

    @Test
    public void testDivisionFiveByTwo() {
        assertPrintedOutput("2.5", 5, 2);
    }

    private void assertPrintedOutput(String expected, int numerator, int denominator) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        try {
            P05_Division.division(numerator, denominator);
        } finally {
            System.setOut(originalOut);
        }

        assertEquals("Output mismatch for division(" + numerator + "," + denominator + ")",
                expected, out.toString().trim());
    }
}

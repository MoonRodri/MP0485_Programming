package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P06_DivisibleByThreeTest {

    @Test
    public void testRangeTwoToTen() {
        assertOutputEquals("3\n6\n9", 2, 10);
    }

    @Test
    public void testRangeOneToThree() {
        assertOutputEquals("3", 1, 3);
    }

    @Test
    public void testRangeThreeToThree() {
        assertOutputEquals("3", 3, 3);
    }

    @Test
    public void testNoDivisibleValues() {
        assertOutputEquals("", 1, 2);
    }

    private void assertOutputEquals(String expected, int start, int end) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        try {
            P06_DivisibleByThree.divisibleByThreeInRange(start, end);
        } finally {
            System.setOut(originalOut);
        }

        String actual = output.toString().trim().replace("\r\n", "\n").replace("\r", "\n");
        assertEquals("Unexpected output for range (" + start + ", " + end + ")", expected, actual);
    }
}

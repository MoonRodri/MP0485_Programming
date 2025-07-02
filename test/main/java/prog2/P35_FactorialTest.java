package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P35_FactorialTest {

    private void testOutput(String input, String expectedOutput) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            P35_Factorial.main(new String[0]);

            String output = outContent.toString().replace("\r\n", "\n").trim();
            expectedOutput = expectedOutput.replace("\r\n", "\n").trim();

            assertTrue("Expected output to contain:\n" + expectedOutput + "\nbut was:\n" + output,
                    output.contains(expectedOutput));
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testFactorialOf0() {
        testOutput("0\n", "Factorial: 1");
    }

    @Test
    public void testFactorialOf1() {
        testOutput("1\n", "Factorial: 1");
    }

    @Test
    public void testFactorialOf3() {
        testOutput("3\n", "Factorial: 6");
    }

    @Test
    public void testFactorialOf5() {
        testOutput("5\n", "Factorial: 120");
    }

    @Test
    public void testFactorialOf7() {
        testOutput("7\n", "Factorial: 5040");
    }
}

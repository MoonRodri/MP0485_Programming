package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P43_AverageOfAListTest {

    private String runWithInput(String input) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));

            P43_AverageOfAList.main(new String[0]);

            return out.toString().replace("\r\n", "\n").trim();

        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testAverageMultipleNumbers() {
        String input = "10\n20\n30\n-1\n";
        String output = runWithInput(input);

        assertTrue("Output should contain 'Average: 20.0', but was:\n" + output,
                   output.contains("Average: 20.0"));
    }

    @Test
    public void testAverageSingleNumber() {
        String input = "5\n-1\n";
        String output = runWithInput(input);

        assertTrue("Output should contain 'Average: 5.0', but was:\n" + output,
                   output.contains("Average: 5.0"));
    }

    @Test
    public void testAverageWithNegatives() {
        String input = "-5\n5\n-1\n";
        String output = runWithInput(input);

        assertTrue("Output should contain 'Average: 0.0', but was:\n" + output,
                   output.contains("Average: 0.0"));
    }
}

package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P42_SumOfAListTest {

    private String runWithInput(String input) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));

            P42_SumOfAList.main(new String[0]);

            return out.toString().replace("\r\n", "\n").trim();

        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testSumOfMultipleNumbers() {
        String input = "3\n5\n7\n-1\n";
        String output = runWithInput(input);

        assertTrue("Output should contain 'Sum: 15', but was:\n" + output,
                   output.contains("Sum: 15"));
    }

    @Test
    public void testSumWithNegativeNumbers() {
        String input = "-3\n10\n-2\n-1\n";
        String output = runWithInput(input);

        assertTrue("Output should contain 'Sum: 5', but was:\n" + output,
                   output.contains("Sum: 5"));
    }

    @Test
    public void testSumEmptyList() {
        String input = "-1\n";
        String output = runWithInput(input);

        assertTrue("Output should contain 'Sum: 0', but was:\n" + output,
                   output.contains("Sum: 0"));
    }
}

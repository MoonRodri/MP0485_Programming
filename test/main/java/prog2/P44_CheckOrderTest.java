package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P44_CheckOrderTest {

    private String runWithInput(String input) {
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            P44_CheckOrder.main(new String[0]);
            return outContent.toString();
        } finally {
            System.setOut(originalOut);
            System.setIn(System.in);
        }
    }

    @Test
    public void testIncreasingSequence() {
        String input = "1\n2\n3\n4\n5\n";
        String output = runWithInput(input);
        assertTrue(output.contains("Increasing sequence."));
    }

    @Test
    public void testDecreasingSequence() {
        String input = "5\n4\n3\n2\n1\n";
        String output = runWithInput(input);
        assertTrue(output.contains("Decreasing sequence."));
    }

    @Test
    public void testUnorderedSequence() {
        String input = "1\n3\n2\n4\n5\n";
        String output = runWithInput(input);
        assertTrue(output.contains("Unordered sequence."));
    }

    @Test
    public void testAllEqual() {
        String input = "7\n7\n7\n7\n7\n";
        String output = runWithInput(input);
        assertTrue(output.contains("All numbers are equal."));
    }
}

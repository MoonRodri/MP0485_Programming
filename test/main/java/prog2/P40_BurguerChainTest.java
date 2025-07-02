package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

import main.java.prog2.P40_BurguerChain;

public class P40_BurguerChainTest {

    @Test
    public void testLargeGiftCard() {
        String input = "2000\n";
        String output = runProgramWithInput(input);
        assertTrue("Expected output to contain 'Gets a large gift card!' but was:\n" + output,
                output.contains("Gets a large gift card!"));
    }

    @Test
    public void testRegularGiftCard() {
        String input = "1000\n";
        String output = runProgramWithInput(input);
        assertTrue("Expected output to contain 'Gets a gift card!' but was:\n" + output,
                output.contains("Gets a gift card!"));
    }

    @Test
    public void testGetsNothing() {
        String input = "850\n";
        String output = runProgramWithInput(input);
        assertTrue("Expected output to contain 'Gets nothing.' but was:\n" + output,
                output.contains("Gets nothing."));
    }

    @Test
    public void testZeroGetsNothing() {
        String input = "0\n";
        String output = runProgramWithInput(input);
        assertTrue("Expected output to contain 'Gets nothing.' but was:\n" + output,
                output.contains("Gets nothing."));
    }

    @Test
    public void testOtherLargeGiftCard() {
        String input = "4000\n";
        String output = runProgramWithInput(input);
        assertTrue("Expected output to contain 'Gets a large gift card!' but was:\n" + output,
                output.contains("Gets a large gift card!"));
    }

    // Helper method to simulate input and capture output
    private String runProgramWithInput(String input) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        ByteArrayInputStream testIn = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream testOut = new ByteArrayOutputStream();
        System.setIn(testIn);
        System.setOut(new PrintStream(testOut));

        try {
            P40_BurguerChain.main(new String[0]);
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }

        return testOut.toString();
    }
}

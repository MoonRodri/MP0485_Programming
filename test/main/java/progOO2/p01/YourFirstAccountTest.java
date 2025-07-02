package main.java.progOO2.p01;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class YourFirstAccountTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void redirectOutput() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreOutput() {
        System.setOut(originalOut);
    }

    @Test
    public void testMainOutputContainsExpectedBalance() {
        YourFirstAccount.main(new String[0]);

        String output = outContent.toString().trim();
        assertTrue("Expected output to contain balance 70.0, but was: " + output,
                   output.contains("70.0"));
        assertTrue("Expected output to contain name 'James', but was: " + output,
                   output.contains("James"));
    }
}

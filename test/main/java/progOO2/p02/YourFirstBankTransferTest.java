package main.java.progOO2.p02;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class YourFirstBankTransferTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testBankTransferOutput() {
        YourFirstBankTransfer.main(new String[0]);
        String output = outContent.toString().trim();

        assertTrue("Expected Matthews' balance to be 900.0, but got: " + output,
                   output.contains("Matthews") && output.contains("900.0"));
        assertTrue("Expected Sophie's balance to be 100.0, but got: " + output,
                   output.contains("Sophie") && output.contains("100.0"));
    }
}

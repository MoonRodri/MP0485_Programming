package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P37_MultiplicationTablesTest {

    private String getOutput() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        try {
            P37_MultiplicationTables.main(new String[0]);
        } finally {
            System.setOut(originalOut);
        }
        return outContent.toString().replace("\r\n", "\n");
    }

    @Test
    public void testContains2x3() {
        String output = getOutput();
        assertTrue("Output should contain '2 x 3 = 6'", output.contains("2 x 3 = 6"));
    }

    @Test
    public void testContains5x10() {
        String output = getOutput();
        assertTrue("Output should contain '5 x 10 = 50'", output.contains("5 x 10 = 50"));
    }

    @Test
    public void testContains10x10() {
        String output = getOutput();
        assertTrue("Output should contain '10 x 10 = 100'", output.contains("10 x 10 = 100"));
    }
}

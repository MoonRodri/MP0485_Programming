package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P38_CounterWithETest {

    private String getOutput() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        try {
            P38_CounterWithE.main(new String[0]);
        } finally {
            System.setOut(originalOut);
        }
        return outContent.toString().replace("\r\n", "\n");
    }

    @Test
    public void testStartsWith0000() {
        String output = getOutput();
        assertTrue("Output should contain '0000' as first line", output.contains("0000"));
    }

    @Test
    public void testReplace3FirstDigit() {
        String output = getOutput();
        assertTrue("Output should contain 'E000' with '3' replaced by 'E' in first digit", output.contains("E000"));
    }

    @Test
    public void testReplace3SecondDigit() {
        String output = getOutput();
        assertTrue("Output should contain '0E00' with '3' replaced by 'E' in second digit", output.contains("0E00"));
    }

    @Test
    public void testReplace3ThirdDigit() {
        String output = getOutput();
        assertTrue("Output should contain '00E0' with '3' replaced by 'E' in third digit", output.contains("00E0"));
    }

    @Test
    public void testReplace3FourthDigit() {
        String output = getOutput();
        assertTrue("Output should contain '000E' with '3' replaced by 'E' in fourth digit", output.contains("000E"));
    }

    @Test
    public void testEndsWith9999() {
        String output = getOutput();
        assertTrue("Output should contain '9999' as last line", output.contains("9999"));
    }
}

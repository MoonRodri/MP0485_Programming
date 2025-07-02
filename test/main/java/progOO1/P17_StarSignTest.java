package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P17_StarSignTest {

    private String runPrintStars(int number) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        
        P17_StarSign.printStars(number);
        
        System.setOut(originalOut);
        return outContent.toString().replace("\r\n", "\n");
    }

    @Test
    public void testPrintStarsFive() {
        String output = runPrintStars(5);
        assertEquals("*****\n", output);
    }

    @Test
    public void testPrintStarsZero() {
        String output = runPrintStars(0);
        assertEquals("\n", output);
    }

    @Test
    public void testPrintStarsOne() {
        String output = runPrintStars(1);
        assertEquals("*\n", output);
    }

    @Test
    public void testPrintStarsNine() {
        String output = runPrintStars(9);
        assertEquals("*********\n", output);
    }
}

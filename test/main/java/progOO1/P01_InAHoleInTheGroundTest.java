package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P01_InAHoleInTheGroundTest {

    @Test
    public void testPrintText() {
        // Redirect standard output to capture printed text
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            P01_InAHoleInTheGround.printText();
        } finally {
            System.setOut(originalOut); // Restore original output
        }

        String expected = "In a hole in the ground there lived a method";
        String actual = outContent.toString().trim(); // Trim to ignore newline differences
        assertEquals("The printed output should match the expected text.", expected, actual);
    }
}

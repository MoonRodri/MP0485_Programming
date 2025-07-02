package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P20_ChristmasTreeTest {

    private String runPrintChristmasTree(int height) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            P20_ChristmasTree.printChristmasTree(height);
        } finally {
            System.setOut(originalOut);
        }

        return outContent.toString().replace("\r\n", "\n");
    }

    @Test
    public void testTreeHeight4() {
        String expected =
              "   *\n" +
              "  ***\n" +
              " *****\n" +
              "*******\n" +
              "  ***\n" +
              "  ***\n";
        assertEquals("Christmas tree height 4 output mismatch", expected, runPrintChristmasTree(4));
    }

    @Test
    public void testTreeHeight1() {
        String expected =
              "*\n" +
              "***\n" +
              "***\n";
        assertEquals("Christmas tree height 1 output mismatch", expected, runPrintChristmasTree(1));
    }

    
}

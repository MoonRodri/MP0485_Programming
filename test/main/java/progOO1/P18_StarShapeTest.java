package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P18_StarShapeTest {

    private String runPrintStars(int number) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        P18_StarShape.printStars(number);
        System.setOut(originalOut);
        return outContent.toString().replace("\r\n", "\n");
    }

    private String runPrintSquare(int size) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        P18_StarShape.printSquare(size);
        System.setOut(originalOut);
        return outContent.toString().replace("\r\n", "\n");
    }

    private String runPrintRectangle(int width, int height) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        P18_StarShape.printRectangle(width, height);
        System.setOut(originalOut);
        return outContent.toString().replace("\r\n", "\n");
    }

    private String runPrintTriangle(int size) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        P18_StarShape.printTriangle(size);
        System.setOut(originalOut);
        return outContent.toString().replace("\r\n", "\n");
    }

    @Test
    public void testPrintStars() {
        assertEquals("***\n", runPrintStars(3));
        assertEquals("\n", runPrintStars(0));
        assertEquals("*\n", runPrintStars(1));
    }

    @Test
    public void testPrintSquare() {
        String expected = "***\n***\n***\n";
        assertEquals(expected, runPrintSquare(3));
        
        assertEquals("", runPrintSquare(0));
    }

    @Test
    public void testPrintRectangle() {
        String expected = "*****\n*****\n*****\n";
        assertEquals(expected, runPrintRectangle(5, 3));

        String expectedEmpty = "";
        assertEquals(expectedEmpty, runPrintRectangle(5, 0));
    }

    @Test
    public void testPrintTriangle() {
        String expected = "*\n**\n***\n****\n";
        assertEquals(expected, runPrintTriangle(4));

        String expectedEmpty = "";
        assertEquals(expectedEmpty, runPrintTriangle(0));
    }
}

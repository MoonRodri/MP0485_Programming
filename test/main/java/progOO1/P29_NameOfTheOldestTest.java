package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P29_NameOfTheOldestTest {

    private String runWithInput(String input) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));

            P29_NameOfTheOldest.main(new String[0]);

            return out.toString().replace("\r\n", "\n").trim();

        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testSinglePerson() {
        String input = "Alice,45\n\n";
        String output = runWithInput(input);
        assertEquals("Name of the oldest: Alice", output);
    }

    @Test
    public void testMultiplePeople() {
        String input = "Alice,45\nBob,60\nCharlie,35\n\n";
        String output = runWithInput(input);
        assertEquals("Name of the oldest: Bob", output);
    }

    @Test
    public void testOldestFirst() {
        String input = "Grandpa,99\nTim,12\nSue,34\n\n";
        String output = runWithInput(input);
        assertEquals("Name of the oldest: Grandpa", output);
    }

    @Test
    public void testOldestLast() {
        String input = "Tom,11\nJerry,22\nMartha,77\n\n";
        String output = runWithInput(input);
        assertEquals("Name of the oldest: Martha", output);
    }

    @Test
    public void testSameAge() {
        String input = "Liam,50\nEmma,50\n\n";
        String output = runWithInput(input);
        assertEquals("Name of the oldest: Liam", output);
    }
}

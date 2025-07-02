package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P28_AgeOfTheOldestTest {

    private String runWithInput(String input) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));

            P28_AgeOfTheOldest.main(new String[0]);

            return out.toString().replace("\r\n", "\n").trim();
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testSinglePerson() {
        String output = runWithInput("John,34\n\n");
        assertEquals("Age of the oldest: 34", output);
    }

    @Test
    public void testMultiplePeople() {
        String output = runWithInput("John,34\nMaria,45\nBob,29\n\n");
        assertEquals("Age of the oldest: 45", output);
    }

    @Test
    public void testOldestIsFirst() {
        String output = runWithInput("OldGuy,99\nYoungGuy,21\n\n");
        assertEquals("Age of the oldest: 99", output);
    }

    @Test
    public void testOldestIsLast() {
        String output = runWithInput("Alice,10\nBob,20\nClara,30\n\n");
        assertEquals("Age of the oldest: 30", output);
    }

    @Test
    public void testSameAges() {
        String output = runWithInput("Anna,50\nBen,50\n\n");
        assertEquals("Age of the oldest: 50", output);
    }

    @Test
    public void testNoInput() {
        String output = runWithInput("\n");
        assertEquals("Age of the oldest: 0", output);
    }
}

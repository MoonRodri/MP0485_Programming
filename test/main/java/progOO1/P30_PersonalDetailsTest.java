package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P30_PersonalDetailsTest {

    private String runWithInput(String input) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));

            P30_PersonalDetails.main(new String[0]);

            return out.toString().replace("\r\n", "\n").trim();
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testOneEntry() {
        String input = "Alice,2000\n\n";
        String output = runWithInput(input);
        assertTrue(output.contains("Longest name: Alice"));
        assertTrue(output.contains("Average of the birth years: 2000.0"));
    }

    @Test
    public void testTwoEntriesDifferentLengths() {
        String input = "John,1980\nElizabeth,1995\n\n";
        String output = runWithInput(input);
        assertTrue(output.contains("Longest name: Elizabeth"));
        assertTrue(output.contains("Average of the birth years: 1987.5"));
    }

    @Test
    public void testThreeEntries() {
        String input = "Ana,1999\nMark,1990\nChristopher,1985\n\n";
        String output = runWithInput(input);
        assertTrue(output.contains("Longest name: Christopher"));
        assertTrue(output.contains("Average of the birth years: 1991.3333333333333"));
    }

    @Test
    public void testEmptyInput() {
        String output = runWithInput("\n");
        assertTrue(output.contains("Longest name:"));
        assertTrue(output.contains("Average of the birth years: NaN"));
    }

    @Test
    public void testNamesWithSameLength() {
        String input = "Anna,1991\nLiam,1993\n\n";
        String output = runWithInput(input);
        assertTrue(output.contains("Longest name: Anna")); // First with longest length
        assertTrue(output.contains("Average of the birth years: 1992.0"));
    }
}

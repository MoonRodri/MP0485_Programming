package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P45_SwapTest {

    @Test
    public void testSwapIndices() {
        String input = "1\n3\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            P45_Swap.main(new String[0]);

            String output = outContent.toString();

            // Expected original array output (lines with numbers and line breaks)
            String expectedOriginal =
                "1\n" +
                "3\n" +
                "5\n" +
                "7\n" +
                "9\n";

            // Expected swapped array output (indices 1 and 3 swapped)
            String expectedSwapped =
                "1\n" +
                "7\n" +
                "5\n" +
                "3\n" +
                "9\n";

            // Extract first 5 lines (original array print)
            String[] lines = output.split("\\r?\\n");

            // Find the first block of 5 numbers — usually first 5 non-empty lines
            StringBuilder originalPrinted = new StringBuilder();
            int count = 0;
            for (String line : lines) {
                if (!line.trim().isEmpty() && count < 5) {
                    originalPrinted.append(line).append("\n");
                    count++;
                }
                if (count == 5) break;
            }

            assertEquals("Original array output does not match:", expectedOriginal, originalPrinted.toString());

            // Find the last block of 5 numbers (after swap)
            StringBuilder swappedPrinted = new StringBuilder();
            count = 0;
            for (int i = lines.length - 1; i >= 0; i--) {
                String line = lines[i].trim();
                if (!line.isEmpty()) {
                    swappedPrinted.insert(0, line + "\n");
                    count++;
                }
                if (count == 5) break;
            }

            assertEquals("Swapped array output does not match:", expectedSwapped, swappedPrinted.toString());

        } finally {
            System.setOut(originalOut);
            System.setIn(System.in);
        }
    }
}

package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P45_WeeklySalesTest {

    @Test
    public void testWeeklySalesOutputFormatAndRange() {
        // Capture output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run main method
        P45_WeeklySales.main(new String[0]);

        // Restore original System.out
        System.setOut(originalOut);

        String output = outContent.toString().replace("\r\n", "\n").trim();

        // Split output lines
        String[] lines = output.split("\n");

        // We expect exactly 8 lines: 7 days + total line
        assertEquals(8, lines.length);

        int totalSalesFromLines = 0;

        for (int i = 0; i < 7; i++) {
            // Check format: "Day X: $Y"
            assertTrue("Line format incorrect: " + lines[i], lines[i].matches("Day \\d+: \\$\\d+"));

            // Extract day number and sales number
            String[] parts = lines[i].split(": \\$");
            int day = Integer.parseInt(parts[0].substring(4));
            int sales = Integer.parseInt(parts[1]);

            // Check day correctness (1 to 7)
            assertEquals(i + 1, day);

            // Check sales range 50 <= sales <= 200
            assertTrue("Sales out of range: " + sales, sales >= 50 && sales <= 200);

            totalSalesFromLines += sales;
        }

        // Check total line format: "Total sales this week(8 days): $TOTAL"
        assertTrue(
                "Total line format incorrect. Expected format: Total sales this week(7 days): $<number>. Got: " + lines[7],
                lines[7].matches("Total sales this week\\(7 days\\): \\$\\d+")
        );

        // Extract total sales from last line
        String totalPart = lines[7].split(": \\$")[1];
        int totalSalesReported = Integer.parseInt(totalPart);

        // Check total sales correctness
        assertEquals(totalSalesFromLines, totalSalesReported);
    }
}

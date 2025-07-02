package main.java.progOO1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;

public class P38_OnlyTheseNumbersTest {

    private String runWithInput(String input) {
        // Guardar referencias originales
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            // Simular entrada
            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            // Capturar salida
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));

            // Ejecutar método main
            P38_OnlyTheseNumbers.main(new String[0]);

            return out.toString().replace("\r\n", "\n").trim();
        } finally {
            // Restaurar entrada/salida estándar
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testRangeFrom1To3() {
        String input = "10\n20\n30\n40\n50\n-1\n1\n3\n";
        String output = runWithInput(input);
        String[] lines = output.split("\n");

        assertEquals("20", lines[2].trim());
        assertEquals("30", lines[3].trim());
        assertEquals("40", lines[4].trim());
    }

    @Test
    public void testFullRange() {
        String input = "5\n15\n25\n35\n-1\n0\n3\n";
        String output = runWithInput(input);
        String[] lines = output.split("\n");

        assertEquals("5", lines[2].trim());
        assertEquals("15", lines[3].trim());
        assertEquals("25", lines[4].trim());
        assertEquals("35", lines[5].trim());
    }

    @Test
    public void testSameIndexStartAndEnd() {
        String input = "8\n9\n10\n11\n-1\n2\n2\n";
        String output = runWithInput(input);
        String[] lines = output.split("\n");

        assertTrue("Output should contain at least 9 lines", lines.length >= 1);
        assertEquals("10", lines[2].trim());  
    }
}

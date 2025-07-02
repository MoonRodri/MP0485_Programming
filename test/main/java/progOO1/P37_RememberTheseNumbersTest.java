package main.java.progOO1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;

public class P37_RememberTheseNumbersTest {

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

            // Ejecutar el método main
            P37_RememberTheseNumbers.main(new String[0]);

            // Devolver resultado formateado
            return out.toString().replace("\r\n", "\n").trim();
        } finally {
            // Restaurar entrada/salida estándar
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testMultipleNumbers() {
        String input = "10\n20\n30\n-1\n";
        String output = runWithInput(input);
        String[] lines = output.split("\n");

        assertEquals(3, lines.length);
        assertEquals("10", lines[0]);
        assertEquals("20", lines[1]);
        assertEquals("30", lines[2]);
    }

    @Test
    public void testSingleNumber() {
        String input = "42\n-1\n";
        String output = runWithInput(input);
        assertEquals("42", output);
    }

    @Test
    public void testNoNumbers() {
        String input = "-1\n";
        String output = runWithInput(input);
        assertEquals("", output);
    }

    @Test
    public void testNegativeNumbers() {
        String input = "-5\n-9\n-1\n";
        String output = runWithInput(input);
        String[] lines = output.split("\n");

        assertEquals(2, lines.length);
        assertEquals("-5", lines[0]);
        assertEquals("-9", lines[1]);
    }
}

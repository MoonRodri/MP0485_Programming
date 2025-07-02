package main.java.progOO1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;

public class P36_FirstAndLastTest {

    private String runWithInput(String input) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            // Simular entrada
            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            // Capturar salida
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));

            // Ejecutar main
            P36_FirstAndLast.main(new String[0]);

            // Obtener salida como string plano
            return out.toString().replace("\r\n", "\n").trim();

        } finally {
            // Restaurar System.in y System.out originales
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testTwoElements() {
        String input = "first\nlast\n\n";
        String output = runWithInput(input);
        String[] lines = output.split("\n");

        assertEquals("first", lines[0]);
        assertEquals("last", lines[1]);
    }

    @Test
    public void testSameElementTwice() {
        String input = "same\nsame\n\n";
        String output = runWithInput(input);
        String[] lines = output.split("\n");

        assertEquals("same", lines[0]);
        assertEquals("same", lines[1]);
    }

    @Test
    public void testOnlyOneElement() {
        String input = "unique\n\n";
        String output = runWithInput(input);
        String[] lines = output.split("\n");

        assertEquals("unique", lines[0]);
        assertEquals("unique", lines[1]);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testEmptyInputThrowsException() {
        String input = "\n";
        runWithInput(input); // should throw
    }
}

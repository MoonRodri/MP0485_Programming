package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;

public class P21_PrintThriceTest {

    private String runWithInput(String input) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));

            P21_PrintThrice.main(new String[0]);

            return out.toString().replace("\r\n", "\n").trim();

        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testPrintThrice() {
        String input = "abc\n";
        String output = runWithInput(input);

        // La salida contiene la petición y la palabra repetida tres veces
        assertTrue(output.contains("Give a word:"));
        assertTrue(output.endsWith("abcabcabc"));
    }

    @Test
    public void testEmptyString() {
        String input = "\n";
        String output = runWithInput(input);

        assertTrue(output.contains("Give a word:"));
        assertTrue(output.endsWith(""));
    }

}

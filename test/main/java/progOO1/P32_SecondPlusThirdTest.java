package main.java.progOO1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;

public class P32_SecondPlusThirdTest {

    private String runWithInput(String input) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            // Simula entrada
            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            // Captura salida
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));

            // Ejecuta el programa
            P32_SecondPlusThird.main(new String[0]);

            return out.toString().replace("\r\n", "\n").trim();
        } finally {
            // Restaurar flujos
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testCorrectSum() {
        String input = "5\n10\n15\n0\n";
        String output = runWithInput(input);
        assertEquals("25", output); // 10 + 15
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWithLessThanThreeNumbers() {
        String input = "7\n2\n0\n"; // only 2 numbers
        runWithInput(input); // expected thrown IndexOutOfBoundsException
    }
}

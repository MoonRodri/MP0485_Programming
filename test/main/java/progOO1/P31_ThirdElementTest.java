package main.java.progOO1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;

public class P31_ThirdElementTest {

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
            P31_ThirdElement.main(new String[0]);

            return out.toString().replace("\r\n", "\n").trim();
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testThirdElementOutput() {
        String input = "apple\nbanana\ncherry\ndate\n\n";
        String output = runWithInput(input);
        assertEquals("cherry", output);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWithLessThanThreeElements() {
        String input = "only\nsecond\n\n"; // Solo dos elementos
        runWithInput(input); // Debería lanzar IndexOutOfBoundsException
    }
}

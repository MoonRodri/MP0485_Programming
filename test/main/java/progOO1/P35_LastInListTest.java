package main.java.progOO1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;

public class P35_LastInListTest {

    private String runWithInput(String input) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));

            P35_LastInList.main(new String[0]);

            return out.toString().replace("\r\n", "\n").trim();

        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testLastOfThree() {
        String input = "red\nblue\ngreen\n\n";
        String output = runWithInput(input);
        assertEquals("green", output);
    }

    @Test
    public void testOnlyOneItem() {
        String input = "solo\n\n";
        String output = runWithInput(input);
        assertEquals("solo", output);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testEmptyInputShouldThrowException() {
        String input = "\n";
        runWithInput(input);
    }
}

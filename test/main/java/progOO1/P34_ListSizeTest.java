package main.java.progOO1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;

public class P34_ListSizeTest {

    private String runWithInput(String input) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));

            P34_ListSize.main(new String[0]);

            return out.toString().replace("\r\n", "\n").trim();

        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testThreeElements() {
        String input = "apple\nbanana\ncherry\n\n";
        String output = runWithInput(input);
        assertTrue("Output should contain correct count", output.contains("In total: 3"));
    }

    @Test
    public void testNoElements() {
        String input = "\n";
        String output = runWithInput(input);
        assertTrue("Output should show count zero", output.contains("In total: 0"));
    }

    @Test
    public void testOneElement() {
        String input = "hello\n\n";
        String output = runWithInput(input);
        assertTrue("Output should show count one", output.contains("In total: 1"));
    }
}

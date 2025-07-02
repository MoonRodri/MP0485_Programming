package main.java.prog2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P10_OddOrEvenTest {

    private String runWithInput(String input) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        P10_OddOrEven.main(new String[0]);

        System.setOut(originalOut);
        System.setIn(System.in);

        return out.toString().replace("\r\n", "\n").trim();
    }

    @Test
    public void testEvenNumber() {
        String output = runWithInput("4\n");
        assertEquals("Give a number:\nNumber is even.", output);
    }

    @Test
    public void testOddNumber() {
        String output = runWithInput("7\n");
        assertEquals("Give a number:\nNumber is odd.", output);
    }
    
    @Test
    public void testZero() {
        String output = runWithInput("0\n");
        assertEquals("Give a number:\nNumber is even.", output);
    }

    @Test
    public void testNegativeOdd() {
        String output = runWithInput("-3\n");
        assertEquals("Give a number:\nNumber is odd.", output);
    }

    @Test
    public void testNegativeEven() {
        String output = runWithInput("-8\n");
        assertEquals("Give a number:\nNumber is even.", output);
    }
}
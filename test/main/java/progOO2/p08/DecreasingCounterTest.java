package main.java.progOO2.p08;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DecreasingCounterTest {

    private DecreasingCounter counter;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        counter = new DecreasingCounter(5); // Start with 5
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testConstructorInitialValue() {
        DecreasingCounter c = new DecreasingCounter(10);
        c.printValue();
        assertTrue(getOutput().contains("value: 10"));
    }

    @Test
    public void testDecrement() {
        counter.decrement();
        counter.printValue();
        assertTrue(getOutput().contains("value: 4"));
    }

    @Test
    public void testDecrementStopsAtZero() {
        counter = new DecreasingCounter(1);
        counter.decrement(); // becomes 0
        counter.decrement(); // stays 0
        counter.printValue();
        assertTrue(getOutput().contains("value: 0"));
    }

    @Test
    public void testReset() {
        counter.decrement(); // 4
        counter.reset();     // 0
        counter.printValue();
        assertTrue(getOutput().contains("value: 0"));
    }

    private String getOutput() {
        String output = outContent.toString().trim();
        outContent.reset();
        return output;
    }
}

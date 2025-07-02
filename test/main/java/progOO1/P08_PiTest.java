package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

public class P08_PiTest {

    @Test
    public void testPiValue() {
        double expected = Math.PI;
        double actual = P08_Pi.pi();
        assertEquals("Expected pi to be " + expected + " but was " + actual, expected, actual, 0.0000001);
    }
}

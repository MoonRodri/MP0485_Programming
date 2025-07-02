package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

public class P09_CenturyTest {

    @Test
    public void testIs21thCentury() {
        boolean expected = true;
        boolean actual = P09_Century.is21thCentury();
        assertEquals("Expected is21thCentury() method to return " + expected + " but was " + actual, expected, actual);
    }
}

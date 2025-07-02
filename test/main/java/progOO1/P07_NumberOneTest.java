package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

public class P07_NumberOneTest {

    @Test
    public void testNumberUnoReturnsOne() {
        int result = P07_NumberOne.numberUno();
        assertEquals("Expected value 1 but was " + result, 1, result);
    }
}

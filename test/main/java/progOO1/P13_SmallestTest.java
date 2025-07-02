package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

public class P13_SmallestTest {

    @Test
    public void testGetSmallest_2and7() {
        assertEquals("Expected smallest of 2 and 7 to be 2", 2, P13_Smallest.getSmallest(2, 7));
    }

    @Test
    public void testGetSmallest_minus3and0() {
        assertEquals("Expected smallest of -3 and 0 to be -3", -3, P13_Smallest.getSmallest(-3, 0));
    }

    @Test
    public void testGetSmallest_10and4() {
        assertEquals("Expected smallest of 10 and 4 to be 4", 4, P13_Smallest.getSmallest(10, 4));
    }

    @Test
    public void testGetSmallest_0andMinus5() {
        assertEquals("Expected smallest of 0 and -5 to be -5", -5, P13_Smallest.getSmallest(0, -5));
    }

    @Test
    public void testGetSmallest_5and5() {
        assertEquals("Expected smallest of 5 and 5 to be 5", 5, P13_Smallest.getSmallest(5, 5));
    }
}

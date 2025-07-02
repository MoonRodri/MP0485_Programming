package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

public class P14_GreatestTest {

    @Test
    public void testGetGreatest_7_2_3() {
        assertEquals("Expected greatest of 7, 2, 3 to be 7", 7, P14_Greatest.getGreatest(7, 2, 3));
    }

    @Test
    public void testGetGreatest_10_5_9() {
        assertEquals("Expected greatest of 10, 5, 9 to be 10", 10, P14_Greatest.getGreatest(10, 5, 9));
    }

    @Test
    public void testGetGreatest_2_8_3() {
        assertEquals("Expected greatest of 2, 8, 3 to be 8", 8, P14_Greatest.getGreatest(2, 8, 3));
    }

    @Test
    public void testGetGreatest_4_9_7() {
        assertEquals("Expected greatest of 4, 9, 7 to be 9", 9, P14_Greatest.getGreatest(4, 9, 7));
    }

    @Test
    public void testGetGreatest_2_5_12() {
        assertEquals("Expected greatest of 2, 5, 12 to be 12", 12, P14_Greatest.getGreatest(2, 5, 12));
    }

    @Test
    public void testGetGreatest_1_3_4() {
        assertEquals("Expected greatest of 1, 3, 4 to be 4", 4, P14_Greatest.getGreatest(1, 3, 4));
    }

    @Test
    public void testGetGreatest_5_5_5() {
        assertEquals("Expected greatest of 5, 5, 5 to be 5", 5, P14_Greatest.getGreatest(5, 5, 5));
    }
}

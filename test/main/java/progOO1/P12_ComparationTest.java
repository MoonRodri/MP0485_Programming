package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

public class P12_ComparationTest {

    @Test
    public void testCompareEqualNumbers_4and4() {
        assertTrue("Expected true for 4 and 4", P12_Comparation.compare(4, 4));
    }

    @Test
    public void testCompareEqualNumbers_0and0() {
        assertTrue("Expected true for 0 and 0", P12_Comparation.compare(0, 0));
    }

    @Test
    public void testCompareEqualNumbers_minus5andminus5() {
        assertTrue("Expected true for -5 and -5", P12_Comparation.compare(-5, -5));
    }

    @Test
    public void testCompareDifferentNumbers_4and3() {
        assertFalse("Expected false for 4 and 3", P12_Comparation.compare(4, 3));
    }

    @Test
    public void testCompareDifferentNumbers_0and1() {
        assertFalse("Expected false for 0 and 1", P12_Comparation.compare(0, 1));
    }

    @Test
    public void testCompareDifferentNumbers_minus5and5() {
        assertFalse("Expected false for -5 and 5", P12_Comparation.compare(-5, 5));
    }
}

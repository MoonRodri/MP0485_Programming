package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

public class P10_WordTest {

    @Test
    public void testWord() {
        String expected = "Welcome";
        String actual = P10_Word.getWord();
        assertEquals("Expected getWord() method to return " + expected + " but was " + actual, expected, actual);
    }
}

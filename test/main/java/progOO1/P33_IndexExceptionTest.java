package main.java.progOO1;

import org.junit.Test;

public class P33_IndexExceptionTest {

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIndexOutOfBounds() {
        // Validate exception is thrown
        P33_IndexException.main(new String[0]);
    }
}

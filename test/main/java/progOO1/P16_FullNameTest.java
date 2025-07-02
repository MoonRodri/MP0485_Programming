package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

public class P16_FullNameTest {

    @Test
    public void testFullNameTypical() {
        String expected = "SMITH, JOHN";
        String actual = P16_FullName.getFullName("John", "Smith");
        assertEquals("Full name should be surname uppercase, comma, name uppercase", expected, actual);
    }

    @Test
    public void testFullNameLowerCase() {
        String expected = "DOE, JANE";
        String actual = P16_FullName.getFullName("jane", "doe");
        assertEquals("Full name with lowercase input should return uppercase formatted", expected, actual);
    }

    @Test
    public void testFullNameMixedCase() {
        String expected = "GARCIA, MARIA";
        String actual = P16_FullName.getFullName("Maria", "Garcia");
        assertEquals("Full name with mixed case input should return uppercase formatted", expected, actual);
    }

    @Test
    public void testFullNameEmptyStrings() {
        String expected = ", ";
        String actual = P16_FullName.getFullName("", "");
        assertEquals("Full name with empty strings should return ', '", expected, actual);
    }
}

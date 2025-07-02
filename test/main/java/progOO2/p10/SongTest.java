package main.java.progOO2.p10;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

public class SongTest {

    @Test
    public void testFieldsArePrivateAndFinal() throws Exception {
        Field nameField = Song.class.getDeclaredField("name");
        assertTrue("Field 'name' should be private", Modifier.isPrivate(nameField.getModifiers()));
        assertTrue("Field 'name' should be final", Modifier.isFinal(nameField.getModifiers()));
        assertEquals("Field 'name' should be of type String", String.class, nameField.getType());

        Field lengthField = Song.class.getDeclaredField("length");
        assertTrue("Field 'length' should be private", Modifier.isPrivate(lengthField.getModifiers()));
        assertTrue("Field 'length' should be final", Modifier.isFinal(lengthField.getModifiers()));
        assertEquals("Field 'length' should be of type int", int.class, lengthField.getType());
    }

    @Test
    public void testConstructorAndAccessors() {
        Song s = new Song("Bohemian Rhapsody", 354);
        assertEquals("name() should return 'Bohemian Rhapsody'", "Bohemian Rhapsody", s.name());
        assertEquals("length() should return 354", 354, s.length());
    }

    @Test
    public void testAnotherSong() {
        Song s = new Song("Imagine", 183);
        assertEquals("name() should return 'Imagine'", "Imagine", s.name());
        assertEquals("length() should return 183", 183, s.length());
    }
}

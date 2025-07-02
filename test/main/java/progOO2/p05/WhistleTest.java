package main.java.progOO2.p05;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

public class WhistleTest {

    @Test
    public void testClassIsPublic() {
        assertTrue("Class Whistle should be public",
                Modifier.isPublic(Whistle.class.getModifiers()));
    }

    @Test
    public void testConstructorExistsAndIsPublic() throws Exception {
        Constructor<Whistle> constructor = Whistle.class.getDeclaredConstructor(String.class);
        assertTrue("Constructor should be public", Modifier.isPublic(constructor.getModifiers()));

        // Should not print anything
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(out));

        Whistle whistle = constructor.newInstance("Kvaak");

        System.setOut(original);
        assertFalse("Constructor should not print anything", out.toString().contains("Kvaak"));
    }

    @Test
    public void testHasOnlyOneField() {
        int count = Whistle.class.getDeclaredFields().length;
        assertEquals("Class should only contain one instance variable", 1, count);
    }

    @Test
    public void testHasSoundMethod() throws Exception {
        Method method = Whistle.class.getDeclaredMethod("sound");
        assertEquals("sound() should return void", void.class, method.getReturnType());
        assertEquals("sound() should have no parameters", 0, method.getParameterCount());
        assertTrue("sound() should be public", Modifier.isPublic(method.getModifiers()));
    }

    @Test
    public void testSoundOutputPeef() throws Exception {
        Whistle whistle = new Whistle("Peef");
        String output = captureOutput(() -> whistle.sound());
        assertTrue("Expected output to contain 'Peef'", output.contains("Peef"));
    }

    @Test
    public void testSoundOutputBleergh() throws Exception {
        Whistle whistle = new Whistle("Bleergh");
        String output = captureOutput(() -> whistle.sound());
        assertTrue("Expected output to contain 'Bleergh'", output.contains("Bleergh"));
    }

    @Test
    public void testConstructorDoesNotPrint() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(out));

        Whistle whistle = new Whistle("Bleergh");

        System.setOut(original);
        assertFalse("Constructor should not print anything", out.toString().contains("Bleergh"));
    }

    // Utility to capture console output
    private String captureOutput(Runnable action) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(out));

        action.run();

        System.out.flush();
        System.setOut(original);
        return out.toString();
    }
}

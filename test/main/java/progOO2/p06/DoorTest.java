package main.java.progOO2.p06;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

public class DoorTest {

    @Test
    public void testClassIsPublic() {
        assertTrue("Class Door should be public",
                Modifier.isPublic(Door.class.getModifiers()));
    }

    @Test
    public void testConstructorExistsAndIsPublicAndHasNoParams() throws Exception {
        Constructor<Door> constructor = Door.class.getDeclaredConstructor();
        assertTrue("Constructor should be public", Modifier.isPublic(constructor.getModifiers()));

        // Should not print anything
        String output = captureOutput(() -> {
            try {
                constructor.newInstance();
            } catch (Exception e) {
                fail("Constructor should be callable with no parameters");
            }
        });
        assertTrue("Constructor should not print anything", output.trim().isEmpty());
    }

    @Test
    public void testKnockMethodExistsAndIsPublic() throws Exception {
        Method method = Door.class.getDeclaredMethod("knock");
        assertEquals("knock() should return void", void.class, method.getReturnType());
        assertEquals("knock() should have no parameters", 0, method.getParameterCount());
        assertTrue("knock() should be public", Modifier.isPublic(method.getModifiers()));
    }

    @Test
    public void testKnockPrintsCorrectMessage() {
        Door door = new Door();
        String output = captureOutput(door::knock);
        assertTrue("Expected output to contain \"Who's there?\"", output.contains("Who's there?"));
    }

    // Utility method to capture output from System.out
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

package main.java.progOO2.p03;

import main.java.progOO2.p03.Dog;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void testHasExactlyThreeInstanceVariables() {
        Field[] fields = Dog.class.getDeclaredFields();
        assertEquals("Dog class should have exactly 3 instance variables", 3, fields.length);
    }

    @Test
    public void testPrivateStringName() {
        checkField("name", String.class);
    }

    @Test
    public void testPrivateStringBreed() {
        checkField("breed", String.class);
    }

    @Test
    public void testPrivateIntAge() {
        checkField("age", int.class);
    }

    // Utility method to validate field name, type, and modifiers
    private void checkField(String fieldName, Class<?> type) {
        try {
            Field field = Dog.class.getDeclaredField(fieldName);
            assertEquals("Field '" + fieldName + "' should be of type " + type.getSimpleName(), type, field.getType());
            assertTrue("Field '" + fieldName + "' should be private", Modifier.isPrivate(field.getModifiers()));
        } catch (NoSuchFieldException e) {
            fail("Field '" + fieldName + "' not found in Dog class.");
        }
    }
}

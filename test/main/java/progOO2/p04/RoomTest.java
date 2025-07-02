package main.java.progOO2.p04;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

public class RoomTest {

    @Test
    public void testHasExactlyTwoFields() {
        Field[] fields = Room.class.getDeclaredFields();
        assertEquals("Room class should have exactly 2 fields", 2, fields.length);
    }

    @Test
    public void testPrivateStringCodeField() {
        checkField("code", String.class);
    }

    @Test
    public void testPrivateIntSeatsField() {
        checkField("numberOfSeats", int.class);
    }

    @Test
    public void testConstructorExistsWithCorrectParameters() {
        try {
            Constructor<Room> constructor = Room.class.getDeclaredConstructor(String.class, int.class);
            assertTrue("Constructor should be public", Modifier.isPublic(constructor.getModifiers()));
        } catch (NoSuchMethodException e) {
            fail("Room class should have a public constructor with parameters (String, int)");
        }
    }

    private void checkField(String fieldName, Class<?> expectedType) {
        try {
            Field field = Room.class.getDeclaredField(fieldName);
            assertEquals("Field '" + fieldName + "' should be of type " + expectedType.getSimpleName(),
                         expectedType, field.getType());
            assertTrue("Field '" + fieldName + "' should be private",
                       Modifier.isPrivate(field.getModifiers()));
        } catch (NoSuchFieldException e) {
            fail("Field '" + fieldName + "' not found in Room class.");
        }
    }
}

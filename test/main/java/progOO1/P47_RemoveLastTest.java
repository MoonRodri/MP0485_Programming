package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;

public class P47_RemoveLastTest {

    @Test
    public void testRemoveLastFromNonEmptyList() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        P47_RemoveLast.removeLast(strings);
        assertEquals("After removing last, size should be 2", 2, strings.size());
        assertEquals("Last element should be 'Second'", "Second", strings.get(strings.size() - 1));

        P47_RemoveLast.removeLast(strings);
        assertEquals("After removing last again, size should be 1", 1, strings.size());
        assertEquals("Last element should be 'First'", "First", strings.get(strings.size() - 1));
    }

    @Test
    public void testRemoveLastFromEmptyList() {
        ArrayList<String> strings = new ArrayList<>();
        P47_RemoveLast.removeLast(strings);
        assertTrue("List should remain empty", strings.isEmpty());
    }

    @Test
    public void testRemoveLastUntilEmpty() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("One");
        strings.add("Two");

        P47_RemoveLast.removeLast(strings);
        P47_RemoveLast.removeLast(strings);
        assertTrue("List should be empty after removing all elements", strings.isEmpty());

        // Removing from empty list again should not cause errors
        P47_RemoveLast.removeLast(strings);
        assertTrue("List should remain empty", strings.isEmpty());
    }
}

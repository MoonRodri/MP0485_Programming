package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class P49_StackTest {

    private ArrayList<Integer> stack;
    private ByteArrayOutputStream outContent;
    private PrintStream originalOut;

    @Before
    public void setUp() {
        stack = new ArrayList<>();
        P49_Stack.fillStack(stack);

        outContent = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outContent));
    }

    private String getOutput() {
        return outContent.toString();
    }

    private void clearOutput() {
        outContent.reset();
    }

    @Test
    public void testPush() {
        // Mock input "42\n"
        java.io.InputStream originalIn = System.in;
        try {
            System.setIn(new ByteArrayInputStream("42\n".getBytes()));
            P49_Stack.push(stack);
        } finally {
            System.setIn(originalIn);
        }
        assertEquals(42, (int) stack.get(0));

        // Fill stack almost full except last
        for (int i = 1; i < stack.size() - 1; i++) {
            stack.set(i, i);
        }

        clearOutput();
        // Should print stack full message
        P49_Stack.push(stack);
        String output = getOutput();
        assertTrue(output.contains("Stack full"));
    }

    @Test
    public void testPop() {
        clearOutput();
        // Pop empty stack message
        P49_Stack.pop(stack);
        assertTrue(getOutput().contains("Stack empty"));

        // Fill some elements
        stack.set(0, 10);
        stack.set(1, 20);
        stack.set(2, -1);

        clearOutput();
        P49_Stack.pop(stack);
        assertEquals(-1, (int) stack.get(1));
        assertEquals(10, (int) stack.get(0));
    }

    @Test
    public void testShowTop() {
        clearOutput();
        P49_Stack.showTop(stack);
        assertTrue(getOutput().contains("Stack empty"));

        stack.set(0, 5);
        stack.set(1, 7);
        stack.set(2, -1);

        clearOutput();
        P49_Stack.showTop(stack);
        assertTrue(getOutput().contains("The top element is 7"));
    }

    @Test
    public void testShowBottom() {
        clearOutput();
        P49_Stack.showBottom(stack);
        assertTrue(getOutput().contains("Stack empty"));

        stack.set(0, 15);
        stack.set(1, 25);

        clearOutput();
        P49_Stack.showBottom(stack);
        assertTrue(getOutput().contains("The bottom element is 15"));
    }
}

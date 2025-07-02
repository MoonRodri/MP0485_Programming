package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P23_LoginTest {

    private String runWithInput(String input) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));

            P23_Login.main(new String[0]);

            return out.toString().replace("\r\n", "\n").trim();

        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testValidAlexLogin() {
        String output = runWithInput("alex\nsunshine\n");
        assertTrue(output.contains("Enter username:"));
        assertTrue(output.contains("Enter password:"));
        assertTrue(output.contains("You have successfully logged in!"));
    }

    @Test
    public void testValidEmmaLogin() {
        String output = runWithInput("emma\nhaskell\n");
        assertTrue(output.contains("You have successfully logged in!"));
    }

    @Test
    public void testInvalidPassword() {
        String output = runWithInput("alex\nwrongpass\n");
        assertTrue(output.contains("Incorrect username or password!"));
    }

    @Test
    public void testInvalidUsername() {
        String output = runWithInput("john\nsunshine\n");
        assertTrue(output.contains("Incorrect username or password!"));
    }

    @Test
    public void testCompletelyWrong() {
        String output = runWithInput("wrong\nwrong\n");
        assertTrue(output.contains("Incorrect username or password!"));
    }

    @Test
    public void testCaseSensitivity() {
        String output = runWithInput("Alex\nSunshine\n");
        assertTrue("Login should be case-sensitive", output.contains("Incorrect username or password!"));
    }
}

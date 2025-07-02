package main.java.progOO2.p09;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

public class DebtTest {

    @Test
    public void testClassIsPublic() {
        assertTrue("Class Debt should be public", Modifier.isPublic(Debt.class.getModifiers()));
    }

    @Test
    public void testConstructorExistsAndIsPublic() throws Exception {
        Constructor<Debt> constructor = Debt.class.getDeclaredConstructor(double.class, double.class);
        assertTrue("Constructor must be public", Modifier.isPublic(constructor.getModifiers()));

        String output = captureOutput(() -> {
            try {
                constructor.newInstance(1000.0, 1.05);
            } catch (Exception e) {
                fail("Constructor should be callable");
            }
        });

        assertTrue("Constructor should not print anything", output.trim().isEmpty());
    }

    @Test
    public void testFieldsExistAndPrivate() throws Exception {
        Field balance = Debt.class.getDeclaredField("balance");
        Field rate = Debt.class.getDeclaredField("interestRate");

        assertTrue("Field 'balance' should be private", Modifier.isPrivate(balance.getModifiers()));
        assertEquals("Field 'balance' should be double", double.class, balance.getType());

        assertTrue("Field 'interestRate' should be private", Modifier.isPrivate(rate.getModifiers()));
        assertEquals("Field 'interestRate' should be double", double.class, rate.getType());
    }

    @Test
    public void testPrintBalance() {
        Debt d = new Debt(1000.0, 1.10);
        String output = captureOutput(d::printBalance);
        assertTrue("printBalance should print 1000.0", output.trim().startsWith("1000"));
    }

    @Test
    public void testWaitOneYear() {
        Debt d = new Debt(1000.0, 1.10);
        d.waitOneYear();
        String output = captureOutput(d::printBalance);
        assertTrue("After one year, balance should be ~1100.0", output.trim().startsWith("1100"));
    }

    @Test
    public void testMultipleYears() {
        Debt d = new Debt(1000.0, 1.10);
        d.waitOneYear(); // 1100.0
        d.waitOneYear(); // 1210.0
        d.waitOneYear(); // 1331.0
        String output = captureOutput(d::printBalance);
        assertTrue("After three years, balance should be ~1331.0", output.trim().startsWith("1331"));
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

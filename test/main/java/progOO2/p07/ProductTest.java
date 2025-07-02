package main.java.progOO2.p07;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void testClassIsPublic() {
        assertTrue("Class Product should be public",
                Modifier.isPublic(Product.class.getModifiers()));
    }

    @Test
    public void testConstructorExistsAndIsPublic() throws Exception {
        Constructor<Product> constructor = Product.class.getDeclaredConstructor(String.class, double.class, int.class);
        assertTrue("Constructor should be public", Modifier.isPublic(constructor.getModifiers()));

        String output = captureOutput(() -> {
            try {
                constructor.newInstance("Milk", 2.5, 3);
            } catch (Exception e) {
                fail("Constructor should be callable");
            }
        });

        assertTrue("Constructor should not print anything", output.trim().isEmpty());
    }

    @Test
    public void testFieldsExistAndPrivate() throws Exception {
        Field name = Product.class.getDeclaredField("name");
        Field price = Product.class.getDeclaredField("price");
        Field quantity = Product.class.getDeclaredField("quantity");

        assertTrue("Field 'name' should be private", Modifier.isPrivate(name.getModifiers()));
        assertEquals("Field 'name' should be of type String", String.class, name.getType());

        assertTrue("Field 'price' should be private", Modifier.isPrivate(price.getModifiers()));
        assertEquals("Field 'price' should be of type double", double.class, price.getType());

        assertTrue("Field 'quantity' should be private", Modifier.isPrivate(quantity.getModifiers()));
        assertEquals("Field 'quantity' should be of type int", int.class, quantity.getType());
    }

    @Test
    public void testPrintProductMethodExistsAndPublic() throws Exception {
        Method method = Product.class.getDeclaredMethod("printProduct");
        assertEquals("printProduct should return void", void.class, method.getReturnType());
        assertTrue("printProduct should be public", Modifier.isPublic(method.getModifiers()));
        assertEquals("printProduct should have no parameters", 0, method.getParameterCount());
    }

    @Test
    public void testPrintProductOutput() {
        Product product = new Product("Milk", 2.5, 3);
        String output = captureOutput(product::printProduct);
        assertTrue("Output should contain product name", output.contains("Milk"));
        assertTrue("Output should contain product price", output.contains("2.5"));
        assertTrue("Output should contain product quantity", output.contains("3"));
    }

    // Utility method to capture console output
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

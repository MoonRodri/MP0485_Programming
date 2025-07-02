package main.java.prog2;

/**
 * <b>Content</b> flow control, for nested loops
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P37_MultiplicationTables.png">
 */
public class P37_MultiplicationTables {

    public static void main(String[] args) {
        for (int table = 1; table <= 10; table++) {
            System.out.println("\n\nMultiplication Table of " + table);
            System.out.println("----------------------------");
            for (int i = 1; i <= 10; i++) {
                System.out.println(table + " x " + i + " = " + (table * i));
            }
        }
    }
}

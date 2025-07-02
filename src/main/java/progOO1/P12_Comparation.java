package main.java.progOO1;

/**
 * <b>Content</b> methods, return value based on parameters
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P12_Compare.png">
 */
public class P12_Comparation {

    public static void main(String[] args) {
        boolean result = compare(4, 3);
        if (result) {
            System.out.println("Both numbers are equal");

        } else {
            System.out.println("Both numbers are different");
        }
    }

    public static boolean compare(int num1, int num2) {
        return num1 == num2;
    }
}

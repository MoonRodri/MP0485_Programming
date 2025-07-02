package main.java.prog2;

/**
 * <b>Content</b> array, iterate on elements
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P48_ArrayPrinter.png">
 */
public class P48_ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        if (array.length != 0) {
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print(array[i] + "," + " ");
            }
            System.out.print(array[array.length - 1]);
        }
    }
}

package main.java.progOO1;

/**
 * <b>Content</b> method calling another method
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P18_StarShape.png">
 */
public class P18_StarShape {

    public static void main(String[] args) {
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(3);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(9);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int counter = 0;
        while (counter < size) {
            printStars(size);
            counter++;
        }
    }

    public static void printRectangle(int width, int height) {
        int counter = 0;
        while (counter < height) {
            printStars(width);
            counter++;
        }
    }

    public static void printTriangle(int size) {
        int counter = 1;
        while (counter <= size) {
            printStars(counter);
            counter++;
        }
    }
}

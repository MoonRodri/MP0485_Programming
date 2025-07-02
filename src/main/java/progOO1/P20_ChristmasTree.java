package main.java.progOO1;

/**
 * <b>Content</b> method calling another method
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P20_ChristmasTree.png">
 */
public class P20_ChristmasTree {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }   

    public static void printChristmasTree(int height) {
    	// tree crown
        int starsCounter=1;
        for (int index = 1; index <= height; index++) {
            printSpaces(height-index);
            printStars(starsCounter);
            starsCounter+=2;
        }

        // tree base
        printSpaces(height-2);
        printStars(3);
        printSpaces(height-2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.        
        printChristmasTree(4);
        System.out.println("---");
        printChristmasTree(10);
    }
}

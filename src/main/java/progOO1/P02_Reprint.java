package main.java.progOO1;

import java.util.Scanner;

/**
 * <b>Content</b> methods with parameters
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P02_Reprint.png">
 */
public class P02_Reprint {

    public static void main(String[] args) {
    	// ask the user for how many times should the text be printed
        // then call the printText-method multiple times with a while-loop

        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // The task is to read a user input number
        System.out.println("How many times?");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            printText();
        }
    }
    
    // Don't change the next line that defines the method!
    // (We aren't giving a method a parameter yet)
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}

package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, while loops <hr/><br/>
 * <img src="../../../../javadoc/resources/P24_NumberOfNumbers.png">
 */
public class P24_NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here
        int counter = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            counter++;
        }
        System.out.println("Number of numbers: " + counter);
    }
}

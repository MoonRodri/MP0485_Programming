package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, while loops <hr/><br/>
 * <img src="../../../../javadoc/resources/P26_SumOfNumbers.png">
 */
public class P26_SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            sum += input;
        }
        System.out.println("Sum of the numbers: " + sum);
    }
}

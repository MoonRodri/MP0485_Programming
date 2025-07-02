package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, for loops
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P35_Factorial.png">
 */
public class P35_Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        int sum = 1;

        for (int i = 1; i <= number; i++) {
            sum *= i;
        }
        System.out.println("Factorial: " + sum);
    }
}

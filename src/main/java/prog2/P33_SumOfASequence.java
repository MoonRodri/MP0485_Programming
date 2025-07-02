package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, for loops
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P33_SumOfASequence.png">
 */
public class P33_SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        int lastNumber = Integer.valueOf(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= lastNumber; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}

package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, for loops
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P34_SumOfASequenceTheSequel.png">
 */
public class P34_SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        int firstNumber = Integer.valueOf(scanner.nextLine());
        int lastNumber = Integer.valueOf(scanner.nextLine());
        int sum = 0;

        for (int i = firstNumber; i <= lastNumber; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}

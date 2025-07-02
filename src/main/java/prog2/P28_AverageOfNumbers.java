package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, do while loops <hr/><br/>
 * <img src="../../../../javadoc/resources/P28_AverageOfNumbers.png">
 */
public class P28_AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        int counter = 0;
        int sum = 0;
        boolean exit = false;

        do {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                exit = true;
            } else {
                counter++;
                sum += input;
            }
        } while (!exit);

        if (counter == 0) {
            System.out.println("Average of the numbers: 0.0");
        } else {
            System.out.println("Average of the numbers: " + (sum / (counter * 1.0)));
        }
    }
}

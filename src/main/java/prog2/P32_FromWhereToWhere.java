package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, for loops
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P32_FromWhereToWhere.png">
 */
public class P32_FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // The task is to read a user input number
        System.out.println("Where to? ");
        int numberTo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Where from? ");
        int numberFrom = scanner.nextInt();
        scanner.nextLine();

        // The task is from and to read based on input numbers
        for (int i = numberFrom; i <= numberTo; i++) {
            if (numberTo < numberFrom) {
                break;
            }
            System.out.println(i);
        }
    }
}

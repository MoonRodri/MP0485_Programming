package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, else command <hr/><br/>
 * <img src="../../../../javadoc/resources/P09_ComparingNumbers.png">
 */
public class P09_ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here
        int first = scanner.nextInt();
        scanner.nextLine();
        int second = scanner.nextInt();
        scanner.nextLine();
        if (first > second) {
            System.out.println(first + " is greater than " + second + ".");
        } else if (first < second) {
            System.out.println(first + " is smaller than " + second + ".");
        } else {
            System.out.println(first + " is equal to " + second + ".");
        }
    }
}

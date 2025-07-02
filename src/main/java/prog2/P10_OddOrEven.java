package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, else command <hr/><br/>
 * <img src="../../../../javadoc/resources/P10_OddOrEven.png">
 */
public class P10_OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a number:");
        int number = scan.nextInt();
        if (number % 2 == 0) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is odd.");
        }
    }
}

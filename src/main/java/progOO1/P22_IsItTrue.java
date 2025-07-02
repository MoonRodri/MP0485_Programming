package main.java.progOO1;

import java.util.Scanner;

/**
 * <b>Content</b> strings, comparing
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P22_IsItTrue.png">
 */
public class P22_IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a string: ");
        String myString = scanner.nextLine();

        if (myString.equals("true")) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }

    }
}

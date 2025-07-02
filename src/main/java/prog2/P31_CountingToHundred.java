package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, for loops <hr/><br/>
 * <img src="../../../../javadoc/resources/P31_CountingToHundred.png">
 */
public class P31_CountingToHundred {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);        

        // Write your program here
        // The task is to read a user input number
        int number = Integer.valueOf(scanner.nextLine());
        final int MAX_NUMBER=100;

        // Print until input number
        for (int i = number; i <= MAX_NUMBER; i++) {
            System.out.println(i);                      
        } 
    }
}

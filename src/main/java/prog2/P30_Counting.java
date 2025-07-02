package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, for loops <hr/><br/>
 * <img src="../../../../javadoc/resources/P30_Counting.png">
 */
public class P30_Counting {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        
        // Write your program here
        // The task is to read a user input number
        int number = Integer.valueOf(scanner.nextLine());
       
        // Print until input number
        for (int i = 0; i <= number; i++) {
            System.out.println(i);                      
        }  
    }
}

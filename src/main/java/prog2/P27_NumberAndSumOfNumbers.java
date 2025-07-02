package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, do while loops <hr/><br/>
 * <img src="../../../../javadoc/resources/P27_NumberAndSumOfNumbers.png">
 */
public class P27_NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here
        int counter = 0;
        int sum = 0;        
        boolean exit=false;
        
        do {
        	System.out.println("Give a number:");        	
        	int input = Integer.valueOf(scanner.nextLine());
        	if (input ==0) {
        		exit =true;
			}else {
				sum += input;
				counter++;	
			}
		} while (!exit);
        
        System.out.println("Number of numbers: " + counter);
        System.out.println("Sum of the numbers: " + sum);
    }
}

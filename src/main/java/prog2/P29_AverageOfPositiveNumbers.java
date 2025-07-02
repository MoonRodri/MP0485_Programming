package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, while loops <hr/><br/>
 * <img src="../../../../javadoc/resources/P29_AverageOfPositiveNumbers.png">
 */
public class P29_AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here
        int counter = 0;
        int sum = 0;
        
        boolean exit=false;
        do {
        	 System.out.println("Give a number:");
             int input = Integer.valueOf(scanner.nextLine());
             if (input == 0) {
                 exit=true;
             }
             if (input > 0) {
                 sum += input;
                 counter++;
             }
		} while (!exit);
        
        if (counter != 0) {
            System.out.println(sum / (counter * 1.0));
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}

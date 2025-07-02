package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, for loops
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P36_ThanksBye.png">
 */
public class P36_ThanksBye {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // Write your program here
        int sum = 0;
        int counter = 0;
        int oddCounter = 0;
        int evenCounter = 0;
        System.out.println("Give numbers:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            // When the user writes -1, the program prints "Thx! Bye!" and ends
            if (input == -1) {
                break;
            }
            
            // it prints the sum of the numbers (not including the -1)
            sum += input;
          
            // It prints the number of even and odd numbers (excluding the -1).
            if (input % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
            
            // it also prints the number of numbers (not including the -1)
            counter++;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        System.out.println("Average: " + (sum / (counter * 1.0)));
        System.out.println("Even: " + evenCounter);
        System.out.println("Odd: " + oddCounter);
    }
}

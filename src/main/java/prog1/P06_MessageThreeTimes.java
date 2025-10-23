package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Reading strings</strong><br/>
 *   Program to read input data <br/>
 *   <img src="../../../../javadoc/resources/P06_MessageThreeTimes.png"/>
 * </div>
 */
public class P06_MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        String message = scanner.nextLine();
        // Write your program here

        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
        
        scanner.close();

    }
}

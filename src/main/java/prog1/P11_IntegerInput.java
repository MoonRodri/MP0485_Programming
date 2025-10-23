package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Reading integers</strong><br/>
 *   Program to input integer as a part of output <br/>
 *   <img src="../../../../javadoc/resources/P11_IntegerInput.png"/>
 * </div>
 */
public class P11_IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here

        System.out.println("Give a number:");

        Integer number =Integer.valueOf(scanner.nextLine());

        System.out.println("You gave the number "+number);
        
        scanner.close();
    }
}

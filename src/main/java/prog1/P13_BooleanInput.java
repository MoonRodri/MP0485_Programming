package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Reading booleans</strong><br/>
 *   Program to input boolean as a part of output <br/>
 *   <img src="../../../../javadoc/resources/P13_BooleanInput.png"/>
 * </div>
 */
public class P13_BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean value;
        // Write your program here
        
        System.out.println("Write something:");

        value = Boolean.valueOf(scanner.nextLine());

        System.out.println("True or false? "+ value);



        scanner.close();
    }
}

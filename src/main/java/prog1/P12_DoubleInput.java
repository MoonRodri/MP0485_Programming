package main.java.prog1;

import java.util.Locale;
import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Reading doubles</strong><br/>
 *   Program to input double as a part of output <br/>
 *   <img src="../../../../javadoc/resources/P12_DoubleInput.png"/>
 * </div>
 */
public class P12_DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        scanner.useLocale(Locale.US); // dot as decimal separator

        // Write your program here
        System.out.println("Give me a number:");

        double number;
        number = scanner.nextDouble();

        System.out.println("You gave the number: " + number);
        

        scanner.close();
    }
}

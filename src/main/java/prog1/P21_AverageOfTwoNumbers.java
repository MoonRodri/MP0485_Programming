package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 * <strong>Operators</strong><br/>
 * Program to calculate data <br/>
 * <img src="../../../../javadoc/resources/P21_AverageOfTwoNumbers.png"/>
 * </div>
 */
public class P21_AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");

        Double firstNumber = Double.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");

        Double secondNumber =  Double.valueOf(scanner.nextLine());

        Double average = (firstNumber + secondNumber) / 2;

        System.out.println( "The average is " + average);

        scanner.close();

    }
}

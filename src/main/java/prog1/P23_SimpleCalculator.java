package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 * <strong>Operators</strong><br/>
 * Program to calculate data <br/>
 * <img src="../../../../javadoc/resources/P23_SimpleCalculator.png"/>
 * </div>
 */
public class P23_SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");

        int firstNumber = scanner.nextInt();

        System.out.println("Give the second number:");

        int secondNumber = scanner.nextInt();

        int sumOfNumbers = firstNumber + secondNumber;
        int differenceOfNumbers = firstNumber - secondNumber;
        int productOfNumbers = firstNumber * secondNumber;
        double quotientOfNumbers = (firstNumber*1.0) / (secondNumber*1.0);

        System.out.println(firstNumber + " + " + secondNumber + " = " + sumOfNumbers);
        System.out.println(firstNumber + " - " + secondNumber + " = " + differenceOfNumbers);
        System.out.println(firstNumber + " * " + secondNumber + " = " + productOfNumbers);
        System.out.println(firstNumber + " / " + secondNumber + " = " + quotientOfNumbers);

        scanner.close();
    }
}

package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators</strong><br/>
 *   Program to calculate data <br/>
 *   <img src="../../../../javadoc/resources/P18_AdditionFormula.png"/>
 * </div>
 */
public class P18_AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        System.out.println("Give the first number:");

        int firstNumber = scanner.nextInt();

        System.out.println("Give the second number:");

        int secondNumber = scanner.nextInt();

        int sumOfNumbers = firstNumber + secondNumber;

        System.out.println(firstNumber+" + "+secondNumber+" = "+sumOfNumbers);


        scanner.close();
    }
}

package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 * <strong>Operators</strong><br/>
 * Program to calculate data <br/>
 * <img src="../../../../javadoc/resources/P19_MultiplicationFormula.png"/>
 * </div>
 */
public class P19_MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        System.out.println("Give the first number:");

        int firstNumber = scanner.nextInt();

        System.out.println("Give the second number:");

        int secondNumber = scanner.nextInt();

        int formulaMultiplication = firstNumber * secondNumber;

        System.out.println(firstNumber + " * " + secondNumber + " = " + formulaMultiplication);

        scanner.close();
    }
}

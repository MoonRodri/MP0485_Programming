package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 * <strong>Operators</strong><br/>
 * Program to calculate data <br/>
 * <img src="../../../../javadoc/resources/P22_AverageOfThreeNumbers.png"/>
 * </div>
 */
public class P22_AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");

        Double firstNumber = Double.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");

        Double secondNumber = Double.valueOf(scanner.nextLine());
        
        System.out.println("Give the third number:");

        Double thirdNumber = Double.valueOf(scanner.nextLine());

        Double average = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("The average is " + average);

        scanner.close();

    }
}

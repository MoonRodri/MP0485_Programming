package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 * <strong>Operators</strong><br/>
 * Program to calculate data <br/>
 * <img src="../../../../javadoc/resources/P24_Squared.png"/>
 * </div>
 */
public class P24_Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        int number = scanner.nextInt();

        int squareOfNumber = number * number;

        System.out.println(squareOfNumber);

        scanner.close();

    }
}

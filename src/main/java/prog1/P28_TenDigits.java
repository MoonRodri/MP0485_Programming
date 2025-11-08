package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators</strong><br/>
 *   Program to calculate data<br/>
 *   <img src="../../../../javadoc/resources/P28_TenDigits.png"/>
 * </div>
 */
public class P28_TenDigits {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // Read number
        int number = scanner.nextInt();
        // Calculate ten digit using remainder operator

        int tenDigit = (number / 10) % 10;

        // Print ten digits of number
        
        System.out.println(tenDigit);
        scanner.close();
    }
}

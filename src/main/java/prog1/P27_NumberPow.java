package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Type conversions</strong><br/>
 *   Program to calculate data with Math methods<br/>
 *   <img src="../../../../javadoc/resources/P27_NumberPow.png"/>
 * </div>
 */
public class P27_NumberPow {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // Read number
        int input = scanner.nextInt();
        // Calculate pows using double format
        double square = Math.pow(input, 2);
        double cube = Math.pow(input, 3);
        double fourthPow = Math.pow(input, 4);       
        
        // Print result of three pows as integer
        System.out.println((int)square);
        System.out.println((int)cube);
        System.out.println((int)fourthPow);
                
        scanner.close();
    }
}

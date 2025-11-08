package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators</strong><br/>
 *   Program to calculate data<br/>
 *   <img src="../../../../javadoc/resources/P29_Minutes2Hours.png"/>
 * </div>
 */
public class P29_Minutes2Hours {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // Read number
        int inputMinutes = scanner.nextInt();
        // Calculate hours and minutes
        int hours = inputMinutes / 60;

        //double minutes = (((double)inputMinutes / 60) - hours) * 60;
        double minutes = inputMinutes % 60;

        // Print hours and minutes
        
        System.out.println(hours+" hours and "+(int)minutes+" minutes");

        scanner.close();
    }
}

package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators</strong><br/>
 *   Program to calculate data<br/>
 *   <img src="../../../../javadoc/resources/P30_Seconds2Minutes.png"/>
 * </div>
 */
public class P30_Seconds2Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seconds = scanner.nextInt();

        int minutes = seconds / 60;

        //double minutes = (((double)inputMinutes / 60) - hours) * 60;
        int leftOverSeconds = seconds % 60;

        // Print hours and minutes
        
        System.out.println(minutes+" minutes and "+leftOverSeconds+" seconds");

        scanner.close();
    }
}

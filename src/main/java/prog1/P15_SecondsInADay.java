package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators</strong><br/>
 *   Program to calculate data <br/>
 *   <img src="../../../../javadoc/resources/P15_SecondsInADay.png"/>
 * </div>
 */
public class P15_SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");        
        
        Integer days = Integer.valueOf(scanner.nextLine());

        Integer seconds = days * ( 24 * 60 * 60);

        System.out.println(seconds);

        // Write your program here

        scanner.close();
    }
}

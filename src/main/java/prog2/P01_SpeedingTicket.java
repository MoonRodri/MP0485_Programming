package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, conditional <hr/><br/>
 * <img src="../../../../javadoc/resources/P01_SpeedingTicket.png">
 */
public class P01_SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give speed:"); 
        int speed = scanner.nextInt();
        if (speed > 120) {
            System.out.println("Speeding ticket!");
        }
    }
}

package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, comparison operators <hr/><br/>
 * <img src="../../../../javadoc/resources/P02_Orwell.png">
 */
public class P02_Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a number:");
        int year = scan.nextInt(); 
        if (year == 1984) {
            System.out.println("Orwell");
        }
    }
}

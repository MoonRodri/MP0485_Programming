package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, logical operator <hr/><br/>
 * <img src="../../../../javadoc/resources/P14_LeapYear.png">
 */
public class P14_LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Write your program here
        System.out.println("Give a year: ");
        int year = scan.nextInt();
        if (year % 4 != 0) {
            System.out.println("The year is not a leap year.");
        } else if (year % 400 == 0) {
            System.out.println("The year is a leap year.");
        } else if (year % 100 == 0) {
            System.out.println("The year is not a leap year.");
        } else {
            System.out.println("The year is a leap year.");
        }
    }
}

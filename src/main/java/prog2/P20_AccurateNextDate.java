package main.java.prog2;

import java.time.Year;
import java.util.Scanner;

/**
 * <b>Content</b> flow control, conditional <hr/><br/>
 * <img src="../../../../javadoc/resources/P15_GiftTax.png">
 */
public class P20_AccurateNextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here
        int day, month, year;
        int daysInMonth = 0;

        System.out.print("Enter day: ");
        day = scanner.nextInt();
        System.out.print("Enter month: ");
        month = scanner.nextInt();
        System.out.print("Enter year: ");
        year = scanner.nextInt();

        // Determine days in month
        if (month == 2) {
            daysInMonth = Year.isLeap(year) ? 29 : 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonth = 30;
        } else if (month >= 1 && month <= 12) {
            daysInMonth = 31;
        }

        // Advance one day
        day++;
        if (day > daysInMonth) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }

        // Adjust for missing year zero
        if (year == 0) {
            year = 1;
        }

        System.out.println(day + "/" + month + "/" + year);
    }    
}

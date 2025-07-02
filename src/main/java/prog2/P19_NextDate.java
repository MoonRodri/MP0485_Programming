package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b>: flow control, date logic (fixed 30-day months)<br/>
 * <img src="../../../../javadoc/resources/P19_NextDate.png"/>
 */
public class P19_NextDate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        System.out.print("Enter month: ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // increment the day
        day++;

        // if day exceeds 30, reset to 1 and increment month
        if (day > 30) {
            day = 1;
            month++;

            // if month exceeds 12, reset to 1 and increment year
            if (month > 12) {
                month = 1;
                year++;
            }
        }

        // correct transition from year -1 to year +1 (no year 0)
        if (year == 0) {
            year = 1;
        }

        System.out.println(day + "/" + month + "/" + year);
    }
}

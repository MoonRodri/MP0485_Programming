package main.java.prog2;

import java.util.Scanner;

/**
 * Program that asks for time in hours, minutes and seconds,
 * and prints the time one second later.
 */
public class P17_NextSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int h, m, s;
        System.out.print("Enter hours: ");
        h = scanner.nextInt();
        System.out.print("Enter minutes: ");
        m = scanner.nextInt();
        System.out.print("Enter seconds: ");
        s = scanner.nextInt();
        
        // Assume valid input
        s++;
        if (s >= 60) {
            s = 0;
            m++;
            if (m >= 60) {
                m = 0;
                h++;
                if (h >= 24) {
                    h = 0;
                }
            }
        }

        System.out.println("Time: " + h + ":" + m + ":" + s);
        scanner.close();
    }
}

package main.java.prog2;

import java.util.Scanner;

/**
 * Program that asks for a numeric grade from 0 to 10
 * and displays it as a word in uppercase.Show invalid grade in case number is not in that range
 * use switch to implement the algorithm
 */
public class P18_NumberToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Enter a numeric grade between 0 and 10: ");
        int num = scanner.nextInt();

        switch (num) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            case 10:
                System.out.println("TEN");
                break;
            default:
                System.out.println("Invalid grade.");
                break;
        }

        scanner.close();
    }
}

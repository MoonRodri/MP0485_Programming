package main.java.prog2;

import java.util.Scanner;

public class P41_NumberReader {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("The numbers are:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }

        scanner.close();
    }
}

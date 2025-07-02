package main.java.prog2;

import java.util.Scanner;

public class P44_CheckOrder {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        boolean increasing = false;
        boolean decreasing = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Reading numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number: ");
            numbers[i] = scanner.nextInt();
        }

        // Check order
        for (int i = 0; i < 4; i++) {
            if (numbers[i] > numbers[i + 1]) {
                decreasing = true;
            }
            if (numbers[i] < numbers[i + 1]) {
                increasing = true;
            }
        }

        if (increasing && !decreasing) {
            System.out.println("Increasing sequence.");
        } else if (!increasing && decreasing) {
            System.out.println("Decreasing sequence.");
        } else if (increasing && decreasing) {
            System.out.println("Unordered sequence.");
        } else { // neither increasing nor decreasing
            System.out.println("All numbers are equal.");
        }

        scanner.close();
    }
}

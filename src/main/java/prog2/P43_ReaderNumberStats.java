package main.java.prog2;

import java.util.Scanner;

public class P43_ReaderNumberStats {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int sumPos = 0, countPos = 0;
        int sumNeg = 0, countNeg = 0;
        int countZero = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        for (int num : numbers) {
            if (num == 0) {
                countZero++;
            } else if (num > 0) {
                sumPos += num;
                countPos++;
            } else {
                sumNeg += num;
                countNeg++;
            }
        }

        if (countPos == 0) {
            System.out.println("Cannot calculate average of positive numbers");
        } else {
            System.out.println("Average of positive numbers: " + ((float) sumPos / countPos));
        }

        if (countNeg == 0) {
            System.out.println("Cannot calculate average of negative numbers");
        } else {
            System.out.println("Average of negative numbers: " + ((float) sumNeg / countNeg));
        }

        System.out.println("Count of zeros: " + countZero);

        scanner.close();
    }
}

package main.java.progOO1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <b>Content</b> arraylist, iterate over a list with for each
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P42_SumOfAList.png">
 */
public class P42_SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // print sum of all numbers from list
        int sum = 0;
        for (Integer number : list) {
            sum += number;
        }
        System.out.println("Sum: " + sum);
    }
}

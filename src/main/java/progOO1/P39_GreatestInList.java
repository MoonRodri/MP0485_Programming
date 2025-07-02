package main.java.progOO1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <b>Content</b> arraylist, iterate over a list
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P39_GreatestInList.png">
 */
public class P39_GreatestInList {

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

        // implement finding the greatest number in the list here
        int greatest = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);

            if (greatest < number) {
                greatest = number;
            }
        }

        System.out.println("The greatest number: " + greatest);
    }
}

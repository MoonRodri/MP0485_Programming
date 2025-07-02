package main.java.progOO1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <b>Content</b> arraylist, iterate over a list
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P40_IndexOf.png">
 */
public class P40_IndexOf {

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

        // implement here finding the indices of a number
        System.out.println("Search for?");
        int number = Integer.valueOf(scanner.nextLine());
        int index;

        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            if (number == value) {
                index = i;
                System.out.println(number + " is at index " + index);
            }
        }
    }
}

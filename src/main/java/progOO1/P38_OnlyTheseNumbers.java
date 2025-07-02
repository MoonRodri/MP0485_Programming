package main.java.progOO1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <b>Content</b> arraylist, iterate over a list
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P38_OnlyTheseNumbers.png">
 */
public class P38_OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }

        System.out.println("From where?");
        int start = Integer.valueOf(scanner.nextLine());
        System.out.println("To where?");
        int end = Integer.valueOf(scanner.nextLine());
        
        for (int i = start; i <= end; i++) {
            System.out.println(numbers.get(i));
        }

    }
}

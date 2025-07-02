package main.java.progOO1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <b>Content</b> arraylist, get values
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P32_SecondPlusThird.png">
 */
public class P32_SecondPlusThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            
            numbers.add(number);
        }

        System.out.println(numbers.get(1) + numbers.get(2));
    }
}

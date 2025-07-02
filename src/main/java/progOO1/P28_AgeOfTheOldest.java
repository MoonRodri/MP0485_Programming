package main.java.progOO1;

import java.util.Scanner;

/**
 * <b>Content</b> strings, split
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P28_AgeOfTheOldest.png">
 */
public class P28_AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        int oldest = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] data = input.split(",");
            age = Integer.valueOf(data[1]);
            if (age > oldest) {
                oldest = age;
            }
        }

        System.out.println("Age of the oldest: " + oldest);

    }
}

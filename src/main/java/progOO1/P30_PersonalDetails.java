package main.java.progOO1;

import java.util.Scanner;

/**
 * <b>Content</b> strings, split
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P30_PersonalDetails.png">
 */
public class P30_PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name = "";
        String longestName = "";
        int sum = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] data = input.split(",");
            name = data[0];
            if (name.length() > longestName.length()) {
                longestName = name;
            }
            for (int i = 0; i < data.length; i++) {
                sum = sum + Integer.valueOf(data[1]);
                count++;
            }
        }
        double average = (1.0 * sum / count);
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);
    }
}

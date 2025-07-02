package main.java.progOO1;

import java.util.Scanner;

/**
 * <b>Content</b> strings, get element
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P26_FirstWords.png">
 */
public class P26_FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] pieces = input.split(" ");
            System.out.println(pieces[0]);
        }

    }
}

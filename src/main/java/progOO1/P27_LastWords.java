package main.java.progOO1;

import java.util.Scanner;

/**
 * <b>Content</b> strings, get element
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P27_LastWords.png">
 */
public class P27_LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] pieces = input.split(" ");
            System.out.println(pieces[pieces.length - 1]);
        }


    }
}

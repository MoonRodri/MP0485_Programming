package main.java.progOO1;

import java.util.Scanner;

/**
 * <b>Content</b> strings, concatenation
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P21_PrintThrice.png">
 */
public class P21_PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Give a word: ");
        String word = scanner.nextLine();
        
        String threeWords = word + word + word;
        
        System.out.println(threeWords);

    }
}

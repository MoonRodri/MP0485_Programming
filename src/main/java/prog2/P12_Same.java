package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, else command <hr/><br/>
 * <img src="../../../../javadoc/resources/P12_Same.png">
 */
public class P12_Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Enter the first string:"); 
        String textA = scan.nextLine();
        System.out.println("Enter the second string:"); 
        String textB = scan.nextLine();
        if (textA.equals(textB)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}

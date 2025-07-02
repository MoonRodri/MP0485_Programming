package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, conditional <hr/><br/>
 * <img src="../../../../javadoc/resources/P13_CheckingTheAge.png">
 */
public class P13_CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Write your program here
        System.out.print("How old are you? ");
        int age = scan.nextInt();
        if (age >= 0 && age <= 120) {
            System.out.println("Ok");
        } else {
            System.out.println("Impossible!");
        }
    }
}

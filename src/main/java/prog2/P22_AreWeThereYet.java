package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, while loops <hr/><br/>
 * <img src="../../../../javadoc/resources/P22_AreWeThereYet.png">
 */
public class P22_AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here
        while (true){
            System.out.println("Give a number:");
            int input = scanner.nextInt();
            if (input == 4) {
                break;
            }
        }
    }
}

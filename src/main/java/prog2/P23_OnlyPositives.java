package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, while loops <hr/><br/>
 * <img src="../../../../javadoc/resources/P23_OnlyPositives.png">
 */
public class P23_OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here
        while (true) {
            System.out.println("Give a number:");
            int input = scanner.nextInt();
            if (input < 0) {
                System.out.println("Unsuitable number");
                continue;
            } else if(input == 0) {
                break;
            } else {
                System.out.println(input * input);
            }
        }
    }
}

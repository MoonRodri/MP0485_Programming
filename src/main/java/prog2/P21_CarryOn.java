package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, while loops <hr/><br/>
 * <img src="../../../../javadoc/resources/P21_CarryOn.png">
 */
public class P21_CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here
        while (true){
            System.out.println("Carry on?");
            String input = scanner.nextLine();
            if (input.equals("no")) {
                break;
            }
        }
    }
}

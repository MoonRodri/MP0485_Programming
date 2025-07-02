package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, else command <hr/><br/>
 * <img src="../../../../javadoc/resources/P08_AbsoluteValue.png">
 */
public class P08_AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println(num * -1);
        } else {
            System.out.println(num);
        }
    }
}

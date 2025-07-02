package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, else command <hr/><br/>
 * <img src="../../../../javadoc/resources/P07_GradesAndPoints.png">
 */
public class P07_GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Write your program here
        System.out.println("Give points [0-100]:");
        int grade = scan.nextInt();
        if (grade < 0) {
            System.out.println("impossible!");
        } else if (grade <= 49 ) {
            System.out.println("failed");
        } else if (grade <= 59 ) {
            System.out.println("1");
        } else if (grade <= 69 ) {
            System.out.println("2");    
        } else if (grade <= 79 ) {
            System.out.println("3");
        } else if (grade <= 89 ) {
            System.out.println("4");
        } else if (grade <= 100 ) {
            System.out.println("5");
        } else {
            System.out.println("incredible!");
        }    
    }
}

package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, else command <hr/><br/>
 * <img src="../../../../javadoc/resources/P06_LargerThanOrEqualTo.png">
 */
public class P06_LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Write your program here
        System.out.println("Give the first number:");
        int numA = scan.nextInt();
        scan.nextLine();
        System.out.println("Give the second number:");
        int numB = scan.nextInt();
        scan.nextLine();
        if (numA > numB) {
            System.out.println("Greater number is: " + numA);
        } else if (numA < numB) {    
            System.out.println("Greater number is: " + numB);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}

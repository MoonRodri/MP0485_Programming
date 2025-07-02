package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> debug code, breakpoints
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P40_BurguerChain.png">
 */
public class P40_BurguerChain {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Customer number: ");
        int y = Integer.valueOf(x.nextLine());

        if (y % 2000 == 0 && y != 0) {
            System.out.println("Gets a large gift card!");
        } else if (y >= 1000 && y % 25 == 0) {
            System.out.println("Gets a gift card!");
        } else {
            System.out.println("Gets nothing.");
        }
//        if (y >= 1000 && y % 25 == 0) {
//            System.out.println("Gets a gift card!");
//        } else if (y % 2000 == 0) {
//            System.out.println("Gets a large gift card!");
//        } else {
//            System.out.println("Gets nothing.");
//        }
    }
}

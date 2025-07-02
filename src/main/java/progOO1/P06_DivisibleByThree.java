package main.java.progOO1;

import java.util.Scanner;

/**
 * <b>Content</b> methods with parameters
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P06_DivisibleByThree.png">
 */
public class P06_DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(2, 10);
    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

}

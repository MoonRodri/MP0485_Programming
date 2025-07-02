package main.java.progOO1;

import java.util.Arrays;

/**
 * <b>Content</b> methods, return value based on parameters
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P14_Greatest.png">
 */
public class P14_Greatest {

    public static void main(String[] args) {
        int result = getGreatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }

    public static int getGreatest(int number1, int number2, int number3) {
//        int[] ar = {number1, number2, number3};
//        Arrays.sort(ar);
//        return ar[2];
        int result = 0;
        if (number1 >= number2 && number1 >= number3) {
            return result = number1;
        }
        if (number2 >= number1 && number2 >= number3) {
            return result = number2;
        }
        if (number3 >= number1 && number3 >= number2) {
            return result = number3;
        }
        return result;
    }
}

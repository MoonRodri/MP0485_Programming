package main.java.progOO1;

/**
 * <b>Content</b> methods, return value based on parameters
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P15_Averaging.png">
 */
public class P15_Averaging {
    public static void main(String[] args) {
        double result = getAverage(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
    
    // implement the sum method here again
    public static int sum(int number1, int number2, int number3, int number4) {
        // write some code here
        return number1 + number2 + number3 + number4;
    }

    public static double getAverage(int number1, int number2, int number3, int number4) {
        //write some code here
        return (double) sum(number1, number2, number3, number4) / 4 * 1.0;
    }
}

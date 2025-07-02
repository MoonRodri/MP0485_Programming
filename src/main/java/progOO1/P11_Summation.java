package main.java.progOO1;
/**
 * <b>Content</b> methods, return value based on parameters
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P11_Summation.png">
 */
public class P11_Summation {
    public static void main(String[] args) {
        int result = sum(4, 3, 6, 1);
        System.out.println("Sum: " + result);
    }
    
    public static int sum(int num1, int num2, int num3, int num4) {
        // Write your code here
        // Remember to include return (at the end)!
        return num1 + num2 + num3 + num4;
    }
}

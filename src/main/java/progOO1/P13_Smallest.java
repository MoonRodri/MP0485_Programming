package main.java.progOO1;

/**
 * <b>Content</b> methods, return value based on parameters
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P13_Smallest.png">
 */
public class P13_Smallest {    
    public static void main(String[] args) {
        int result = getSmallest(2, 7);
        System.out.println("Smallest: " + result);
    }
    
    public static int getSmallest(int number1, int number2) {
        
        return number1 > number2 ? number2 : number1;
    }
}

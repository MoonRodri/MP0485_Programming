package main.java.progOO1;


/**
 * <b>Content</b> methods with parameters
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P05_Division.png">
 */
public class P05_Division {
    
    
    public static void main(String[] args) {
        
        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"
         division(2, 1);
    }

    // implement the method here
    public static void division(int numerator, int denominator) {
    	System.out.println(numerator / (denominator * 1.0));
    }
}

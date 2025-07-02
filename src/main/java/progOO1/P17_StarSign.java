package main.java.progOO1;

/**
 * <b>Content</b> method calling another method
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P17_StarSign.png">
 */
public class P17_StarSign {

    public static void main(String[] args) {        
        printStars(5);
        printStars(3);
        printStars(9);        
    }

    public static void printStars(int number) {
    	// you can print one star with the command
        // System.out.print("*");
        // call the print command n times
        // in the end print a line break with the comand
        // System.out.println("");
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }    
}

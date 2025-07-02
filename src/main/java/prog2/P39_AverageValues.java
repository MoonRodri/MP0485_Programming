package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> debug code, breakpoints
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P39_AverageValues.png">
 */
public class P39_AverageValues {

    public static void main(String[] args) {

    	Scanner scanner = new Scanner(System.in);
    	int values = 0;
    	int sum = 0;

    	while (true) {
    	    System.out.println("Provide a value, a negative value ends the program");
    	    int value = Integer.valueOf(scanner.nextLine());
    	    if (value < 0) {
    	        break;
    	    }

    	    values = values + 1;
    	    sum = sum + value;
    	}

    	if (sum == 0 && values ==0) {
        // if (sum == 0)statement remove values==0
    	    System.out.println("The average of the values could not be calculated.");
    	} else {
    	    System.out.println("Average of values: " + (1.0 * sum / values));
    	}
    }
}

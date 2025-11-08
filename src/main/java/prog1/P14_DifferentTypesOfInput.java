package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Reading different data</strong><br/>
 *   Program to input different data as a part of output <br/>
 *   <img src="../../../../javadoc/resources/P14_DifferentTypesOfInput.png"/>
 * </div>
 */
public class P14_DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        // Write your program here
        System.out.println("Give a string:");
        String string = scan.nextLine();

        System.out.println("Give an integer:");
        Integer integer = Integer.valueOf(scan.nextLine());

        System.out.println("Give a double:");
        Double doubleValue = Double.valueOf(scan.nextLine());

        System.out.println("Give a boolean:");
        boolean booleanValue = scan.nextBoolean();


        System.out.println("You gave the string: "+string);
        System.out.println("You gave the integer: "+integer);
        System.out.println("You gave the double: "+doubleValue);
        System.out.println("You gave the boolean: "+booleanValue);


        scan.close();
    }
}

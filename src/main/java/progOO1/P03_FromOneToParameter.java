package main.java.progOO1;

/**
 * <b>Content</b> methods with parameters
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P03_FromOneToParameter.png">
 */
public class P03_FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(2);
    }

    public static void printUntilNumber(int number) {
        int counter = 1;
        while (counter <= number) {
            System.out.println(counter);
            counter++;
        }
    }

}

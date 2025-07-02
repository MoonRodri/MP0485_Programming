package main.java.progOO1;

/**
 * <b>Content</b> methods with parameters
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P04_FromParameterToOne.png">
 */
public class P04_FromParameterToOne {

    public static void main(String[] args) {
    	printFromNumberToOne(5);	
	}

	public static void printFromNumberToOne(int number) {
        while (true) {
            if (number == 0) {
                break;
            }
            System.out.println(number);
            number--;
        }
    }

}

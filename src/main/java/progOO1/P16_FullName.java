package main.java.progOO1;

/**
 * <b>Content</b> methods, return value based on parameters
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P16_Fullname.png">
 */
public class P16_FullName {

    public static void main(String[] args) {
        String result = getFullName("John", "Smith");
        System.out.println("Full name is: " + result);
    }

    // implement the method here 
    public static String getFullName(String name, String surname) {
        // write some code here
        return (surname.toUpperCase() + ", " + name.toUpperCase());
    }

}

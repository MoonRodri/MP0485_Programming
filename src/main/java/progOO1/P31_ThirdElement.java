package main.java.progOO1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <b>Content</b> arraylist, get values
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P31_ThirdElement.png">
 */
public class P31_ThirdElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        System.out.println(list.get(2));
    }
}

package main.java.progOO1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <b>Content</b> arraylist, get number elements
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P34_ListSize.png">
 */
public class P34_ListSize {

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
        System.out.println("In total: " + list.size());
    }
}

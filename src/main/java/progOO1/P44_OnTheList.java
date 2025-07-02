package main.java.progOO1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <b>Content</b> arraylist, search on a list with contains
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P44_OnTheList.png">
 */
public class P44_OnTheList {

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

        System.out.println("Search for?");
        String search = scanner.nextLine();

        if (list.contains(search)) {
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found!");
        }

    }
}

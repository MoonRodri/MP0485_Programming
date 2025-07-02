package main.java.progOO1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <b>Content</b> arraylist, get number elements
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P36_FirstAndLast.png">
 */
public class P36_FirstAndLast {
    
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
        
        System.out.println(list.get(0));
        System.out.println(list.get(list.size() - 1));
        
    }
}

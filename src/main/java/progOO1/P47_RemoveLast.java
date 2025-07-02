package main.java.progOO1;

import java.util.ArrayList;

/**
 * <b>Content</b> arraylist, remove element
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P47_RemoveLast.png">
 */
public class P47_RemoveLast {

    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() == 0) {
            return;
        }
        strings.remove(strings.size() - 1);
    }

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> strings = new ArrayList<>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");
        strings.add("Fourth");
        strings.add("Fifth");
        strings.add("Sixth");
        
        System.out.println(strings);
        
        removeLast(strings);
        removeLast(strings);
        
        System.out.println(strings);
    }

}

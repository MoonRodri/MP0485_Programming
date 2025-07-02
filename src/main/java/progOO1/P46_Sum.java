package main.java.progOO1;

import java.util.ArrayList;

/**
 * <b>Content</b> arraylist, as input parameter
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P46_Sum.png">
 */
public class P46_Sum {

    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        System.out.println(sum(numbers));
    }

}

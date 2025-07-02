package main.java.progOO1;

import java.util.ArrayList;
import java.util.Scanner;

public class P49_Stack {

    public static void main(String[] args) {
        ArrayList<Integer> stack = new ArrayList<>();
        fillStack(stack);
        int option;
        do {
            option = menu();
            switch (option) {
                case 1:
                    push(stack);
                    break;
                case 2:
                    pop(stack);
                    break;
                case 3:
                    showTop(stack);
                    break;
                case 4:
                    showBottom(stack);
                    break;
            }
        } while (option != 0);
    }

    public static int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.- Push");
        System.out.println("2.- Pop");
        System.out.println("3.- Show Top");
        System.out.println("4.- Show Bottom");
        System.out.println("0.- Exit");
        System.out.print("Choose an option: ");
        return scanner.nextInt();
    }

    public static void fillStack(ArrayList<Integer> stack) {
        stack.clear();
        // Initialize stack with -1 placeholders (max 10 elements)
        for (int i = 0; i < 10; i++) {
            stack.add(-1);
        }
    }

    public static void push(ArrayList<Integer> stack) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        while (index < stack.size() && stack.get(index) != -1) {
            index++;
        }
        if (index < stack.size() - 1) {
            System.out.print("Enter the value to push: ");
            int value = scanner.nextInt();
            stack.set(index, value);
        } else {
            System.out.println("Stack full, cannot insert.");
        }
    }

    public static void pop(ArrayList<Integer> stack) {
        int index = 0;
        if (stack.get(index) == -1) {
            System.out.println("Stack empty, no elements to remove.");
        } else {
            while (index < stack.size() && stack.get(index) != -1) {
                index++;
            }
            stack.set(index - 1, -1);
        }
    }

    public static void showTop(ArrayList<Integer> stack) {
        int index = 0;
        if (stack.get(index) == -1) {
            System.out.println("Stack empty, no elements to show.");
        } else {
            while (index < stack.size() && stack.get(index) != -1) {
                index++;
            }
            System.out.println("The top element is " + stack.get(index - 1));
        }
    }

    public static void showBottom(ArrayList<Integer> stack) {
        if (stack.get(0) == -1) {
            System.out.println("Stack empty, no elements to show.");
        } else {
            System.out.println("The bottom element is " + stack.get(0));
        }
    }
}

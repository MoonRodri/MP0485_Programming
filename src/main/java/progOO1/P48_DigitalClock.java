package main.java.progOO1;

import java.util.ArrayList;
import java.util.Scanner;

public class P48_DigitalClock {

    public static void main(String[] args) {
        ArrayList<Integer> clock = new ArrayList<>();
        initializeClock(clock);
        int option;
        do {
            displayClock(clock);
            option = menu();
            switch (option) {
                case 1 -> incrementHour(clock);
                case 2 -> decrementHour(clock);
                case 3 -> incrementMinute(clock);
                case 4 -> decrementMinute(clock);
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid option");
            }
        } while (option != 0);
    }

    public static void initializeClock(ArrayList<Integer> clock) {
        clock.clear();
        for (int i = 0; i < 4; i++) {
            clock.add(0);
        }
    }

    public static void displayClock(ArrayList<Integer> clock) {
        System.out.println("" + clock.get(0) + clock.get(1) + ":" + clock.get(2) + clock.get(3));
    }

    public static int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.- Increment hour");
        System.out.println("2.- Decrement hour");
        System.out.println("3.- Increment minute");
        System.out.println("4.- Decrement minute");
        System.out.println("0.- Exit");
        System.out.print("Choose an option: ");
        return scanner.nextInt();
    }

    public static void incrementHour(ArrayList<Integer> clock) {
        if (clock.get(0) == 2 && clock.get(1) == 3) {
            clock.set(0, 0);
            clock.set(1, 0);
        } else if (clock.get(1) == 9) {
            clock.set(0, clock.get(0) + 1);
            clock.set(1, 0);
        } else {
            clock.set(1, clock.get(1) + 1);
        }
    }

    public static void decrementHour(ArrayList<Integer> clock) {
        if (clock.get(0) == 0 && clock.get(1) == 0) {
            clock.set(0, 2);
            clock.set(1, 3);
        } else if (clock.get(1) == 0) {
            clock.set(0, clock.get(0) - 1);
            clock.set(1, 9);
        } else {
            clock.set(1, clock.get(1) - 1);
        }
    }

    public static void incrementMinute(ArrayList<Integer> clock) {
        if (clock.get(2) == 5 && clock.get(3) == 9) {
            clock.set(2, 0);
            clock.set(3, 0);
            incrementHour(clock);
        } else if (clock.get(3) == 9) {
            clock.set(2, clock.get(2) + 1);
            clock.set(3, 0);
        } else {
            clock.set(3, clock.get(3) + 1);
        }
    }

    public static void decrementMinute(ArrayList<Integer> clock) {
        if (clock.get(2) == 0 && clock.get(3) == 0) {
            clock.set(2, 5);
            clock.set(3, 9);
            decrementHour(clock);
        } else if (clock.get(3) == 0) {
            clock.set(2, clock.get(2) - 1);
            clock.set(3, 9);
        } else {
            clock.set(3, clock.get(3) - 1);
        }
    }
}

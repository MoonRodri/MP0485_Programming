package main.java.prog2;

import java.util.Scanner;

public class P50_LongJumpCompetition {

    public static void main(String[] args) {
        final int MAX_PARTICIPANTS = 10;
        final int DORSAL = 0, MARK_2000 = 1, MARK_2001 = 2, MARK_2002 = 3;

        int[][] participants = new int[MAX_PARTICIPANTS][4];
        int count = 0;
        int option;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("--------------------------------");
            System.out.println("1. Register participant");
            System.out.println("2. Show list by dorsals");
            System.out.println("3. Show list by 2002 marks");
            System.out.println("4. Exit");
            System.out.println("--------------------------------");
            System.out.print("Please enter an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    if (count == MAX_PARTICIPANTS) {
                        System.out.println("List is full.");
                    } else {
                        int dorsal;
                        boolean repeated;
                        do {
                            System.out.print("Enter dorsal number: ");
                            dorsal = scanner.nextInt();
                            repeated = false;
                            for (int i = 0; i < count; i++) {
                                if (participants[i][DORSAL] == dorsal) {
                                    System.out.println("Dorsal already registered. Try again.");
                                    repeated = true;
                                    break;
                                }
                            }
                        } while (repeated);

                        participants[count][DORSAL] = dorsal;
                        System.out.print("Enter 2000 mark: ");
                        participants[count][MARK_2000] = scanner.nextInt();
                        System.out.print("Enter 2001 mark: ");
                        participants[count][MARK_2001] = scanner.nextInt();
                        System.out.print("Enter 2002 mark: ");
                        participants[count][MARK_2002] = scanner.nextInt();
                        count++;
                    }
                    break;

                case 2:
                    sortBy(participants, count, DORSAL);
                    System.out.println("LIST BY DORSAL:");
                    printParticipants(participants, count);
                    break;

                case 3:
                    sortBy(participants, count, MARK_2002);
                    System.out.println("LIST BY 2002 MARKS:");
                    printParticipants(participants, count);
                    break;
            }

        } while (option != 4);

        System.out.println("Program terminated.");
    }

    public static void sortBy(int[][] array, int count, int field) {
        boolean swapped;
        int temp;
        do {
            swapped = false;
            for (int j = 0; j < count - 1; j++) {
                if (array[j][field] > array[j + 1][field]) {
                    for (int k = 0; k < 4; k++) {
                        temp = array[j][k];
                        array[j][k] = array[j + 1][k];
                        array[j + 1][k] = temp;
                    }
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void printParticipants(int[][] array, int count) {
        System.out.println("Dorsal - Mark2000 - Mark2001 - Mark2002");
        for (int i = 0; i < count; i++) {
            System.out.printf("%d\t%d\t%d\t%d%n",
                    array[i][0], array[i][1], array[i][2], array[i][3]);
        }
    }
}

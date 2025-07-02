package main.java.prog2;

/**
 * Displays a 4-digit counter from 00000 to 99999, replacing any digit 3 with
 * the letter 'E'.
 */
public class P38_CounterWithE {

    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {

                        if (i == 3) {
                            System.out.print("E");
                        } else {
                            System.out.print(i);
                        }
                        if (j == 3) {
                            System.out.print("E");
                        } else {
                            System.out.print(j);
                        }
                        if (k == 3) {
                            System.out.print("E");
                        } else {
                            System.out.print(k);
                        }
                        if (l == 3) {
                            System.out.print("E");
                        } else {
                            System.out.print(l);
                        }

                        System.out.println();

                    }
                }
            }
        }
    }
}

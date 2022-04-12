package Replit_4_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZoombieAttack2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        System.out.println("Day 0 " + Arrays.toString(inhabitants));

        for (int j = 1; j > 0; j++) {
            int count = 0;

            int[] temp = Arrays.copyOf(inhabitants,inhabitants.length);

            if (temp[1] == 0) {
                inhabitants[0] /= 2;
            }
            for (int i = 1; i < inhabitants.length - 1; i++) {

                if (temp[i - 1] == 0 || temp[i + 1] == 0) {
                    inhabitants[i] /= 2;
                }
            }
            if (temp[temp.length - 2] == 0) {
                inhabitants[inhabitants.length - 1] /= 2;
            }
            System.out.println("Day " + (j) + " " + Arrays.toString(inhabitants));

            for (int each : inhabitants) {
                if (each == 0) {
                    count++;
                }
            }
            if (count == 8) {
                break;
            }
        }
        System.out.println("---- EXTINCT ----");



    }
}

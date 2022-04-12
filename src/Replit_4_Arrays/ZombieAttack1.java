package Replit_4_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack1 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = scan.nextInt();
        }
        System.out.println("Day 0 " + Arrays.toString(inhabitants));

        for (int j = 1; j > 0; j++) {

            int count = 0;
            for (int i = 0; i < inhabitants.length; i++) {

                inhabitants[i] /= 2;
                if (inhabitants[i] == 0) {
                    count++;
                }
            }
            System.out.println("Day " + (j) + " " + Arrays.toString(inhabitants));
            if(count == 8){
            break;
            }
        }
           System.out.println("---- EXTINCT ----");
    }
}
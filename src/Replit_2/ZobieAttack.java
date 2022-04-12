package Replit_2;

import java.util.Scanner;

public class ZobieAttack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int population = scan.nextInt();
        int day = 0;

        for (int i = population; i >0 ; i/=2) {

            System.out.println("Day " + day++ + " [" + i + "]");

        }
        System.out.println("---- EXTINCT ----");



    }
}

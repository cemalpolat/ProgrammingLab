package Replit_2;

import java.util.Scanner;

public class PrintTriangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner((System.in));
        System.out.println("Enter a number");
        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= i ; j++) {

                   System.out.print("*");

            }

            System.out.println();

        }

    }
}

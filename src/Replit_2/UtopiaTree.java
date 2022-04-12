package Replit_2;

import java.util.Scanner;

public class UtopiaTree {
    public static void main(String[] args) {
        int year = 0;
        int growth = 0;
        int treeSize = 0;

        for (int i = 1; i <= 3 ; i++) {
            growth = 1;
            treeSize += 1;
            year += 1;

            System.out.println("year " + year + " - growth " + growth + " cm\ntree size: " + treeSize + " cm");
        }
        for (int i = 4; i <= 10 ; i++) {
            growth = 2;
            treeSize += 2;
            year += 1;

            System.out.println("year " + year + " - growth " + growth + " cm\ntree size: " + treeSize + " cm");

        }


    }
}

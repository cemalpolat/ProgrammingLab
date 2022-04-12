package Replit_2;

import java.util.Scanner;

public class CountJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int numJava = 0;

        for (int i = 0; i <= word.length() - 4; i++) {

            if (word.substring(i, i + 4).contains("java")){

                numJava += 1;
            }

        }
        System.out.println(numJava);
    }
}
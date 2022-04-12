package Replit_2;

import java.util.Scanner;

public class CountHi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int numHi = 0;

        for (int i = 0; i <= word.length() - 2; i++) {

            if (word.substring(i, i + 2).contains("hi")) {

                numHi += 1;
            }

        }
        System.out.println(numHi);
    }
}







     /*   Scanner scan= new Scanner(System.in);
        String word = scan.next();

        int num = (word.length())  -  (word.replace("hi","").length());

        int numHi = num/2;

        System.out.println(numHi);

      */



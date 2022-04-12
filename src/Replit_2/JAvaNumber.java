package Replit_2;

import java.util.Scanner;

public class JAvaNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int numHi = 0;

        for (int i = 0; i < word.length() - 1; i++) {

            if (word.substring(i, i + 2).contains("hi")) {

                numHi += 1;
            }

        }
        System.out.println(numHi);


    }
}

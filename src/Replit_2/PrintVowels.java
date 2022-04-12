package Replit_2;

import java.util.Scanner;

public class PrintVowels {
    public static void main(String[] args) {

        String check = "aeiou";

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        for (int i = 0; i < word.length(); i++) {
            String chr = "" + word.charAt(i);
            if (check.contains(chr)){
                System.out.print(chr);
            }

        }
    }
}

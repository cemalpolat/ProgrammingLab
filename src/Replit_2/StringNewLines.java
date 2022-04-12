package Replit_2;

import java.util.Scanner;

public class StringNewLines {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        for (int i = 0; i <= word.length()-1 ; i++) {
           char ch = word.charAt(i);
            System.out.println(ch);

        }


    }
}

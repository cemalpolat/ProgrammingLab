package Replit_1;

import java.util.Scanner;

public class StringNoEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();

        System.out.println(word.substring(0, word.length()-1));




    }
}

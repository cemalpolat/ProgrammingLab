package Replit_1;

import java.util.Scanner;

public class PrintHalfTwice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

        String word1 = word.substring(0,word.length()/2);

        System.out.println(word1 + word1);


    }
}

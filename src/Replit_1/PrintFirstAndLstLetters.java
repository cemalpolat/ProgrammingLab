package Replit_1;

import java.util.Scanner;

public class PrintFirstAndLstLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.println(""+ word.charAt(0) + word.charAt(word.length()-1));
    }
}

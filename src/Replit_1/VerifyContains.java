package Replit_1;

import java.util.Scanner;

public class VerifyContains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();

      boolean a = (sentence.contains(word));

        System.out.println(a);

    }
}

package Replit_2;

import java.util.Scanner;

public class Triplets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        int num = 0;

        for (int i = 0; i <= word.length()-3 ; i++) {

        if (word.charAt(i) == word.charAt(i+1)  &&   word.charAt(i+1) == word.charAt(i+2) ){

            num += 1;

            }
        }
        System.out.println(num);
    }
}

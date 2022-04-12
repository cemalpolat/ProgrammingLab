package Replit_4_Arrays;

import java.util.Scanner;

public class SplitSentence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sentence = scan.nextLine();

        String [] arr = sentence.split(" ");

        for (String s : arr) {

            System.out.println(s);

        }




    }
}

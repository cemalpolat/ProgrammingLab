package Replit_6_Methods;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        wordCount(str);
    }


    public static void wordCount (String sentence){

        String [] arr  = sentence.split(" ");
        int count = 0;
        for (String each : arr) {

            count++;
        }
        System.out.println(count);
        }
}

package Replit_6_Methods;

import java.util.Scanner;

public class CleanString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        String word = scan.nextLine();

        String result = badWord(sentence,word);
        System.out.println(result);

    }

    public static String badWord (String sentence, String word) {

        String result = "";
        String[] arr = sentence.split(" ");

        for (String each : arr) {
            if (!each.equals(word)) {

                result += each + " ";
            }
        }
        result = result.trim();
        return result;
    }



}

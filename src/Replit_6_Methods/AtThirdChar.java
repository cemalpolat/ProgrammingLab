package Replit_6_Methods;

import java.util.Scanner;

public class AtThirdChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan. nextLine();
        String word = scan.next();

        System.out.println(at3(sentence,word));

    }

    public static String at3 (String sentence, String word){

       String result = sentence.substring(0,3) + word + sentence.substring(3);

       return result;
    }
}

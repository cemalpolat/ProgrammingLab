package Replit_5_Methods;

import java.util.Scanner;

public class MethodsWithStringsMerge {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        String result = merge(word1,word2);

        System.out.println(result);

    }

    public static String merge(String word1, String word2) {

        String result = "";

        for (int i = 0; i < word1.length() + word2.length(); i++) {

            if (i < word1.length() && i < word2.length()) {

                result += word1.charAt(i);
                result += word2.charAt(i);
            } else if (i < word1.length() && i >= word2.length()) {

                result += word1.charAt(i);

            }else if (i >= word1.length() && i < word2.length()) {

                result += word2.charAt(i);
            }

        }
        return result;

    }
}


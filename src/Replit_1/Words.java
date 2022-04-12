package Replit_1;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word1 = s.next();
        String word2 = s.next();

        String result = (word1.equals(word2))? "word1 equals word2" : "word1 does not equal word2";

        System.out.println(result);

    }
}

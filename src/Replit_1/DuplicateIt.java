package Replit_1;

import java.util.Scanner;

public class DuplicateIt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        System.out.println(word1+word2.repeat(2)+word1);








    }
}

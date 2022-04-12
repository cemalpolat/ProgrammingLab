package Replit_1;

import java.util.Scanner;

public class PrintLongest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

          String word1 = scan.next();
          String word2 = scan.next();

      String result  = (word1.length() > word2.length())? word1 : word2;

        System.out.println(result);










    }
}

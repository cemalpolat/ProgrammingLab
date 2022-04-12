package Replit_2;

import java.util.Scanner;

public class RepeatSeperator2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        String result = "";


        System.out.println((word + separator).repeat(count-1) + word);
    }
}
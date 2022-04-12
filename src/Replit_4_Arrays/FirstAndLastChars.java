package Replit_4_Arrays;

import java.util.Scanner;

public class FirstAndLastChars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] arr = new String[5];

        for (int i = 0; i <= 4; i++) {

            arr[i] = scan.next();
        }
        for (String each : arr) {

            System.out.println("" + each.charAt(0) + each.charAt(each.length()-1));

        }

    }
}
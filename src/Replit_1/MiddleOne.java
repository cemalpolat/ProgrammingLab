package Replit_1;

import java.util.Scanner;

public class MiddleOne {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        if (word.length() % 2 != 0) {

            if (word.length() >= 3) {

                System.out.println(word.substring(word.length() / 2, word.length() / 2 + 1));

            } else if (word.length() == 1) {

                System.out.println(word.repeat(3));
            }
        } else {

            if (word.length() >= 4) {
                System.out.println(word.substring(word.length() / 2 - 1, word.length() / 2+1));

            } else if (word.length() == 2) {
                System.out.println(word.repeat(2));
            }
            }
        }
    }
package Replit_6_Methods;

import java.util.Scanner;

public class removeFirstChar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        removeFirstChar(str);

    }

    public static void removeFirstChar(String str){

        String result = "";
        for (int i = 1; i < str.length(); i++) {
           result += str.charAt(i);
        }
        System.out.println(result);
    }

}

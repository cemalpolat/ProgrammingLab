package Replit_6_Methods;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        System.out.println(reverseString(str));

    }

    public static String reverseString (String str){

        String result = "";

        for (int i = str.length()-1; i >=0 ; i--) {

            result += str.charAt(i);
        }

        return  result;
        }

}

package Replit_5_Methods;

import java.util.Scanner;

public class StringExtractNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();


        str = extractNum(str);

        System.out.println(str);
    }
    public static String extractNum(String str){
        String result  = "";
        for (int j =0; j < str.length(); j++) {

            if (Character.isDigit(str.charAt(j))){
                result += str.charAt(j);
            }
        }
        return result;
    }
}

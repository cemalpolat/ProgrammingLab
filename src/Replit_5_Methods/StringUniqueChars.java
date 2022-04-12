package Replit_5_Methods;

import java.util.Scanner;

public class StringUniqueChars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String res = uniqueChars(str);

        System.out.println(res);
    }
    public static String uniqueChars(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (!result.contains("" + str.charAt(i))){
                result += str.charAt(i);
            }
        }
        return result;
    }
}

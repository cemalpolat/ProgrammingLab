package Replit_6_Methods;

import java.util.Scanner;

public class BiggerString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str1 = scan.next();
        String str2 = scan.next();

        System.out.println(biggerString(str1,str2));

    }

    public static String biggerString (String str1 , String str2){
        String result = "";

        if (str1.length() > str2.length()){

            result = str1;
        }
        if (str2.length() > str1.length()){

            result = str2;
        }

        return result;


    }



}

package Replit_5_Methods;

import java.util.Scanner;

public class ReverseLetters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        str = reverseLetters(str);

        System.out.println(str);

    }

    public static String reverseLetters (String str){
        String result = "";
        String res = "";

        for (int i = str.length()-1; i >=0; i--) {

            if (Character.isLetter(str.charAt(i))){
                res += str.charAt(i);
            }
        }
       char [] array = str.toCharArray();

        int j =0;
        for (int i = 0; i < array.length; i++) {

            if( Character.isLetter(array[i])){

               array[i] = res.charAt(j++);
            }
        }
        for (char each : array) {
            result += each;
        }
        return result;
    }
}

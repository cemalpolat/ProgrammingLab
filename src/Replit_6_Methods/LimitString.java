package Replit_6_Methods;

import java.util.Scanner;

public class LimitString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int num = scan.nextInt();

        System.out.println(limitString(str,num));
    }


    public static String limitString (String str, int index){

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (i == index){
                break;
            }

            result += str.charAt(i);
        }
        return result;
       }

}

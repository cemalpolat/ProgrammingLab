package Replit_6_Methods;

import java.util.Scanner;

public class countLetters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String result = countLetters(str);
        System.out.println(result);
    }

    public static String countLetters (String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
           if (!result.contains("" + str.charAt(i))) {

               result += "" + count + str.charAt(i) ;
           }
        }
        return result;
    }
}

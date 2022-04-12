package Replit_5_Methods;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

       boolean r =  isPalindrome(str);

        System.out.println(r);

    }

    public static boolean isPalindrome(String check) {


        check = check.replace(" ","").trim();
        String result = "";
        boolean r = false;
        for(int i=check.length()-1; i>=0; i--){
            result += check.charAt(i);
        }
        if(check.equalsIgnoreCase(result)){
            r = true;
        }else{
            r = false;
        }
        return r;
    }

}

package Replit_3;

import java.util.Scanner;

public class PrefixAgain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        int count = 0;

        for (int i = 1; i <= str.length()-n; i++) {

           if(str.substring(0, n).equals(str.substring(i, i + n))){
               count += 1;

           }
        }
            if (count>0){
                System.out.println("true");
            }else{
                System.out.println("false");
            }



    }
}

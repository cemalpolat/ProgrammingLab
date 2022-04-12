package Replit_3;

import java.util.Scanner;

public class PrefixAgain2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();


        System.out.println(str.substring(1).contains(str.substring(0,n)));


    }
}

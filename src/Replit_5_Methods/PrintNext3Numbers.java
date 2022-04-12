package Replit_5_Methods;

import java.util.Scanner;

public class PrintNext3Numbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
        int num = scan.nextInt();

        next3(num);
    }
    public static void next3(int num){
        System.out.println("next 3 are:" +"\n" + (num+1) + " " + (num+2) + " " + (num+3));
    }
}

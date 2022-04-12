package Replit_6_Methods;

import java.util.Scanner;

public class IsMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int max = scan.nextInt();

        isMax(x,max);

    }

    public static void isMax(int x, int max){

       if (x > max){
           System.out.println(x);
       }else if (max > x){
           System.out.println(max);
       }else{
           System.out.println(x);
       }
    }
}

package Replit_5_Methods;

import java.util.Scanner;

public class Signum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        sign(num);


    }

    public static void sign(int num){
        if(num>0){
            System.out.println("positive");
        }else if (num<0){
            System.out.println("negative");
        }else if (num == 0){
            System.out.println("zero");
        }
    }
}

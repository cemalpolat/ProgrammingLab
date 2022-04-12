package Replit_6_Methods;

import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        isEven(num);
    }
    public static void isEven (int num){

        if (num % 2 ==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}

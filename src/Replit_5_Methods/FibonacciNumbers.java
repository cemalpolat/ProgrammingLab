package Replit_5_Methods;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        fib(num);
    }
    public static void fib(int num){
        int res = 0;
        int first = 0;
        int second = 1;
        for (int i = 2; i <= num; i++) {
            res = first + second;
            first = second;
            second = res;
        }
        System.out.println(res);
    }

}

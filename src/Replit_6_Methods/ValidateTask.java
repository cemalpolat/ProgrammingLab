package Replit_6_Methods;

import java.util.Scanner;

public class ValidateTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean r = scan.nextBoolean();
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        validateTask(r,num1,num2);
    }
    public static void validateTask (boolean r, int num1, int num2){

        if (r && num1 - num2 ==1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}

package Replit_1;

import java.util.Scanner;

public class FindMidNumber {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = scan.nextInt();
        System.out.println("Enter second number:");
        int num2 = scan.nextInt();
        System.out.println("Enter third number:");
        int num3 = scan.nextInt();

    String result = (num1!=num2 && num2!=num3 && num1!=num3)? (num1>num2 && num2>num3)? "Medium value is: " + num2 :
    (num2>num1 && num1>num3)?  "Medium value is: " + num1 : "Medium value is: " + num3 : "Invalid entry" ;

        System.out.println(result);

    }

    }


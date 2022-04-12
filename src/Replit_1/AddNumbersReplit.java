package Replit_1;

import java.util.Scanner;

public class AddNumbersReplit {
    public static void main(String[] args) {

        System.out.println("Enter 3 numbers:");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int sum = num1 + num2 + num3;

        System.out.println("Sum of numbers: " + sum);

    }
}

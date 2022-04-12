package Replit_4_Arrays;

import java.util.Scanner;

public class CountEvenNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] numbers = new int[5];

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = scan.nextInt();
            if (numbers[i]%2==0){
                count++;
            }
        }

        System.out.println(count);









    }
}

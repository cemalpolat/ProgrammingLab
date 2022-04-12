package Replit_1;

import java.util.Scanner;

public class GAmeCoupons {
    public static void main(String[] args) {

        System.out.println("Enter number of coupons");
        Scanner input = new Scanner(System.in);
        int numCoupons = input.nextInt();
        int numCandies = numCoupons / 10;
        int numGummballs = (numCoupons%10)/3;

    if(numCoupons>=3){
        System.out.println("Output: Number of Candies: " + numCandies);
        System.out.println("Output: Number of Gumballs: " + numGummballs);

    }else{
        System.out.println("Not enough coupons");
    }





    }
}

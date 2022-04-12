package Replit_4_Arrays;

import java.util.Scanner;

public class MaxLength {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] nums = new String[5];

        for (int i = 0; i < nums.length; i++) {

            nums[i] = scan.nextLine();
        }

        String longest = nums[0];

        for (String each : nums) {

            if (each.length() > longest.length()){
                longest = each;
            }

        }

        System.out.println(longest);


    }

}

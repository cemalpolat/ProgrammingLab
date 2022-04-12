package Replit_4_Arrays;

import java.util.Scanner;

public class FindSum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int [] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }

        int sum = 0;

        for (int each : nums) {

            sum += each;
        }
        System.out.println(sum);
    }
}

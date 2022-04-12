package Replit_6_Methods;

import java.util.Scanner;

public class BadProduct {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] nums = new int[in.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int limit = in.nextInt();

        badP(nums, limit);
    }

    public static void badP(int[] array, int limit) {

        int count = 0;
        for (int each : array) {
            if (each == 0) {
                count++;
            }
        }
        if (count >= limit) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}

package Replit_4_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftLeft2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }


        for (int i = size - 1; i >= 0; i--) {
            int term = nums[i];
            nums[i] = nums[size - 1];
            nums[size - 1] = term;
        }

        System.out.println(Arrays.toString(nums));



    }
}

package Replit_4_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};


        int nums2 [] = new int[7];

        for (int i = nums.length - 1, j = 0; i >= 0; i--, j++) {

            nums2[j] = nums[i];
        }

        System.out.println(Arrays.toString(nums2));

        }


    }


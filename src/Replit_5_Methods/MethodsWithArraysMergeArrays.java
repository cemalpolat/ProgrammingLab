package Replit_5_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class MethodsWithArraysMergeArrays {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int [] nums = new int[in.nextInt()];
        int [] nums2 = new int[in.nextInt()];
        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(mergeTwoArrays(nums, nums2)).replace(" ", ""));
    }

    public static int [] mergeTwoArrays(int [] arr1 , int [] arr2){

        int [] newArray = new int[arr1.length + arr2.length];

        int j = 0;
        for (int each : arr1) {

            newArray[j++] = each;
        }
        int i = arr1.length;
        for (int each : arr2) {

            newArray[i++] = each;
        }
        return newArray;
    }
}

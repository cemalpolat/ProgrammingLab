package Replit_6_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {
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

        int [] arr = mergR(nums,nums2);

        System.out.println(Arrays.toString(arr));
    }



    public static int [] mergR (int [] array1 , int [] array2){

       int [] newArr = new int[array1.length + array2.length];

       int i =0;
        for (int each : array1) {

            newArr [i++] = each;
        }
        for (int each : array2) {

            newArr [i++] = each;
        }

        return newArr;
    }
}

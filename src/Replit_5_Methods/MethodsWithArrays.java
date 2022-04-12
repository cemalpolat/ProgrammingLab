package Replit_5_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class MethodsWithArrays {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int [] nums = new int[5];
        int [] nums2 = new int[5];
        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums.length; i++) {
            nums2[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(addElements(nums, nums2)));
    }

    public static int [] addElements (int [] arr1, int [] arr2){

        int [] newArr = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {

            newArr[i] = arr1[i]  + arr2[i];
        }
        return newArr;
    }




}

package Replit_4_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FrontPiece {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int [] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {

            nums[i] = scan.nextInt();
        }

        int [] newNums1 = new int[1];
        int [] newNums2 = new int[2];

       if (nums.length >= 2){

           newNums2[0] = nums[0];
           newNums2[1] = nums[1];
           System.out.println(Arrays.toString(newNums2));
        }else{
           newNums1[0] = nums[0];
           System.out.println(Arrays.toString(newNums1));
       }




    }
}

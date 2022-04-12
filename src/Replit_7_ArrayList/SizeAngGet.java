package Replit_7_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class SizeAngGet {
    public static void main(String[] args) {

        Scanner scan = new Scanner((System.in));
        int size = scan.nextInt();

        ArrayList<Integer>nums = new ArrayList<>();

        for (int i = 0; i < size; i++) {

            nums.add(scan.nextInt());
        }

        System.out.println(sum(nums));
    }



    public static int sum(ArrayList<Integer>nums){

        int sum = 0;
        for (Integer each : nums) {
            sum += each;
        }
        return sum;
    }
}

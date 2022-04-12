package Replit_4_Arrays;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {

            nums[i] = scan.nextInt();
        }

        int maxx = nums[0];

        for (int each : nums) {

            if (each > maxx) {

                maxx = each;

            }

        }
        System.out.println(maxx);

    }
}

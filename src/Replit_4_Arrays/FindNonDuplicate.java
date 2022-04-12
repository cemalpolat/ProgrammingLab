package Replit_4_Arrays;

import java.util.Scanner;

public class FindNonDuplicate {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};



        for (int each : nums) {

            int count = 0;
            for (int num : nums) {

                if (each == num) {
                    count++;
                }

            }

            if (count == 1) {

               System.out.println(each);
               System.exit(0);
            }

        }
    }}

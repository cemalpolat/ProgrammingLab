package Replit_7_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Remove {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        ArrayList<Double>nums = new ArrayList<>();

        for (int i = 0; i < size; i++) {

            nums.add(scan.nextDouble());
        }
        System.out.println(test(nums));

       }

    public static ArrayList<Double> test(ArrayList<Double>nums){

        nums.remove(0);
        nums.remove(0);

        return nums;
            }
}

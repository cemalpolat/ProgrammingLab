package Replit_5_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class PopulateArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int j= scan.nextInt();
        int [] i = new int[j];

        i = populate(i);
        System.out.println(Arrays.toString(i));
    }
    public static int [] populate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i +1;
        }
        return arr;
    }
}

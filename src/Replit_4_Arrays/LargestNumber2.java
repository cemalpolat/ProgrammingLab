package Replit_4_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber2 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];

        int max = arr[0][0];

        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= cols - 1; j++) {
                arr[i][j] = inp.nextInt();

                if (arr[i][j] > max){

                    max = arr[i][j];

                }
            }
        }
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= cols - 1; j++) {
                arr[i][j] = max;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
package Replit_4_Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber2D {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];

        int max = arr[0][0];
        for (int i = 0; i < rows ; i++) {

            for (int j = 0; j < cols ; j++) {

                arr[i][j] = inp.nextInt();
                if (arr[i][j] > max ){

                    max = arr[i][j];
                }
            }
        }
      /*  int max = arr[0][0];

        for (int i = 0; i < rows ; i++) {

            for (int j = 0; j < cols ; j++) {

                if (arr[i][j] > max){

                    max = arr[i][j];
                }
            }
        }

       */
        System.out.println(max);
    }
}

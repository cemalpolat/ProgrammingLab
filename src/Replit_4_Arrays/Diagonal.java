package Replit_4_Arrays;

import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[][] matrix = { {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()}};
       // int result = 0;

        int a = matrix [0][0] + matrix [1][1] +  matrix [2][2];
        int b = matrix [0][2] + matrix [1][1] +  matrix [2][0];

        int  result = a - b;
            if (result < 0){
                result *= -1;
            }
        System.out.println(result);
    }
}

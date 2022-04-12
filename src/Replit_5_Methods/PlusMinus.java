package Replit_5_Methods;

import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] arr = new int[scan.nextInt()];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = scan.nextInt();
        }
        plus_minus(arr);
    }

public static void plus_minus(int[] array){
    int positives = 0;
    int negatives = 0;
    int zeros = 0;
    for (int each : array) {

      if (each > 0){
          positives++;
      }else if (each < 0){
          negatives++;
      }else{
          zeros++;
      }
    }
    System.out.println("positives:" + positives + ", negatives:" + negatives + ", zeros:" + zeros);
}
}

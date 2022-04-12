package Replit_4_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Diving {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float [] scores = new float[7];

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Enter score for judge " + (i+1) + ":");
            scores[i]  = scan.nextFloat();
        }

        Arrays.sort(scores);

        float [] scoreNew = Arrays.copyOfRange(scores, 1,scores.length -1);

        float sum = 0;
        for (float each : scoreNew) {
            sum += each;
        }

        System.out.println("Enter the difficulty:");

        float difNum = scan.nextFloat();

        while (difNum < 1.2 || difNum > 3.8){

            System.out.println("Invalid entry, please re enter:");
            difNum = scan.nextFloat();

        }

        float Total = (float) (sum * difNum * 0.6);

        System.out.println("Total: " + Total);



    }
}

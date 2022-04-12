package Replit_4_Arrays;

import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {

        Scanner scan = new Scanner((System.in));

        double [] array = new double[8];

        for (int i = 0; i < array.length; i++) {

            array[i] = scan.nextDouble();
        }

        double sum =0;

        for (double each : array) {

          sum += each;

        }

        System.out.println(sum / 8);



    }
}

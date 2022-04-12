package Replit_4_Arrays;

import java.util.Scanner;

public class Printing03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String [] arr = new String[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.next();
        }

        for (int i = 0; i < arr.length-2; i+=1) {

            System.out.println(arr[i] + ", " + arr[i+1] + ", " + arr[i+2]);

        }



    }
}

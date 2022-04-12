package Replit_4_Arrays;

import java.util.Scanner;

public class Printing02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String [] arr = new String[8];

        arr[0] = scan.next();
        arr[1] = scan.next();
        arr[2] = scan.next();
        arr[3] = scan.next();
        arr[4] = scan.next();
        arr[5] = scan.next();
        arr[6] = scan.next();
        arr[7] = scan.next();


        for (int i = 0; i < arr.length-1; i+=2) {

            System.out.println(arr[i] + ", " + arr[i+1]);


        }




    }
}

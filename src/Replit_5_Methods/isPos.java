package Replit_5_Methods;

import java.util.Scanner;

public class isPos {
    public static void main(String[] args) {

        Scanner scan = new Scanner((System.in));
        int [] arr = new int[scan.nextInt()];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = scan.nextInt();
        }
        for (int each : arr) {
            isPos(each);
        }
    }


    public static void isPos(int num){

        if (num > 0) {
            System.out.println("positive");
        }else if ( num < 0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }
    }
}

package Replit_4_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SwitchElements {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int [] arr = {in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()};


        System.out.println(Arrays.toString(do_switch(arr)).replaceAll(" ", ""));

    }

    public static int[] do_switch(int [] arr){

        int [] arr2 = Arrays.copyOf(arr, arr.length) ;

        for (int i = 0, j = arr.length-1; i < arr.length; i++, j--) {
                if (i != 0 && i != arr.length-1) {
                    continue;
                }

               arr2[i] = arr [j];

            }
        return arr2;
   }
}







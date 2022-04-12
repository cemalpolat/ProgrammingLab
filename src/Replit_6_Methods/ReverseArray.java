package Replit_6_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int [] array = new int[size];

        for (int i = 0; i < size; i++) {

            array [i] = scan.nextInt();

        }
       int [] reversed = reverseArray(array);

        System.out.println(Arrays.toString(reversed));
    }

    public static int [] reverseArray (int []array){

    int [] result = Arrays.copyOf(array,array.length*2);

        int j = array.length;
        for (int i = array.length -1; i >= 0; i--) {

            result[j++] = array [i];
        }
        return result;
    }
}



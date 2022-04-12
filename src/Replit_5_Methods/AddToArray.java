package Replit_5_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class AddToArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int [] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        int element = scan.nextInt();

       int [] newArray =  add_to_r(array, element);

        System.out.println(Arrays.toString(newArray));

    }
    
    public static int[] add_to_r (int[] array , int element){
        
       int [] newArray  = new int[array.length+1];

        for (int i = 0; i < array.length; i++) {

            newArray[i] = array[i];
        }
            newArray[newArray.length-1] = element;
        return newArray;
    }
    
}

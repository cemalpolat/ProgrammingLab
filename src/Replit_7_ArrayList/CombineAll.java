package Replit_7_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class CombineAll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int size2 = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }
        for(int i=0; i < size2; i++) {
            list2.add(in.nextInt());
        }

        System.out.println(combineArrays(list, list2));
    }


    public static ArrayList<Integer>combineArrays(ArrayList<Integer>arr1, ArrayList<Integer>arr2){

        arr1.addAll(arr2);

        return arr1;


    }
}

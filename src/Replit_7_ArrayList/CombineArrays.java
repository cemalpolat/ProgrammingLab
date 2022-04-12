package Replit_7_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CombineArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        String [] strs2 = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }
        for(int i=0; i < strs2.length; i++) {
            strs2[i] = in.next();
        }

        System.out.println(combineArrays(strs,strs2));

    }


    public static ArrayList<String> combineArrays(String [] arr1, String [] arr2){


        ArrayList<String>newArrList = new ArrayList<>();


        newArrList.addAll(Arrays.asList(arr1));
        newArrList.addAll(Arrays.asList(arr2));

            return newArrList;
    }




}

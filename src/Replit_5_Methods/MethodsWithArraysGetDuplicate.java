package Replit_5_Methods;

import java.util.Scanner;

public class MethodsWithArraysGetDuplicate {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }
        System.out.println(getDup(strs));
    }
    public static int getDup(String [] array){
        int count = 0;
        for (int i =0; i < array.length; i++) {
            int count2 =0;
            for (String s1 : array) {

                if(array[i].equals(s1)){
                    count2++;
                }
            }
                if (count2 > 1){
                    count++;
                }
        }
        return count ;
    }
}

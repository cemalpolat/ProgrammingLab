package Replit_5_Methods;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "Listen";
        String str2 = "Silent";

        boolean r = isAnagram(str1, str2);
        System.out.println(r);

    }
    public static boolean isAnagram(String word1 , String word2){

        char [] arr1 = word1.toLowerCase().toCharArray();
        char [] arr2 = word2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r = false;

        if (Arrays.equals(arr1 , arr2)){

            r = true;
        }
        return r;

    }
}

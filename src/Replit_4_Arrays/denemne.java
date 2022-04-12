package Replit_4_Arrays;

import java.util.Arrays;

public class denemne {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4};

        int [] arr2 = Arrays.copyOf(arr,arr.length);

        System.out.println(Arrays.toString(arr2));
    }
}

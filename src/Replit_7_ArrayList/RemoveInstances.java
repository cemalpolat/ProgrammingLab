package Replit_7_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveInstances {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(removeInstances(list, n));
    }

public static ArrayList<Integer>removeInstances(ArrayList<Integer>arr, Integer num){

       arr.removeAll(Arrays.asList(num));

        return arr;
        }
}

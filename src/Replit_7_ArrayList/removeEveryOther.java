package Replit_7_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class removeEveryOther {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }
        System.out.println(removeEveryOther(list));
    }
    public static ArrayList<String> removeEveryOther(ArrayList<String>arr){

        ArrayList<String>newArr = new ArrayList<>();
        for (int i = 1; i < arr.size(); i+=2) {
            newArr.add(arr.get(i))  ;
        }
        return newArr;
    }
}

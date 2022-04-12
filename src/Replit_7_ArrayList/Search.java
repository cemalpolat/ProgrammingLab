package Replit_7_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String find = in.next();
        in.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextLine());
        }
        System.out.println(search(list, find));
    }
    public static String search (ArrayList<String>arr, String find){

        String result = "";
        for (String each : arr) {
            if(each.contains(find)){
                result = each;
                break;
            }else{
                result = "search failed";
            }
        }
        return result;
    }
}

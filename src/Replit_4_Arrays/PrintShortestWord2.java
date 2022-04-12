package Replit_4_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintShortestWord2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String [] neww = str.split(", ");

        String shortest = neww[0];
        for (String each : neww) {

             if ( each.length() < shortest.length()){
                 shortest = each;
            }
        }
        String  res = "";
        for (String s : neww) {
            if ( s.length() == shortest.length()){
                res += s + ", ";
            }
        }
        String [] result = res.split(", ");
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));



    }
}

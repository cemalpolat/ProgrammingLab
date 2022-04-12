package Replit_4_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopyCertainValues {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] arr = {scan.next(),scan.next(),scan.next(),scan.next(),scan.next()};
        String [] temp = new String[5];

        int count = 0;
        for (String each : arr) {

          if (each.contains("e")){

              temp[count] = each;
              count++;
            }
        }

        String [] fewValues = Arrays.copyOfRange(temp, 0, count );
        System.out.println(Arrays.toString(fewValues));





    }
}

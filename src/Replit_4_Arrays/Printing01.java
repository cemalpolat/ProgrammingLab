package Replit_4_Arrays;

import javax.swing.text.DefaultCaret;
import java.util.Scanner;

public class Printing01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String [] arr = new String[5];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = scan.next();
        }

        for (String each : arr) {

            String neww = each.substring(0,3);
            System.out.println(neww);
        }


    }
}

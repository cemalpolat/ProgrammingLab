package Replit_4_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InnerOuter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int sizeIn = scan.nextInt();
        int sizeOut = scan.nextInt();


        int [] inner = new int[sizeIn];
        int [] outer = new int[sizeOut];

        for (int j = 0; j < sizeIn; j++) {
            inner[j] = scan.nextInt();
        }
        for (int i = 0; i < sizeOut; i++) {
            outer[i] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);

        int count =0;
        for (int in : inner) {
            for (int out : outer) {

                if (in == out){

                    count++;
                    break;
                }
            }
        }
        if (count == sizeIn){
            System.out.println("true");
        }else {
            System.out.println("false");
        }


    }
}

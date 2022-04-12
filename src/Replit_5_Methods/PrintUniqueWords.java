package Replit_5_Methods;

import java.util.Scanner;

public class PrintUniqueWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner((System.in));
        int size = scan.nextInt();

        String [] arr = new String[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scan.next();
        }
            printUniqueWords(arr);
    }
public static void printUniqueWords(String [] array){

    for (String each : array) {
    int count = 0;
        for (String s : array) {

            if ( each.equals(s)){
                count++;
            }
        }
        if (count == 1){
            System.out.println(each);
        }
    }
}
}

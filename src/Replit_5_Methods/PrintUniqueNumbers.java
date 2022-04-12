package Replit_5_Methods;

import java.util.Scanner;

public class PrintUniqueNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int [] array = new int[size];

        for (int i = 0; i < size; i++) {

            array[i] = scan.nextInt();
        }
            printUniqueNumbers(array);
    }
public static void printUniqueNumbers(int [] array){
    for (int each : array) {
        int count = 0;
        for (int i : array) {

            if (each == i){
                count++;
            }
        }
        if (count ==1){
            System.out.println(each);
        }
    }
    }
}

package Replit_4_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String sentence = scan.nextLine();


        String [] arr = sentence.split(" ");
        String  reversed = "";

        for (int i =  arr.length -1; i >0; i-- ) {
           reversed +=  arr[i] + " " ;
        }
            reversed += arr[0]; // ya da bu da yukari katilip trim yapilabilirdi.

        System.out.println(reversed);





    }
}

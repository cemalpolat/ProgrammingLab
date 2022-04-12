package Replit_4_Arrays;

import java.util.Scanner;

public class PrintShortestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

        String shortest = str[0];
        for (String s : str) {
            if ( s.length() < shortest.length()){
                shortest = s;

            }


        }

        System.out.println(shortest);


    }





}

package Replit_4_Arrays;

import jdk.jshell.Snippet;

import java.util.Scanner;

public class SplitPersonInfo {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String s = inp.next();

        person(s);
    }

    public static void person(String a){

        String []  str = a.split(",");

        System.out.println("person name: " + str[0] + "\nlast name: " + str[1] +

                "\nage: " + str[2]);
    }
}

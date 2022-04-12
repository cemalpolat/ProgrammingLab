package Replit_5_Methods;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        cube();
    }
    public static void cube(){
        Scanner scan = new Scanner((System.in));
        System.out.println("input:");
        int input = scan.nextInt();
        System.out.println(input * input * input);
    }
}

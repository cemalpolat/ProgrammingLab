package Replit_4_Arrays;

import java.util.Scanner;

public class SplitEmail {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        if ( !email.contains("@") || email.indexOf("@") != email.lastIndexOf("@")){
            System.out.println("invalid email");
        }

        String [] arr = email.split("@");

        System.out.println("Email id: " + arr[0] + "\nEmail domain: " + arr[1]);

    }
}

package Replit_1;

import java.util.Scanner;

public class Email1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email  = scan.next();

        if (email.contains("_")) {

            String name = email.substring(0, email.indexOf("_"));
            String sName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
            String newEmail = sName + "_" + name + email.substring(email.indexOf("@"));


            System.out.println(newEmail);


        } else {
            System.out.println(email);
        }
    }
}
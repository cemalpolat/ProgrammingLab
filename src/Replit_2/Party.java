package Replit_2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String guestsList = "";

        System.out.println("Please enter guest name:");
        String name = scan.next();
        guestsList += name;

        for (int i = 1; i < 500 ; i++) {

            System.out.println("Do you want to enter new guest name:");
            String wantNew1 = scan.next();
            if (wantNew1.equals("yes")){
                System.out.println("Please enter guest name:");
                name = scan.next();
                guestsList  = guestsList +  ", " + name;
                i+= 1;

            }else{
               i = 501;
            }
        }
        System.out.println("Guest's list: " + guestsList);

    }
}

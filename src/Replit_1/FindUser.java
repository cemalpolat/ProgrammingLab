package Replit_1;

import java.util.Scanner;

public class FindUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name:");
        String fName = scan.nextLine();

        if(fName.equalsIgnoreCase ("Max Payne")
          || fName.equalsIgnoreCase("Alan Wake")){
            System.out.println("User found!");

        }else{
            System.out.println("User not found!");
        }

    }
}

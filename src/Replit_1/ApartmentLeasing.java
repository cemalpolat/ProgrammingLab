package Replit_1;

import java.util.Scanner;

public class ApartmentLeasing {
    public static void main(String[] args) {

        System.out.println("Welcome to Cybertek Apartments!\n" +
                "Number of bedrooms you are interested:");

        Scanner scan = new Scanner(System.in);
        int numberOfBedrooms = scan.nextInt();

    switch(numberOfBedrooms){

        case(1):
            System.out.println("One Bedroom Selected\n" +
                    "Starting Price: 1100");break;

        case(2):
            System.out.println("Two Bedroom Selected\n" +
                    "Starting Price: 1850");break;

        case(3):
            System.out.println("Three Bedroom Selected\n" +
                    "Starting Price: 2550");break;

        default:
            System.out.println("No such Bedrooms available");
    }


    }
}

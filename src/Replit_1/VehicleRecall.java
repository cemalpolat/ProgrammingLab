package Replit_1;

import java.util.Scanner;

public class VehicleRecall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter vehicle's year:");
        int vehicleYear = input.nextInt();

   String result = ((vehicleYear<=1998 && vehicleYear>= 1995) || (vehicleYear<=2002 && vehicleYear>= 2001)
     || (vehicleYear<=2006 && vehicleYear>= 2004) || (vehicleYear<=2017 && vehicleYear>= 2015))?
        "Your vehicle needs to be recalled!" : "Your vehicle is fine, enjoy!";

        System.out.println(result);

    }








}

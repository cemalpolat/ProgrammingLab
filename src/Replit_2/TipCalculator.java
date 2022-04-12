package Replit_2;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        String a = "&";

        Scanner scan = new Scanner(System.in);

        System.out.println("Split: ");
        String split = scan.next();

        System.out.println("Number of people: ");
        int numOfPeople = scan.nextInt();
        System.out.println("Check amount: ");
        double totAmount = scan.nextDouble();
        System.out.println("Service quality: ");
        String servQualty = scan.next();

        double totTipRate = (servQualty.equalsIgnoreCase("poor"))? 0.05 : (servQualty.equalsIgnoreCase("fair"))? 0.1 :
                (servQualty.equalsIgnoreCase("good"))? 0.15 :
                (servQualty.equalsIgnoreCase("great"))? 0.2 : 0.25 ;
        double totalTip = totTipRate * totAmount;
        double totalToPay = totAmount + totalTip;



         if(split.equalsIgnoreCase("yes")){
             double totalPerPerson = totalToPay / numOfPeople;
             double tipPerPerson = totalTip / numOfPeople;

             System.out.println("Number of people entered: " + a.repeat(numOfPeople));
             System.out.println("Total to pay: " + totalToPay);
             System.out.println("Total tip: " + totalTip);
             System.out.println("Total per person: " + totalPerPerson);
             System.out.println("Tip per person: " + tipPerPerson);


         }else{
             System.out.println("Number of people entered: " + numOfPeople);
             System.out.println("Total to pay: " + totalToPay);
             System.out.println("Total tip: " + totalTip);


         }











    }
}

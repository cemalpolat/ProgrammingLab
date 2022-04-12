package Replit_1;

import java.util.Scanner;

public class RealEstateCalculator {
    public static void main(String[] args) {

        int startingPrice = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");

        System.out.println("Enter your property type:");
        String type = scan.next();

//if (type.equals("Condo")|| type.equals("Townhouse") || type.equals("Single Family Home")){

        if (type.equals("Condo") ) {
            startingPrice += 50000;
        } else if (type.equals("Townhouse")){
            startingPrice += 75000;
        } else  {
            startingPrice += 95000;
        }
//}else {
    //System.out.println("Invalid type");
//}
        System.out.println("How many bedrooms do you have?");
        int bedroom = scan.nextInt();
        startingPrice += bedroom * 30000;

        System.out.println("Do you have a backyard?");
        boolean backyard = scan.nextBoolean();
        if (backyard) {
            if (type.equals("Condo")) {
                System.out.println("Backyard is not available for condo!");
            } else {
                startingPrice += 5000;
            }
        }else{
            startingPrice += 0.0;
        }
            System.out.println("Do you have garage?");
            boolean garage = scan.nextBoolean();

            if (garage) {

                System.out.println("How many spots?");
                int spots = scan.nextInt();
                if (spots > 10) {

                    System.out.println("Pardon, it's not public parking!");
                } else {
                    startingPrice += 20000;
                }
            } else {
                startingPrice += 0.0;
            }

            System.out.println("How close is metro station?");
            double closeMetro = scan.nextDouble();

            if (closeMetro <= 1.0) {
                startingPrice += 10000;
            } else if (closeMetro > 1.0 && closeMetro <= 3.0){
                startingPrice += 5000;
            } else {
                startingPrice += 0.0;

            }

            System.out.println("How close is highway?");
            double closeHighWay = scan.nextDouble();

            if (closeHighWay <= 1) {
                startingPrice += 15000;
            } else if (closeHighWay > 1 && closeHighWay <= 5) {
                startingPrice += 8000;
            } else if (closeHighWay > 5 && closeHighWay <= 20) {
                startingPrice += 4000;
            } else {
                startingPrice += 0.0;
            }

            System.out.println("What's the rating of nearest school?");
            double schoolRating = scan.nextDouble();

            if (schoolRating <= 10 && schoolRating >= 8) {
                startingPrice += 45000;
            } else if (schoolRating < 8 && schoolRating >= 4) {
                startingPrice += 20000;
            } else {
                startingPrice += 5000;
            }

            System.out.println("Does any of your family members smoke?");
            boolean smoke = scan.nextBoolean();

            if (smoke) {
                startingPrice -= 5000;
            }else
                startingPrice += 0.0;


            System.out.println("Market report has been generated.");
            System.out.println("Your estimate market price is: " + (int)startingPrice +"$");

/*mport java.util.*;
class Main {public static void main(String[] args) {
int propertyPrice = 0;
int numberOfBedrooms, garageSpots;
float metroAccessibility, schoolScore, highwayAccessibility;
boolean backyard, smoking, garage;
String houseType;
Scanner scan = new Scanner(System.in);
System.out.println("*****************************************");
System.out.println("* Welcome to the RealEstate calculator! *");
System.out.println("*****************************************");
System.out.println("Enter your property type:");
houseType=scan.nextLine();
switch (houseType){case "Condo":propertyPrice=50000;break; case "Townhouse":propertyPrice=75000;break; case "Single Family Home": propertyPrice=95000;break;}
System.out.println("How many bedrooms do you have?");
numberOfBedrooms=scan.nextInt();
propertyPrice+=numberOfBedrooms*30000;
System.out.println("Do you have a backyard?");
backyard=scan.nextBoolean();
if(backyard){
if(houseType.equals("Condo")){System.out.println("Backyard is not available for condo!");}
else{propertyPrice+=5000;}}
System.out.println("Do you have garage?");
garage=scan.nextBoolean();
System.out.println("How many spots?");
garageSpots=scan.nextInt();
if(garage){
if (garageSpots>10){System.out.println("Pardon, it's not a public parking!");}
else{propertyPrice+=20000*garageSpots;}}
System.out.println("How close is metro station?");
metroAccessibility=scan.nextFloat();
if(metroAccessibility<=1){propertyPrice+=10000;}
else if (metroAccessibility>1&&metroAccessibility<=3){propertyPrice+=5000;}
System.out.println("How close is highway?");
highwayAccessibility=scan.nextFloat();
if(highwayAccessibility<=1){propertyPrice+=15000;}
else if(highwayAccessibility>1&&highwayAccessibility<=5){propertyPrice+=8000;}
else if(highwayAccessibility>5&&highwayAccessibility<=20){propertyPrice+=4000;}

 */

    }
}
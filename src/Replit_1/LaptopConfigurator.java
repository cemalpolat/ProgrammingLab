package Replit_1;

import java.util.Scanner;

public class LaptopConfigurator {
    public static void main(String[] args) {
        double price = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Select screen size:");


        double sSize = scan.nextDouble();

        if (sSize == 13.3) {
            price += 200.0;
        }
        if (sSize == 15.0) {
            price += 300.0;
        }
        if (sSize == 17.3) {
            price += 400.0;
        }

       System.out.println("Select CPU type:");
        String cType = scan.next();

        if (cType.equals("i3") ) {
            price += 150;
        }
        if(cType.equals("i5") ) {
            price += 250;
        }
        if (cType.equals("i7") ) {
            price += 350;
        }


       System.out.println("Select RAM size:");
        int ram = scan.nextInt();

            price += (double) ((ram/4)*50);

        System.out.println("Select storage type:");
        String strTyp = scan.next();

        System.out.println("Enter memory size:");
        int mSize = scan.nextInt();

        if (strTyp.equals("HDD")){

            price += (double)(mSize/500*50);
        }
        if (strTyp.equals("SSD")) {

            price += (double) (mSize / 500 * 100);
        }


       System.out.println("Enter screen resolution");
        String res = scan.next();

        if (res.equals("FULLHD")){

            price += 100;
        }
        if (res.equals("4K")) {

            price += 200;
        }


        System.out.println("Laptop price is: $" + price);
    }


        }


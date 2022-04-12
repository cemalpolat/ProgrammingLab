package Replit_6_Methods;

import java.util.Scanner;

public class WaterTax {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double bill = scan.nextDouble();

        System.out.println(waterTax(bill));
    }

    public static double waterTax(double cost) {
        double bill = 0;
        if (cost <= 50) {
            bill = cost * 0.6;

        } else if (cost > 50 && cost <= 100) {
            bill = cost * 0.9;

        } else if (cost > 100 && cost <= 150) {
            bill = (cost * 0.9) + 50.0;

        } else if (cost > 150) {
            bill = (cost * 0.9) + 100.0;
        }

        return bill;
    }
}
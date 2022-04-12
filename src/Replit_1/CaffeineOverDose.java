package Replit_1;

import java.util.Scanner;

public class CaffeineOverDose {
    public static void main(String[] args) {

        System.out.println("Enter number of milligrams in drink:");
        Scanner input = new Scanner(System.in);
        int mgInDrink = input.nextInt();

        if(10000%mgInDrink==0){
            System.out.println ("It would take about " + 10000/mgInDrink + " drinks for a lethal overdose ");

        }else{

            System.out.println ("It would take about " + (10000/mgInDrink +1) + " drinks for a lethal overdose ");
        }



    }
}

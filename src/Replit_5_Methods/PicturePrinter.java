package Replit_5_Methods;

import java.util.Scanner;

public class PicturePrinter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("select image: \n1)sunset\n2)earth\n3)desert");
        int choice = scan.nextInt();

        if(choice == 1){
            printSunset();
        }else if(choice == 2){
            printEarth();
        }else{
            printDesert();
        }
    }



    public static void printSunset(){
        System.out.println("Sunset");
    }
    public static void printEarth(){
        System.out.println("Earth");
    }
    public static void printDesert(){
        System.out.println("Desert");
    }


}

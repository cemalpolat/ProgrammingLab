package Replit_6_Methods;

import java.util.Scanner;

public class IsError {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        isError(str);

    }


    public static void isError(String str){

        if (str.substring(0,5).equals("error")){

            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
    }

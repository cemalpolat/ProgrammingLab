package Replit_1;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        String result= "";
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        switch(name){

            case("Chen"):
               result= "teacher";
               break;
            default:
                result= "student";
        }

        System.out.println(result);

    }
}

package Replit_6_Methods;

import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int buyP = scan.nextInt();
        int sellP = scan.nextInt();

        profits(buyP,sellP);
    }

    public static void profits(int buyP, int sellP){

        if (buyP < sellP){
            System.out.println("profit");
        }else if (buyP > sellP){
            System.out.println("loss");
        }else{
            System.out.println("no loss");
        }
    }
}

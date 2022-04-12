package Replit_1;

import java.util.Scanner;

public class BurgerOrChicken {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String product = s.next();
        s.close();
     if (product.equals("burger") || product.equals("chicken")){
         System.out.println("10.0");
     }else if ( product.equals("soda")){
         System.out.println("2.0");
     }else{
         System.out.println("3.5");
     }





    }
}

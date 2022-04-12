package Replit_1;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

      String Item1, Item2, Item3, report;
      double price1, price2, price3, totalPrice;

      Scanner input = new Scanner(System.in);

      System.out.println("Enter Item1 and its price:");

      Item1 = input.next();
      price1 = input.nextDouble();

      System.out.println("Enter Item2 and its price:");

      Item2 = input.next();
      price2 = input.nextDouble();

      System.out.println("Enter Item3 and its price:");
      Item3 = input.next();
      price3 = input.nextDouble();

      totalPrice = price1 + price2 + price3;

      System.out.println("Item1: " + Item1 + " Price: " + price1 + ", Item2: " + Item2+ " Price: "+price2+ ", Item3: " +
      Item3+ " Price: "+price3);

      System.out.println("Total price = " + totalPrice);

    }
}

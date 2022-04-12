package Replit_7_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class DeliveryCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int fuel = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }
        System.out.println(refuelTimes(list, fuel));
    }

    public static int refuelTimes (ArrayList<Integer>deliveries, int maxFuel){

        int refuel =0;
        int sum =0;
        for (Integer each : deliveries) {
            sum += each;
        }
       if  (sum % maxFuel ==0){
           refuel = sum / maxFuel;
       }else{
           refuel = sum / maxFuel +1;
       }
        return refuel;


    }
}

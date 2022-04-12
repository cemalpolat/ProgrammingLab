package Replit_6_Methods;

import java.util.Scanner;

public class RoomBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(),
                in.nextInt(), in.nextInt()));
    }

    public static boolean simpleRoomBook(boolean r, int month, int day, int year){

        boolean result = false;
        if(month==7 && year==2018 && (day>=1 && day<=8)){
            result = false;
        }else if(r && year==2018){
            result = true;
        }else{
            result = false;
        }
        return result;

    }
}

package Replit_1;

import java.util.Scanner;

public class BlackJackkeep {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int house = s.nextInt();
        int player = s.nextInt();

    String result = (player>21 && player >house)? "player bust": (house>player)? "player loss" : (house<player)? "player win":
            "its a tie";

        System.out.println(result);



    }
}

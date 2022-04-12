package Replit_2;

import java.util.Scanner;

public class SMSMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String sender = word.substring((word.indexOf("<")+1), (word.indexOf(">")) );
        String phoneNumber = word.substring((word.indexOf("[")+1), (word.indexOf("]")) );
        String messageBody = word.substring((word.indexOf("{") +1), (word.indexOf("}")) );


        System.out.println("Sender: " + sender);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Message body: " + messageBody);




    }
}

package Replit_2;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word =  scan.nextLine(); // "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";

        String sender = word.substring(word.indexOf("<")+1, word.indexOf(">"));

        String phoneNumber = word.substring(word.indexOf("[")+1, word.indexOf("]"));

        String messageBody = word.substring(word.indexOf("{")+1, word.indexOf("}"));


        System.out.println("Sender: " + sender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Message Body: " + messageBody);


    }
}

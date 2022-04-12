package Replit_2;

import java.util.Scanner;

public class EqualsJavaPython {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int numOfJava = 0;
        int numOfPython = 0;

        for (int i = 1; i <= sentence.length()/4; i++) {
            if(sentence.contains("java")) {
                numOfJava++;
                sentence = sentence.replaceFirst("java", "");
            }
        }

        for (int i = 1; i <= sentence.length()/6; i++) {
            if(sentence.contains("python")) {
                numOfPython++;
                sentence = sentence.replaceFirst("python", "");
            }
        }

        System.out.println(numOfJava == numOfPython);
        scan.close();



   /*     public class Main {
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                String sentence = scan.nextLine();

                int j = (sentence.length() - sentence.replace("java", "").length()) / 4;

                int p = (sentence.length() - sentence.replace("python", "").length()) / 6;

                System.out.println(j == p);
                scan.close();

    */




    }
}

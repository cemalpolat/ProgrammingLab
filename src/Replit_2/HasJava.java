package Replit_2;

import java.util.Scanner;

public class HasJava {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.indexOf("java") ==0 || word.indexOf("java")==1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }



    }

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        exists = word.startsWith("java") || word.substring(1).startsWith("java");
        System.out.println(exists);
        scan.close();

 */

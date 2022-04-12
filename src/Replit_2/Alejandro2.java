package Replit_2;

import java.util.Scanner;

public class Alejandro2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String a = s.nextLine();



        if ((a.contains("Alejandro") || a.contains("alejandro")) && (a.contains("project")
                || a.contains("Project"))){

            System.out.println("read");

        }else{

            System.out.println("don't read");
        }






    }
}

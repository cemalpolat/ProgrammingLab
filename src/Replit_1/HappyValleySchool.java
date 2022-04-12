package Replit_1;

import java.util.Scanner;

public class HappyValleySchool {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = input.nextInt();

     String result =    (age<2)? "ineligible" : (age==2)? "toddler" : (age<=5 && age>=3)? "early childhood" :
        (age<=7 && age>=6) ? "young reader" : (age<=10 && age>=8)? "elementary" : (age<=12 && age>=11)?
        "middle" : (age==13)? "impossible" : (age<=16 && age>=14)? "high school" : (age<=18 && age>=17)?
        "scholar" : "ineligible";

        System.out.println(result);

    }
}

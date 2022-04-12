package Replit_1;

import java.util.Scanner;

public class IfStatementGrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your grade:");
        int grade = scan.nextInt();
        scan.close();

    if (grade <=100 && grade >=0){
        if(grade>=90){
            System.out.println("excellent");
        }else if ((grade>=70)){
            System.out.println("good");
        }else if(grade>=60){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
    }else{
        System.out.println("Invalid grade");
    }







    }
}

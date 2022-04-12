package Replit_1;

import java.util.Scanner;

public class SchoolGrades {
    public static void main(String[] args) {
        String name1, name2, name3, name4, name5;
        double score1, score2, score3, score4, score5, average;

        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Grader!\nPlease enter subject name number 1 and score for this subject");
        name1 = s.next();
        score1 = s.nextDouble();

        System.out.println("Please enter subject name number 2 and score for this subject");
        name2 = s.next();
        score2 = s.nextDouble();

        System.out.println("Please enter subject name number 3 and score for this subject");
        name3 = s.next();
        score3 = s.nextDouble();

        System.out.println("Please enter subject name number 4 and score for this subject");
        name4 = s.next();
        score4 = s.nextDouble();

        System.out.println("Please enter subject name number 5 and score for this subject");
        name5 = s.next();
        score5 = s.nextDouble();

        average = (score1 + score2 + score3 + score4 + score5) / 5;

        System.out.println("Summary: " + name1 + " - " + score1 + ", " + name2 + " - " + score2 + ", " + name3 + " - " + score3 +
                ", " + name4+ " - " + score4 + ", " + name5 + " - " + score5 + "\nYour average score is: "+ average + "\nThank you for using Grader!\nGoodbye!");

    }
}

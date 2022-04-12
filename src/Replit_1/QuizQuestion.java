package Replit_1;

import java.util.Scanner;

public class QuizQuestion {
    public static void main(String[] args) {
        String result;
        String answer = "";

        System.out.println("what is the farthest planet in the solar system:\na)venus\nb)pluto\nc)neptune");

        Scanner s = new Scanner(System.in);
        answer = s.nextLine();

              switch(answer) {
                case ("a"):
                    result = answer + " is wrong";
                    break;
                case ("b"):
                    result = answer + " is correct";
                    break;
                case ("c"):
                    result = answer + " is wrong";
                    break;
                default:
                    result =  answer +  "is not a valid answer";

            }
        System.out.println(result);

    }



    }


package Replit_2;

import java.util.Scanner;

public class CatsDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sentence = scan.next();
        int numDogs = 0;
        int numCats = 0;
        for (int i = 0; i <= sentence.length() - 3; i += 1) {

            if (sentence.substring(i, i + 3).equals("cat")) {
                numCats += 1;
            }
            if (sentence.substring(i, i + 3).equals("dog")) {
                numDogs += 1;
            }
        }
        boolean isSameNumber = (numCats == numDogs);
        System.out.println(isSameNumber);
    }
}

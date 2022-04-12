package Replit_2;

public class PrintEven80 {
    public static void main(String[] args) {

        String result = "";

        for (int i = 80; i >= 20 ; i-=2) {

            result += (i + " ");
            result.trim();
        }
       // System.out.println(result.substring(0,result.lastIndexOf(" ")));

        System.out.println(result);
    }
}

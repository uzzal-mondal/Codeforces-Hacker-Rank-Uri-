package ProblemSolvingDayByDay.CodeForces.FridayRevise;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String words = sc.next();
            //System.out.println(words);
            if (words.length() <= 10) {
                System.out.println(words);
            } else {
                // the words is a string type..
                firstAndLastChar(words);
            }
        }
    }

    private static void firstAndLastChar(String str) {

        // this for length number
        int n = str.length();
        char first = str.charAt(0);
        char second = str.charAt(str.length() - 1);

        //print in first index.
        System.out.print(first);
        // print omit of two index
        System.out.print(n - 2);
        System.out.println(second);

    }
}

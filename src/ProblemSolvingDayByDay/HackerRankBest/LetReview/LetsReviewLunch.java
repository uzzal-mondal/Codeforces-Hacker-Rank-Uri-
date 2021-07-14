package ProblemSolvingDayByDay.HackerRankBest.LetReview;

import java.util.Scanner;

public class LetsReviewLunch {
    public static void main(String[] args) {

        int n;
        String[] s = new String[10];

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
            System.out.printf("%d , S = %s\n", i, s[i]);
        }

        System.out.println();
        for (int i = 0; i < s.length; i++) {
            System.out.printf("%d \n", i);
        }
    }
}

package ProblemSolvingDayByDay.CodeForces.Java;

import java.util.Scanner;

public class NextRoundFirst {
    public static void main(String[] args) {
        int pNm, k, userInput, count = 0;
        Scanner sc = new Scanner(System.in);
        pNm = sc.nextInt();
        k = sc.nextInt();

        if (pNm >= k) {
            for (int i = 0; i < pNm; i++) {
                userInput = sc.nextInt();
                //System.out.printf("%d ", userInput);
                if (userInput > k || userInput == 1) {
                    count++;
                }
            }
            System.out.println("\n" + count);
        }
    }
}

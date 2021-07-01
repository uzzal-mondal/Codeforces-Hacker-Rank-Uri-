package ProblemSolvingDayByDay.CodeForces.Java;

import java.util.Scanner;

public class NextRoundTwo {
    public static void main(String[] args) {
        int pNum, kPlace, minScore = 0, score;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your participants:");
        pNum = sc.nextInt();
        System.out.println("Enter your Kth Place: ");
        kPlace = sc.nextInt();
        int[] dataScore = new int[pNum + 1];
        System.out.println("Data score: " + dataScore);


        for (int i = 1; i <= pNum; i++) {
            System.out.println("Participants score: ");
            score = sc.nextInt();
            System.out.printf("%d Score  \n", score);
            dataScore[i] = score;
            System.out.println("Data score: " + dataScore[i]);
            if (i == kPlace) {
                minScore = score;
                System.out.println("Min Score: " + minScore);
            }
        }
        int count = 0;
        for (int i = 1; i <= pNum; i++) {
            if (dataScore[i] >= minScore && dataScore[i] > 0) {
                count++;
            }
        }

        System.out.println(count);

    }
}

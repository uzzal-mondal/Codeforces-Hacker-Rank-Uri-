package ProblemSolvingDayByDay.CodeForces.Java;

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        int numberOfParticipant, kThPlace, score, minScore = 0;
        Scanner sc = new Scanner(System.in);
        numberOfParticipant = sc.nextInt();
        kThPlace = sc.nextInt();
        int[] dataScore = new int[numberOfParticipant + 1];

        for (int i = 1; i <= numberOfParticipant; i++) {
            score = sc.nextInt();
            dataScore[i] = score;
            System.out.printf("%d ",dataScore[i]);
            if (i == kThPlace) {
                minScore = score;
            }
        }

        int count = 0;
        for (int i = 1; i <= numberOfParticipant; i++) {
            if (dataScore[i] >= minScore && minScore > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

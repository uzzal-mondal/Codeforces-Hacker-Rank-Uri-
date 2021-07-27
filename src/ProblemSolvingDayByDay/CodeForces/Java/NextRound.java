package ProblemSolvingDayByDay.CodeForces.Java;

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {

        int inputNum, kthPn, userInput, count = 0;
        Scanner sc = new Scanner(System.in);
        inputNum = sc.nextInt();
        kthPn = sc.nextInt();

        if (inputNum >= kthPn) {
            for (int i = 0; i < inputNum; i++) {
                userInput = sc.nextInt();
                System.out.printf("%d ", userInput);
                if (userInput > kthPn || userInput == 1) {
                    count++;
                }
            }
            System.out.println("\n" + count);
        }

       /* Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int next = 0;
        int kthPos = sc.nextInt();
        int[] arrayOfNum = new int[100];

        for (int i = 0; i < n; i++) {
            arrayOfNum[i] = sc.nextInt();
            //System.out.print(arrayOfNum[i] + " ");
        }

        for (int i = 0; i < n; i++) {
            if ((arrayOfNum[kthPos - 1] <= arrayOfNum[i]) && (arrayOfNum[i] > 0)) { // 0 is greater than cause positive num.
                next++;
            }
        }

        System.out.println(next);*/



        /*int numberOfParticipant, kThPlace, score, minScore = 0;
        Scanner sc = new Scanner(System.in);
        numberOfParticipant = sc.nextInt();
        kThPlace = sc.nextInt();
        int[] dataScore = new int[numberOfParticipant + 1];

        for (int i = 1; i <= numberOfParticipant; i++) {
            score = sc.nextInt();
            dataScore[i] = score;
            System.out.printf("%d ", dataScore[i]);
            if (i == kThPlace) {
                minScore = score;
            }
        }

        int count = 0;
        for (int i = 1; i <= numberOfParticipant; i++) {
            if ((dataScore[i] >= minScore) && (minScore > 0)) {
                count++;
            }
        }
        System.out.println(count);*/
    }
}

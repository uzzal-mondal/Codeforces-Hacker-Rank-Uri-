package ProblemSolvingDayByDay.CodeForces.Java;

import java.util.Scanner;

public class NextRoundTwo {
    public static void main(String[] args) {

        int n, k, i, j, nextRound = 0;
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter participants: ");
        n = sc.nextInt();
        //System.out.println("Enter position of array");
        k = sc.nextInt();
        int[] arrayOfNum = new int[100];


            for (i = 0; i < n; i++) {
                //todo: user input the storage array.
                arrayOfNum[i] = sc.nextInt();
                // System.out.print(arrayOfNum[i] + " ");
            }

            for (j = 0; j < n; j++) {
                if ((arrayOfNum[k - 1] <= arrayOfNum[j]) && (arrayOfNum[j] > 0)) {
                    nextRound++;
                }
            }
            System.out.println(nextRound);




       /* int pNum, kPlace, minScore = 0, score;
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

        System.out.println(count);*/

    }
}

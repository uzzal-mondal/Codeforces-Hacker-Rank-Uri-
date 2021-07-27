package ProblemSolvingDayByDay.CodeForces.FridayRevise;

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {

        int n, next = 0, kthPos;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        kthPos = sc.nextInt();
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

        System.out.println(next);




        /*Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int up;

        if (n >= k) {
            for (int i = 0; i < n; i++) {
                up = sc.nextInt();
                System.out.print(up + " ");
                if (up > k || up == 1) {
                    count++;
                }

            }

        }

        System.out.println(count);*/

    }
}


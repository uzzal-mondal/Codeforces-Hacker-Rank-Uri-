package ProblemSolvingDayByDay.CodeForces.Java;

import java.util.Scanner;

public class NextRoundFour {
    public static void main(String[] args) {
        int np, sp, count = 0;
        int[] numArray = new int[50];
        Scanner sc = new Scanner(System.in);
        np = sc.nextInt();
        sp = sc.nextInt();

        if (np >= sp) {
            for (int i = 0; i < np; i++) {
                numArray[i] = sc.nextInt();
                //System.out.printf("%d \n", numArray[i]);
            }

            for (int i = 0; i < np; i++) {
               /* System.out.println("Start sp: " + sp);
                System.out.printf("Array sp : %d \n", numArray[sp]);
                System.out.println("End sp: " + sp);*/

                if (numArray[sp - 1] <= numArray[i] && numArray[i] > 0) {
                    count++;
                }

            }
            System.out.println(count);

        }
    }
}

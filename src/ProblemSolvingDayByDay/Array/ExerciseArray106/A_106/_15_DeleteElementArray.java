package ProblemSolvingDayByDay.Array.ExerciseArray106.A_106;

import java.util.Scanner;

public class _15_DeleteElementArray {
    public static void main(String[] args) {
        int[] arrayNum = new int[10];
        int testNum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of array : ");
        testNum = sc.nextInt();

        for (int i = 0; i < testNum; i++) {
            System.out.printf("Element [%d] : ", i);
            arrayNum[i] = sc.nextInt();
        }

        for (int i = 0; i < testNum; i++) {
            System.out.printf("%d ", arrayNum[i]);
        }

        System.out.println("\nEnter your position : ");
        int position = sc.nextInt();

        /**
         * delete element of array ...
         */
        for (int i = position - 1; i < testNum - 1; i++) {
            arrayNum[i] = arrayNum[i + 1];
        }


        for (int i = 0; i < testNum - 1; i++) {
            System.out.printf("%d ", arrayNum[i]);
        }
    }
}

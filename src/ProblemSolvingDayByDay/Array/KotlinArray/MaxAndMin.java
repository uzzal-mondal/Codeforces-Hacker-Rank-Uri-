package ProblemSolvingDayByDay.Array.KotlinArray;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        /**
         * Max and Min value find out..
         */
        int[] arrayNum = new int[50];
        System.out.println("Enter your input data : ");
        Scanner sc = new Scanner(System.in);
        int testNum = sc.nextInt();

        for (int i = 0; i < testNum; i++) {
            System.out.printf("element [%d] - ", i);
            arrayNum[i] = sc.nextInt();
        }
        showMaxMin(arrayNum, testNum);


    }

    public static void showMaxMin(int[] arr, int testNum) {

        int max, min;
        max = arr[0];
        min = arr[0];

        /**
         * Maximum value
         * Minimum value
         */
        for (int i = 0; i < testNum; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);

    }


}

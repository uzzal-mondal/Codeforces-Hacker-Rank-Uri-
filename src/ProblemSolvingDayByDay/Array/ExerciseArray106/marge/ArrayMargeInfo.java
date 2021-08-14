package ProblemSolvingDayByDay.Array.ExerciseArray106.marge;

import java.util.Scanner;

public class ArrayMargeInfo {
    public static void main(String[] args) {

        int[] arrayOne = new int[50];
        int[] arrayTwo = new int[50];
        int[] arrayMarge = new int[50];
        int i, k;

        System.out.print("Enter your user input : ");
        Scanner sc = new Scanner(System.in);
        int fInputNum = sc.nextInt();


        /**
         * first array input..
         */
        System.out.printf("your input num : %d\n", fInputNum);
        System.out.println("first matrix array input ");
        for (i = 0; i < fInputNum; i++) {
            System.out.printf("element [%d] : ", i);
            arrayOne[i] = sc.nextInt();
            arrayMarge[i] = arrayOne[i];
            k = i;
            System.out.printf("K index : %d - Array Merge : %d\n", k, arrayMarge[i]);

            //System.out.println("First K line : " + k);
        }
        k = i; // 1 2 3 4
        System.out.println("Total first element K : " + k);

        /**
         * second array input..
         */
        System.out.print("\nEnter second input num : ");
        int sInputNum = sc.nextInt();
        System.out.printf("\nyour input num : %d\n", sInputNum);
        System.out.println("second matrix array input");
        for (i = 0; i < sInputNum; i++) {
            System.out.printf("element [%d] : ", i);
            arrayTwo[i] = sc.nextInt();
            arrayMarge[k] = arrayTwo[i];
            System.out.printf("k index : %d  -  Array k marge : %d \n", k, arrayMarge[k]);
            k++;
        }

        System.out.println("Total second element K : " + k);


        /**
         * array marge print...
         */
        System.out.println("\nArray marge print : ");
        for (i = 0; i < k; i++) {
            System.out.printf("%d ", arrayMarge[i]);
        }


    }
}

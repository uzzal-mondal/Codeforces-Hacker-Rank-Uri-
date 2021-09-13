package ProblemSolvingDayByDay.Array.ExerciseArray106.A_106;

import java.util.Scanner;

public class _16_SecondLargestElement {
    public static void main(String[] args) {
        int[] arrayNum = new int[10];
        int testNum, i, secondMax = 0, temp;
        int max = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of array : ");
        testNum = sc.nextInt();

        for (i = 0; i < testNum; i++) {
            System.out.printf("elements [%d] : ", i);
            arrayNum[i] = sc.nextInt();
        }

        /*   *//**
         * must be need array sorted using by bubble sort.
         * bubble sort algo working for number of iteration..
         * first loop for iteration.(n-1)
         * second loop for comparison.(n - 1 - i);
         *//*

        //arrange in Ascending order...
        for (i = 0; i < testNum - 1; i++) {
            for (secondMax = 0; secondMax < testNum - 1 - i; secondMax++) {
                if (arrayNum[secondMax] < arrayNum[secondMax + 1]) {
                    temp = arrayNum[secondMax];
                    arrayNum[secondMax] = arrayNum[secondMax + 1];
                    arrayNum[secondMax + 1] = temp;
                }
            }
        }


        *//**
         * print of array.
         */
        System.out.println("Sorted array : ");
        for (i = 0; i < testNum; i++) {
            System.out.printf("%d ", arrayNum[i]);
        }


        /**
         * maximum number..
         */
        max = arrayNum[0];
        for (i = 0; i < testNum; i++) {
            if (arrayNum[i] > max) {
                secondMax = max;
                max = arrayNum[i];
            }
        }

        System.out.printf("\ni:  %d , secondMax %d\n", i, secondMax);
        System.out.printf("largest num : %d ", max);

        /**
         * Ignore the largest element and find the second largest element in the arary
         */
        //System.out.println("\nSecond largest number in array : ");
        System.out.println("Array num " + arrayNum[i]);
        System.out.println("Max " + max);
        System.out.println("second max : " + secondMax);

        if (arrayNum[i] < max && arrayNum[i] > secondMax) {
            secondMax = arrayNum[secondMax];
        }
        System.out.println("Second large : " + secondMax);


        /*int secondLarge = 0;
        for (i = 0; i < testNum; i++) {
            if (i == secondMax) {
                i++;
                i--;
            } else {
                if (secondLarge < arrayNum[i]) {
                    secondLarge = arrayNum[i];
                }
            }
        }*/

    }
}

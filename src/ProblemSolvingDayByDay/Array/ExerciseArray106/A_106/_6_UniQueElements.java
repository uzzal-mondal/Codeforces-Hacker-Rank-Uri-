package ProblemSolvingDayByDay.Array.ExerciseArray106.A_106;

import java.util.Scanner;

/**
 * C to print all unique elements in an array.
 */

public class _6_UniQueElements {
    public static void main(String[] args) {

        /*-----------Unique elements in array----------------*/
        int[] numOfArray = new int[100];
        int count, k, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array : ");
        int n = sc.nextInt();

        /*-----------input elements---------------*/
        System.out.printf("Input %d elements in the array :\n", n);
        for (i = 0; i < n; i++) {
            System.out.printf("elements-[%d] : ", i);
            numOfArray[i] = sc.nextInt();
            // System.out.printf("%d\n", numOfArray[i]);
        }

        /*--------all elements are print------------*/
        System.out.println("Total elements are print : ");
        for (i = 0; i < n; i++) {
            System.out.printf("%d ", numOfArray[i]);
        }

        /*-------------Unique all elements are print--------*/
        System.out.println("\nThe unique elements found in the array are : ");
        for (i = 0; i < n; i++) {
            count = 0;
            for (j = 0; j < n; j++) {
                System.out.printf("\ni : %d  - j: %d\n", i, j);
                /**
                 * index not equal then - true.
                 */
                if (i != j) {
                    /**
                     * element == element then execute..
                     */
                    if (numOfArray[i] == numOfArray[j]) {
                        /*---don't unique---*/
                        count++;
                    }
                }
            }
            // System.out.println();
            if (count == 0) {
                System.out.printf("\n Unique Array : %d ", numOfArray[i]);
            }
            System.out.println();
        }
    }
}


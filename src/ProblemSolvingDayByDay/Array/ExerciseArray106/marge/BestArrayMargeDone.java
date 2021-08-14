package ProblemSolvingDayByDay.Array.ExerciseArray106.marge;

import java.util.Scanner;

public class BestArrayMargeDone {
    public static void main(String[] args) {
        // input size1 - 5, size2 - 6
        int size1, size2, i, k;
        int[] array1 = new int[50];
        int[] array2 = new int[50];
        int[] arrayMarge = new int[50];

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array1 size : ");
        size1 = sc.nextInt();

        System.out.println("Enter array1 elements input : " + size1);
        for (i = 0; i < size1; i++) {
            System.out.printf("Element [%d] : ", i);
            array1[i] = sc.nextInt();
            arrayMarge[i] = array1[i];
            /* System.out.printf("Array Merge : %d\n", arrayMarge[i]);
            k = i; //0 , 1 , 2 , 3 , 4
            System.out.println("K index by i : " + k);*/
        }

        /*---------important tricks--------*/
        k = i; // index - 0, 1, 2, 3, 4 ele - 5.
        System.out.println("ele of K : " + k); // 5


        /*-------------second step------------*/
        System.out.print("\nEnter array2 size : ");
        size2 = sc.nextInt();
        System.out.println("Enter array2 elements input : " + size2);
        for (i = 0; i < size2; i++) {
            System.out.println("K index by i : " + k);// 5 , 6, 7..........
            System.out.printf("Element [%d] : ", i);//0 - 6, 1 -7, 2 - 8......
            array2[i] = sc.nextInt();
            arrayMarge[k] = array2[i];
            System.out.printf("Array marge : %d \n", arrayMarge[k]); //0-6, 1-7...
            k++;
            System.out.println("K : " + k);//6, 7, 8, 9, 10, 11.
        }

        /*------------------array merge----------------*/
        System.out.println("The new array after merging : ");
        for (i = 0; i < k; i++) { // 11
            System.out.printf("%d ", arrayMarge[i]);
            /**
             * input of first element - 5
             * 0-1
             * 1-2
             * 2-3
             * 3-4
             * 4-5 end of first element.....
             */

            //k - i   index - 4, ele - 5;

            /** input of second element - 6
             * This is k = 5 increment by i.....#@@
             * 5-6
             * 6-7
             * 7-8
             * 8-9
             * 9-10
             * 10-11
             */
            //k - i   index - 10, ele - 11;
        }

    }
}

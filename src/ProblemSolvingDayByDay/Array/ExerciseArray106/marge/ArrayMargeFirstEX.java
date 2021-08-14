package ProblemSolvingDayByDay.Array.ExerciseArray106.marge;

import java.util.Scanner;

public class ArrayMargeFirstEX {
    public static void main(String[] args) {
        /* first input 4 = 1, 2, 3, 4*/
        /* second input 4 = 1, 2, 3, 4*/
        int i = 0, k, temp, p, q;
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] arrayMarge = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your user input num : ");
        int inputNum = sc.nextInt();
        System.out.printf("Your input num : %d\n", inputNum);

        /*----------input for first array------------*/
        System.out.println("Enter your first array input : ");
        for (; i < inputNum; i++) {
            System.out.printf("Elements [%d] : ", i);
            array1[i] = sc.nextInt();
            arrayMarge[i] = array1[i];  //index 0 - ele 1.....
           /* System.out.printf("Array Merge : %d\n", arrayMarge[i]);
            k = i; //0 , 1 , 2 , 3 , 4
            System.out.println("K index by i : " + k);*/
        }
        k = i; // index - 0,1,2,3,4 ele - 5.
        System.out.println("ele of K : " + k); // 5



        /*----------- input for second array----------*/
        System.out.println("\nEnter your second array input : ");
        for (i = 0; i < inputNum; i++) {
            System.out.printf("Elements [%d] : ", i);
            System.out.println("second K : " + k);
            array2[i] = sc.nextInt();
            arrayMarge[k] = array2[i];
            System.out.printf("Array Merge : %d\n", arrayMarge[i]);
            k++;
            System.out.println("K print : " + k);

        }

        /*-----------print array marge----------------*/
        System.out.println("After new Array marge : ");
        for (i = 0; i < k; i++) {
            System.out.print(arrayMarge[i] + " ");
        }


        /* *//*---------sorting the array..-------**//*
        for ( q = 0; q < k; q++) {
            for (p = 0; p < k; p++) {
                if (arrayMarge[p] > arrayMarge[p + 1]) {
                    temp = arrayMarge[p];
                    arrayMarge[p] = arrayMarge[p + 1];
                    arrayMarge[p + 1] = temp;
                }
            }

            // System.out.println();
        }

        *//*---------------elements of array c are..---------------*//*
        System.out.println("\nArray sorted print : ");
        for (p = 0; p < k; p++) {
            if (p == k) {
                System.out.print(arrayMarge[i] + " ");
            } else {
                System.out.print(arrayMarge[i] + " ");
            }

        }*/
    }
}

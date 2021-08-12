package ProblemSolvingDayByDay.Array.ExerciseArray106.marge;

import java.util.Scanner;

public class ArrayMarge1 {
    public static void main(String[] args) {
        int size1, size2, i, k;
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] arrayMarge = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array1 size : ");
        size1 = sc.nextInt();

        System.out.println("Enter array1 elements input : " + size1);
        for (i = 0; i < size1; i++) {
            System.out.printf("Element [%d] : ", i);
            array1[i] = sc.nextInt();
            arrayMarge[i] = array1[i];
            //System.out.printf("Array Merge : %d\n", arrayMarge[i]);
           /* k = i;
            System.out.println("K line : " + k);*/
        }

        /*---------important tricks--------*/
        k = i; // 0 , 1 , 2 , 3 = 4;
        System.out.println("K : " + k);

        /*-------------second step------------*/
        System.out.print("Enter array2 size : ");
        size2 = sc.nextInt();
        System.out.println("Enter array2 elements input : " + size2);
        for (i = 0; i < size2; i++) {
            System.out.printf("Element [%d] : ", i);
            array2[i] = sc.nextInt();
            arrayMarge[k] = array2[i];
            System.out.println("Marge  K : " + k);
            System.out.printf("Array marge : %d \n", arrayMarge[k]);
            k++; //5 , 6 , 7 , 8 - index. i = k
            System.out.println("K : " + k);
        }

        /*------------------array merge----------------*/
        System.out.println("The new array after merging : ");
        for (i = 0; i < k; i++) {
            System.out.printf("%d ", arrayMarge[i]);
        }

    }
}

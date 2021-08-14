package ProblemSolvingDayByDay.Array.ExerciseArray106.marge;

import java.util.Scanner;

public class ArrayMargeSecondEx {
    public static void main(String[] args) {
        int[] array1 = new int[50];
        int[] array2 = new int[50];
        int[] arrayMarge = new int[50];
        int i, k;

        System.out.print("Enter Array One size : ");
        Scanner sc = new Scanner(System.in);
        int firstInputNum = sc.nextInt();

        /*-------array one elements input--------*/
        System.out.println("Enter array One elements : ");
        for (i = 0; i < firstInputNum; i++) {
            System.out.printf("Elements[%d] : ", i);
            array1[i] = sc.nextInt();
            arrayMarge[i] = array1[i];
        }
        k = i;

        /*-------array two elements input--------*/
        System.out.print("Enter array second size : ");
        int secondInputNum = sc.nextInt();
        System.out.println("Enter array Two elements : ");
        for (i = 0; i < secondInputNum; i++) {
            System.out.print("Elements : ");
            array2[i] = sc.nextInt();
            arrayMarge[k] = array2[i];
            k++;
        }

        /*--------array marge-----------*/
        System.out.println("Array marge : ");
        for (i = 0; i < k; i++) {
            System.out.print(arrayMarge[i] + " ");
        }

    }
}

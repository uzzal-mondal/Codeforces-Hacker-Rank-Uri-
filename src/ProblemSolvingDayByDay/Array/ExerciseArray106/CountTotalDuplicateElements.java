package ProblemSolvingDayByDay.Array.ExerciseArray106;

import java.util.Scanner;

public class CountTotalDuplicateElements {
    public static void main(String[] args) {
        int[] array1 = new int[100];
        int[] array2 = new int[100];
        int[] array3 = new int[100];
        int inputNum, count = 0, dpValue = 1;

        System.out.print("Count total number of duplicate elements in an array : ");
        Scanner sc = new Scanner(System.in);
        inputNum = sc.nextInt();

        /*-------------input elements------------------*/
        System.out.printf("Input %d elements in the array : \n", inputNum);
        for (int i = 0; i < inputNum; i++) {
            System.out.printf("element - [%d] : ", i);
            array1[i] = sc.nextInt();
        }

        /*---------------copy in other array----------*/
        for (int i = 0; i < inputNum; i++) {
            array2[i] = array1[i];
            array3[i] = 0;
        }

        /*--------------Mark in the duplicate values--------*/
        for (int i = 0; i < inputNum; i++) {
            for (int j = 0; j < inputNum; j++) {
                if (array1[i] == array2[j]) {
                    array3[j] = dpValue;
                    System.out.printf("i: %d  -  j: %d  = Array3 : %d\n", i, j, array3[j]);
                    dpValue++;
                    System.out.println("MM : " + dpValue);
                }
            }
            dpValue = 1;
            System.out.println("second dpValue : " + dpValue);
        }

        /*----------prints the duplicate array---------*/
        for (int i = 0; i < inputNum; i++) {
            if (array3[i] == 2) {
                System.out.printf("Next Array3  : %d\n", array3[i]);
                count++;
            }
        }
        System.out.println("Total number of duplicate elements found in array: " + count);
    }
}

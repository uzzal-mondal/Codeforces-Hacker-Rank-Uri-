package ProblemSolvingDayByDay.Array.ExerciseArray106;

import java.util.Scanner;

public class CountTotalDuplicateElements {
    public static void main(String[] args) {
        int[] array1 = new int[100];
        int[] array2 = new int[100];
        int[] array3 = new int[100];
        int inputNum, dpValue = 0, mm = 1;

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
                    array3[j] = mm;
                    System.out.printf("i: %d  -  j: %d  = Array3 : %d\n", i, j, array3[j]);
                    mm++;
                    System.out.println("MM : " + mm);

                }
            }
            mm = 1;
            System.out.println("second mm : " + mm);
        }

        /*----------prints the array---------*/
        for (int i = 0; i < inputNum; i++) {
            if (array3[i] == 2) {
                dpValue++;
            }
        }
        System.out.println("The total number of duplicate elements found in the array is: " + dpValue);

    }
}

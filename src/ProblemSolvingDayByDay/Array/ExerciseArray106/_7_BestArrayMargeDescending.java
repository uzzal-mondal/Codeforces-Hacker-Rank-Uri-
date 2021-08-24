package ProblemSolvingDayByDay.Array.ExerciseArray106;

import java.util.Scanner;

public class _7_BestArrayMargeDescending {
    public static void main(String[] args) {
        int[] array1 = new int[50];
        int[] array2 = new int[50];
        int[] arrayMarge = new int[50];
        int inputNum, i, j, k, temp, count;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of elements first array : ");
        inputNum = sc.nextInt();
        System.out.printf("Input %d elements in the array : \n", inputNum);

        /*-----------array one input-----------*/
        for (i = 0; i < inputNum; i++) {
            System.out.printf("element - %d : ", i);
            array1[i] = sc.nextInt();
            arrayMarge[i] = array1[i];
        }
        k = i;

        /*-------------array two input-----------*/
        System.out.print("Input number of elements Second array : ");
        inputNum = sc.nextInt();
        System.out.printf("Input %d elements in the array : \n", inputNum);
        for (i = 0; i < inputNum; i++) {
            System.out.printf("element - %d : ", i);
            array2[i] = sc.nextInt();
            arrayMarge[k] = array2[i];
            k++;
            // System.out.printf("%d ", arrayMarge[k]);
        }


        //System.out.println("K element : " + k);
        /*System.out.println("Array marge : ");
        for (i = 0; i < k; i++) {
            System.out.printf("%d ", arrayMarge[k]);
        }*/


        /*------------- array descending marge ---------------*/
        for (j = 0; j < k - 1; j++) {
            for (i = 0; i < k - 1; i++) {
                if (arrayMarge[i] < arrayMarge[i + 1]) {
                    temp = arrayMarge[i + 1];
                    arrayMarge[i + 1] = arrayMarge[i];
                    arrayMarge[i] = temp;

                }
            }
        }
        System.out.println("Array descending order");
        for (i = 0; i < k; i++) {
            System.out.print(arrayMarge[i] + " ");
        }

        /*---------find the unique array-----*/
        System.out.println("\nUnique array num : ");
        for (i = 0; i < k; i++) {
            count = 0;
            for (j = 0; j < k; j++) {
                if (i != j) {
                    if (arrayMarge[i] == arrayMarge[j]) {
                        count++;
                    }
                }
            }
            if (count == 0) {
                System.out.printf("%d ", arrayMarge[i]);
            }
        }

    }
}

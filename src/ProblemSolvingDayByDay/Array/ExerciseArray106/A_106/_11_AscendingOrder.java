package ProblemSolvingDayByDay.Array.ExerciseArray106.A_106;

import java.util.Scanner;

public class _11_AscendingOrder {
    public static void main(String[] args) {
        /**
         * Program : 11
         * Elements of the array in sorted ascending order:
         */
        int[] arrayNum = new int[50];
        int temp, inputNum, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of array : ");
        inputNum = sc.nextInt();
        System.out.printf("Input %d elements in the array : \n", inputNum);
        /*------------input elements----------*/
        for (i = 0; i < inputNum; i++) {
            System.out.printf("element [%d] : ", i);
            arrayNum[i] = sc.nextInt();
        }

        showAscending(arrayNum, inputNum);

    }

    public static void showAscending(int[] arrayNum, int inputNum) {
        int i, j, temp;

        /*---------Ascending order----------*/
        System.out.println("Array Ascending order : ");
        for (i = 0; i < inputNum; i++) {
            for (j = i + 1; j < inputNum; j++) {
                if (arrayNum[i] > arrayNum[j]) {
                    temp = arrayNum[i];
                    arrayNum[i] = arrayNum[j];
                    arrayNum[j] = temp;
                }
            }
        }

        /**
         * ascending array print..
         */
        for (i = 0; i < inputNum; i++) {
            System.out.printf("%d ", arrayNum[i]);
        }
    }
}

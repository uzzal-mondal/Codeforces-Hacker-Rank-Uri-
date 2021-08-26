package ProblemSolvingDayByDay.Array.ExerciseArray106.A_106;

import java.util.Scanner;

public class _12_DescendingOrder {
    public static void main(String[] args) {
        /**
         * Program : 12
         * Elements of the array in sorted descending order:
         */
        int[] arrayNum = new int[50];
        int i, inputNum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of array : ");
        inputNum = sc.nextInt();
        System.out.printf("input %d elements are array \n", inputNum);
        /*---------- input the array element.----------*/
        for (i = 0; i < inputNum; i++) {
            System.out.printf("Element [%d] : ", i);
            arrayNum[i] = sc.nextInt();
        }
        bubbleShort(arrayNum, inputNum);
        System.out.println("Elements of the array in sorted descending order: ");
        printArray(arrayNum, inputNum);

    }

    /**
     * Bubble short logical part..
     */
    private static void bubbleShort(int[] arrayNum, int inputNum) {
        int i, j, temp;
        /*----------------Descending order ----------------*/
        for (i = 0; i < inputNum - 1; i++) {
            boolean swapped = false;
            for (j = 0; j < inputNum - 1 - i; j++) {
                if (arrayNum[j] < arrayNum[j + 1]) {
                    temp = arrayNum[j];
                    arrayNum[j] = arrayNum[j + 1];
                    arrayNum[j + 1] = temp;
                    swapped = true;
                }
                //todo: IF no two elements were swapped by inner loop, then break
                if (!swapped) {
                    break;
                }
            }
        }
    }

    /**
     * print array...
     */
    public static void printArray(int[] arrayNum, int inputNum) {
        int i;
        for (i = 0; i < inputNum; i++) {
            System.out.printf("%d ", arrayNum[i]);
        }
    }

}

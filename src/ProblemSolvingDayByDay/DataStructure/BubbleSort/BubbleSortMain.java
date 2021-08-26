package ProblemSolvingDayByDay.DataStructure.BubbleSort;

import java.util.Scanner;

public class BubbleSortMain {
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
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.showBubbleShort(arrayNum, inputNum);
        System.out.println("Elements of the array in sorted descending order: ");
        bubbleSort.showPrintArray(arrayNum, inputNum);
    }
}

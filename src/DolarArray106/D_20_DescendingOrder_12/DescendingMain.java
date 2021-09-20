package DolarArray106.D_20_DescendingOrder_12;

import DolarArray106.D_19_SortElements_11.SortedAscending;

import java.util.Scanner;

public class DescendingMain {
    public static void main(String[] args) {
        int i, testNum;
        int[] arrayNum = new int[10];

        System.out.println("Test data : ");
        Scanner sc = new Scanner(System.in);
        testNum = sc.nextInt();
        System.out.println("Input the size of array : " + testNum);

        /**
         * user input..
         */
        for (i = 0; i < testNum; i++) {
            System.out.printf("elements [%d] : ", i);
            arrayNum[i] = sc.nextInt();
        }

        Descending descending = new Descending();
        descending.showDescendingOrder(arrayNum, testNum);

    }
}

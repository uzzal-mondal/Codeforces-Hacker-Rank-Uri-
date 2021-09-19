package DolarArray106.D_19_SortElements_11;

import java.util.Scanner;

/**
 * Program : 11
 * Elements of the array in sorted ascending order:
 */
public class SortedAscendingMain {
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

        SortedAscending s = new SortedAscending();
        s.showAscendingOrder(arrayNum, testNum);

    }
}

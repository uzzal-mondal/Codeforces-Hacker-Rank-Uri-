package DolarArray106.D_19_OddAndEven;

import java.util.Scanner;

public class OddEvenMain {
    public static void main(String[] args) {
        int[] arrayNum = new int[10];
        int testNum, i;
        System.out.println("Test Data : ");
        Scanner sc = new Scanner(System.in);
        testNum = sc.nextInt();
        System.out.println("Input number elements stored array : " + testNum);

        /**
         * user input
         */
        for (i = 0; i < testNum; i++) {
            System.out.printf("element [%d] : ", i);
            arrayNum[i] = sc.nextInt();
        }

        /**
         * logic...
         */
        OddEven oddEven = new OddEven();
        oddEven.showEven(arrayNum, testNum);
        oddEven.showOdd(arrayNum, testNum);

    }
}

package DolarArray106.D_14_DuplicateElements_5;

import java.util.Scanner;

public class DuplicatesMain {
    public static void main(String[] args) {
        int testData;
        int[] arrayNum = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Test Data : ");
        testData = sc.nextInt();
        System.out.printf("Input number elements stored in array : %d\n", testData);
        /**
         * from user input:---
         */
        for (int i = 0; i < testData; i++) {
            System.out.printf("element [%d] : ", i);
            arrayNum[i] = sc.nextInt();
        }

        DuplicateArray dp = new DuplicateArray();
        dp.showDuplicateArray(arrayNum, testData);
    }
}

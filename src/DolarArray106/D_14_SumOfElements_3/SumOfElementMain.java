package DolarArray106.D_14_SumOfElements_3;

import java.util.Scanner;

public class SumOfElementMain {
    public static void main(String[] args) {

        int testData;
        int[] arrayNum = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Test Data : ");
        testData = sc.nextInt();
        System.out.printf("Input number elements stored in array : %d\n", testData);
        /**
         * input from user..
         */
        for (int i = 0; i < testData; i++) {
            System.out.printf("elements [%d] : ", i);
            arrayNum[i] = sc.nextInt();
        }
        /**
         * logical part call
         */
        SumOfElement sumOfElement = new SumOfElement();
        sumOfElement.showSumOfElements(arrayNum, testData);
    }
}

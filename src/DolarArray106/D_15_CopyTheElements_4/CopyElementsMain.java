package DolarArray106.D_15_CopyTheElements_4;

import java.util.Scanner;

public class CopyElementsMain {
    public static void main(String[] args) {
        int testData;
        int[] arrayNum = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("test data : ");
        testData = sc.nextInt();
        System.out.printf("Input of elements in array :%d\n", testData);

        /**
         * from user elements..
         */
        for (int i = 0; i < testData; i++) {
            System.out.printf("elements [%d] : ", i);
            arrayNum[i] = sc.nextInt();
        }

        CopyElements ce = new CopyElements();
        ce.showCopyElements(arrayNum, testData);
    }
}

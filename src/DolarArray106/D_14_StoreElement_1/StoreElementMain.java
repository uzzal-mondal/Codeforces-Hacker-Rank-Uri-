package DolarArray106.D_14_StoreElement_1;

import java.util.Scanner;

/**
 * C to store elements in an array and print it
 */
public class StoreElementMain {
    public static void main(String[] args) {
        int testNum;
        int[] arrayNum = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Test data : ");
        testNum = sc.nextInt();
        System.out.printf("Input %d elements in the array\n", testNum);

        for (int i = 0; i < testNum; i++) {
            System.out.printf("element [%d] : ", i);
            arrayNum[i] = sc.nextInt();
        }

        /**
         *   logical part call..
         */
        StoreElement storeElement = new StoreElement();
        storeElement.showStoreArrayElement(arrayNum, testNum);


    }
}

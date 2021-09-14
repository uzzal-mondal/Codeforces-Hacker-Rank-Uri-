package DolarArray106.D_14_UniqueElements_6;

import java.util.Scanner;

public class UniqueElementsMain {
    public static void main(String[] args) {

        int[] arrayNum = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Test num : ");
        int testNum = sc.nextInt();
        System.out.printf("Input elements  stored in the array: %d\n", testNum);
        /**
         * for user input :
         */
        for (int i = 0; i < testNum; i++) {
            System.out.printf("Elements [%d] : ", i);
            arrayNum[i] = sc.nextInt();
        }

        UniqueElements uniqueElements = new UniqueElements();
        uniqueElements.showUniqueElements(arrayNum, testNum);
    }
}

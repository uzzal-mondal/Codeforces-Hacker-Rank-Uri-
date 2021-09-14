package DolarArray106.D_14_ReverseArray_2;

import java.util.Scanner;

public class ReverseArrayMain {
    public static void main(String[] args) {

        int testNum;
        int[] arrayNum = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Test data : ");
        testNum = sc.nextInt();
        System.out.printf("Input number elements store in array : %d\n", testNum);

        /**
         * input from user elements.
         */
        for (int i = 0; i < testNum; i++) {
            System.out.printf("elements [%d] : ", i);
            arrayNum[i] = sc.nextInt();
        }

        /**
         * logical part call here..
         */
        ReverseArray reverseArray = new ReverseArray();
        reverseArray.showReverseArray(arrayNum, testNum);

    }
}

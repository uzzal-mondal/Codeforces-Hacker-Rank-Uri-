package DolarArray106.D_19_MaximumAndMinimum_9;

import java.util.Scanner;

public class MaxAndMinMain {
    public static void main(String[] args) {

        int[] arrayNum = new int[10];
        System.out.println("Test data : ");
        int testNum, max, min, i, j, temp;
        Scanner sc = new Scanner(System.in);
        testNum = sc.nextInt();
        System.out.printf("Input number elements stored array : %d \n", testNum);

        // input num..
        for (i = 0; i < testNum; i++) {
            System.out.printf("elements [%d] : ", i);
            arrayNum[i] = sc.nextInt();
        }

        /**
         * logical part .
         */
        MaxMin m = new MaxMin();
        m.showMax(arrayNum, testNum);
        m.showMin(arrayNum, testNum);


    }
}

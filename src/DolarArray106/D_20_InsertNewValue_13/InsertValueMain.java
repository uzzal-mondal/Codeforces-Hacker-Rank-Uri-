package DolarArray106.D_20_InsertNewValue_13;

import java.util.Scanner;

/**
 * C to insert New value in the array (sorted list )..
 */
public class InsertValueMain {
    public static void main(String[] args) {

        int testData, i, insertValue, pos;
        int[] arrayNum = new int[10];

        System.out.println("Test data");
        Scanner sc = new Scanner(System.in);
        testData = sc.nextInt();
        System.out.println("Input the size of array : " + testData);

        /**
         * user form input...
         */
        for (i = 0; i < testData; i++) {
            System.out.printf("element [%d] : ", i);
            arrayNum[i] = sc.nextInt();
        }

        System.out.print("please your inset value : ");
        insertValue = sc.nextInt();
        System.out.print("Which position ? : ");
        pos = sc.nextInt();


        /**
         * using loop cause of
         */
        for (i = testData; i >= pos; i--) {
            arrayNum[i] = arrayNum[i - 1];
        }

        /**
         * including the insert value of my position...
         */
        arrayNum[pos - 1] = insertValue;

        for (i = 0; i < testData + 1; i++) {
            System.out.printf(" %d", arrayNum[i]);
        }


    }
}

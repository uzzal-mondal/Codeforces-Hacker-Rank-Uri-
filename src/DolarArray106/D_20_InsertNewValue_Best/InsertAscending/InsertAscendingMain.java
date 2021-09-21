package DolarArray106.D_20_InsertNewValue_Best.InsertAscending;

import java.util.Scanner;

public class InsertAscendingMain {
    public static void main(String[] args) {
        int[] arrayNum = new int[50];
        int i, pos = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Test data : ");
        int inputSize = sc.nextInt();

        // user form input here...
        for (i = 0; i < inputSize; i++) {
            System.out.printf("element [%d] : ", i);
            arrayNum[i] = sc.nextInt();
        }

        System.out.print("insert value : ");
        int insertValue = sc.nextInt();

        InsertValueAscending iv = new InsertValueAscending();
        iv.showInsertAscendingValue(arrayNum, inputSize, insertValue);


    }
}

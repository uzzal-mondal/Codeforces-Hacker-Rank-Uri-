package DolarArray106.D_20_InsertNewValue_Best;

import java.util.Scanner;

public class InsertValueMain {
    public static void main(String[] args) {

        int[] arrayNum = new int[50];
        int i;
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
        System.out.print("Which position : ");
        int position = sc.nextInt();
        InsertValue iv = new InsertValue();
        iv.showInsert(arrayNum, inputSize, insertValue, position);
    }
}

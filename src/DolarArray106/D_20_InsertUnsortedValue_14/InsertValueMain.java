package DolarArray106.D_20_InsertUnsortedValue_14;

import java.util.Scanner;

/**
 * https://www.youtube.com/watch?v=vcN53c5_58U&t=204s
 * Insert value in an array...
 */

public class InsertValueMain {
    public static void main(String[] args) {

        int[] arrayInsert = new int[20];
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Test data : ");
        int inputSize = sc.nextInt();

        // user form input here...
        for (k = 0; k < inputSize; k++) {
            System.out.printf("element [%d] : ", k);
            arrayInsert[k] = sc.nextInt();
        }

        System.out.print("insert value : ");
        int insertValue = sc.nextInt();
        System.out.print("Which position : ");
        int position = sc.nextInt();
        InsertValue iv = new InsertValue();
        iv.showInsert(arrayInsert, inputSize, insertValue, position);
    }
}

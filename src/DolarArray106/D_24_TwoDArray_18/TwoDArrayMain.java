package DolarArray106.D_24_TwoDArray_18;

import java.util.Scanner;

public class TwoDArrayMain {
    public static void main(String[] args) {
        int[][] twoDArray = new int[3][3];
        System.out.println("Test data : ");
        Scanner sc = new Scanner(System.in);
        int totalInput = sc.nextInt();

        for (int i = 0; i < totalInput; i++) {
            for (int j = 0; j < totalInput; j++) {
                System.out.printf("Element [%d][%d] : ", i, j);
                twoDArray[i][j] = sc.nextInt();
            }
        }

        /**
         *  2d array print the matrix....
         */

        for (int i = 0; i < totalInput; i++) {
            for (int j = 0; j < totalInput; j++) {
                System.out.printf("%d ",twoDArray[i][j]);
            }
            System.out.println();
        }


    }
}

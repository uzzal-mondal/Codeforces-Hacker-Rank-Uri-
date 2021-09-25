package DolarArray106.D_25_SumRowsCol_21;

import java.util.Scanner;

public class SumRowsColMain {
    public static void main(String[] args) {

        int row, col;
        int[][] arrayMatrix = new int[5][5];
        int[] rowSum = new int[5];
        int[] colSum = new int[5];


        System.out.print("Input the size of the square matrix : ");
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        System.out.println("Input elements in first matrix : ");

        for (row = 0; row < inputNum; row++) {
            for (col = 0; col < inputNum; col++) {
                System.out.printf("elements [%d][%d] : ", row, col);
                arrayMatrix[row][col] = sc.nextInt();
            }

        }

        // the matrix is..
        for (row = 0; row < inputNum; row++) {
            for (col = 0; col < inputNum; col++) {
                System.out.printf("%d ", arrayMatrix[row][col]);
            }
            System.out.println();
        }

        System.out.println("The sum of rows and col in matrix : ");
        for (row = 0; row < inputNum; row++) {
            rowSum[row] = 0;
            for (col = 0; col < inputNum; col++) {
                rowSum[row] = rowSum[row] + arrayMatrix[row][col];
            }
            System.out.println();
        }

        for (row = 0; row < inputNum; row++) {
            for (col = 0; col < inputNum; col++) {
                colSum[col] = 0;
                colSum[col] = colSum[col] + arrayMatrix[row][col];
            }
            System.out.println();
        }

    }
}

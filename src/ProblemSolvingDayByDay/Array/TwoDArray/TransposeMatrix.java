package ProblemSolvingDayByDay.Array.TwoDArray;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {

        int[][] numMatrix = new int[10][10];
        int[][] transPose = new int[10][10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and cols: ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        //user input to matrix:
        System.out.println("Matrix elements input: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Num Matrix [%d][%d] : ", i, j);
                numMatrix[i][j] = sc.nextInt();
            }
        }

        //print to matrix:
        System.out.println("Matrix result: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%d ", numMatrix[i][j]);
            }
            System.out.println();
        }


        // transpose matrix:-
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transPose[j][i] = numMatrix[i][j];
            }
            //System.out.println();
        }

        System.out.println("Transpose matrix: ");
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                System.out.printf("%d ", transPose[j][i]);
            }
            System.out.println();
        }
    }
}

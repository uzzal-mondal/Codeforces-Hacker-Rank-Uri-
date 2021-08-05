package ProblemSolvingDayByDay.Array.TwoDArray;

import java.util.Scanner;

public class DiagonalElementsSum {
    public static void main(String[] args) {
        //diagonal elements:
        int[][] numOfMatrix = new int[10][10];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input rows & col : ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        // matrix elements are input
        System.out.println("Enter Matrix elements Input: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Matrix elements [%d][%d] : ", i, j);
                numOfMatrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Matrix Elements are print:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%d ", numOfMatrix[i][j]);
            }
            System.out.println();
        }

        // array matrix diagonal element..
        System.out.println("Matrix Diagonal elements : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    System.out.printf("%d ", numOfMatrix[i][j]);
                    sum = sum + numOfMatrix[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("Sum of diagonal elements: " + sum);

    }
}

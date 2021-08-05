package ProblemSolvingDayByDay.Array.TwoDArray;

import java.util.Scanner;

public class MatrixUpperSum {
    public static void main(String[] args) {
        int row, col, sum = 0;
        int[][] upperMatrix = new int[10][10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Matrix row & col : ");
        row = sc.nextInt();
        col = sc.nextInt();

        //upper matrix input
        System.out.println("Enter matrix elements input : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Matrix Elements [%d][%d] : ", i, j);
                upperMatrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter matrix print: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%d ", upperMatrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("Enter Upper Matrix print: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i < j) {
                    System.out.printf("%d\n", upperMatrix[i][j]);
                    sum = sum + upperMatrix[i][j];
                }
               // System.out.println();
            }
        }
        System.out.println("Upper Matrix result: " + sum);
    }
}

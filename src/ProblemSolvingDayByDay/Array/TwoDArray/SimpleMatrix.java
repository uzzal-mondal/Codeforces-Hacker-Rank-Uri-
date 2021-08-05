package ProblemSolvingDayByDay.Array.TwoDArray;

import java.util.Scanner;

public class SimpleMatrix {
    public static void main(String[] args) {
        int[][] A = new int[2][4];
        int[][] B = new int[2][4];
        int[][] C = new int[2][4];

      //  int fr, fc, sr, sc;
        Scanner sc = new Scanner(System.in);

        // input for A matrix.
        System.out.println("A Matrix input:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                A[i][j] = sc.nextInt();
                System.out.printf("[%d][%d] = %d\n", i, j, A[i][j]);
            }
        }

        // input A print..
        System.out.println("A matrix print: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d\t", A[i][j]);
            }
            System.out.println();
        }

        // input B matrix.
        System.out.println("B matrix Input: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                B[i][j] = sc.nextInt();
                System.out.printf("[%d][%d] = %d\n", i, j, B[i][j]);
            }
        }

        // print for B matrix.
        System.out.println("B matrix print: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d\t", B[i][j]);
            }
            System.out.println();
        }


        //sum A matrix with B matrix
        //System.out.println("Sum of A + B ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
            System.out.println();
        }

        // print sum A matrix with B matrix
        System.out.println("Sum of A + B ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d\t", C[i][j]);
            }
            System.out.println();
        }
    }
}

package ProblemSolvingDayByDay.Array.TwoDArray;

import java.util.Scanner;

public class GettingInputArray {
    public static void main(String[] args) {
        int[][] numArray = new int[10][10];
        int row, col;
        //System.out.println("Enter your data:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number row and col: ");
        row = sc.nextInt();
        col = sc.nextInt();


        //array input
        System.out.println("Enter elements for A matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                numArray[i][j] = sc.nextInt();
                System.out.printf("[%d][%d] = %d\n", i, j, numArray[i][j]);
            }
            // System.out.println();
        }

        //array print
        System.out.println("Array Matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%d ", numArray[i][j]);
            }
            System.out.println();
        }
    }
}

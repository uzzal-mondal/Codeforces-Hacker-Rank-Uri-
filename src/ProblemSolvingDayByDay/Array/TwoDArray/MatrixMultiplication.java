package ProblemSolvingDayByDay.Array.TwoDArray;

import java.util.Scanner;

public class MatrixMultiplication {
    //todo: The multiplication is possible row and col both of them are same..
    public static void main(String[] args) {
        int[][] first = new int[10][10];
        int[][] second = new int[10][10];
        int[][] res = new int[10][10];
        int rowOne, colOne, rowTwo, colTwo, sum = 0;


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first matrix rows and col: ");
        rowOne = sc.nextInt();
        colOne = sc.nextInt();

        System.out.print("Enter second matrix rows and col: ");
        rowTwo = sc.nextInt();
        colTwo = sc.nextInt();

        while (colOne != rowTwo) {
            System.out.println("Error! first matrix column not equal  to second matrix row.");

            System.out.println("please input First matrix col and second matrix row are the same");


            System.out.print("Enter first matrix rows and col: ");
            rowOne = sc.nextInt();
            colOne = sc.nextInt();

            System.out.print("Enter second matrix rows and col: ");
            rowTwo = sc.nextInt();
            colTwo = sc.nextInt();
        }

        //taking input for first matrix:
        System.out.println("First matrix elements input: ");
        for (int i = 0; i < rowOne; i++) {
            for (int j = 0; j < colOne; j++) {
                System.out.printf("first [%d][%d] = ", i, j);
                first[i][j] = sc.nextInt();
                // System.out.printf("%d\n", first[i][j]);
            }
            //System.out.println();
        }

        System.out.println("second matrix elements input: ");
        for (int i = 0; i < rowTwo; i++) {
            for (int j = 0; j < colTwo; j++) {
                System.out.printf("second [%d][%d] = ", i, j);
                second[i][j] = sc.nextInt();
                //System.out.printf("[%d][%d] - %d\n", i, j, second[i][j]);
            }
            //System.out.println();
        }


        System.out.println("First matrix print: ");
        for (int i = 0; i < rowOne; i++) {
            for (int j = 0; j < colOne; j++) {
                System.out.print(first[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Second matrix print: ");
        for (int i = 0; i < rowTwo; i++) {
            for (int j = 0; j < colTwo; j++) {
                System.out.print(second[i][j] + " ");
            }
            System.out.println();
        }

        //multiplying matrix..
        for (int i = 0; i < rowOne; i++) {
            for (int j = 0; j < colTwo; j++) {
                for (int k = 0; k < colOne; k++) {
                    sum = sum + first[i][k] * second[k][j];
                }
                res[i][j] = sum;
                sum = 0;
            }
            //System.out.println();
        }

        // result matrix:-
        System.out.println("Multiplying matrix result: ");
        for (int i = 0; i < rowOne; i++) {
            for (int j = 0; j < colTwo; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}

package DolarArray106.D_24_SubtractionMatrix_20;


import java.util.Scanner;

public class SubtractionMatrixMain {
    public static void main(String[] args) {

        int[][] firstTwoDArray = new int[3][3];
        int[][] secondTwoDArray = new int[3][3];
        System.out.print("Input the size of the square matrix : ");
        int testNum;
        Scanner sc = new Scanner(System.in);
        testNum = sc.nextInt();


        //first matrix....
        System.out.println("Input element the first matrix : ");
        for (int i = 0; i < testNum; i++) {
            for (int j = 0; j < testNum; j++) {
                System.out.printf("element [%d],[%d] : ", i, j);
                firstTwoDArray[i][j] = sc.nextInt();
            }
        }

        // second matrix...
        System.out.println("Input element the second matrix : ");
        for (int i = 0; i < testNum; i++) {
            for (int j = 0; j < testNum; j++) {
                System.out.printf("element [%d],[%d] : ", i, j);
                secondTwoDArray[i][j] = sc.nextInt();
            }
        }

        //first matrix....
        System.out.println("Input element the first matrix : ");
        for (int i = 0; i < testNum; i++) {
            for (int j = 0; j < testNum; j++) {
                System.out.printf("%d ", firstTwoDArray[i][j]);
            }
            System.out.println();
        }

        //first matrix....
        System.out.println("Input element the second matrix : ");
        for (int i = 0; i < testNum; i++) {
            for (int j = 0; j < testNum; j++) {
                System.out.printf("%d ", secondTwoDArray[i][j]);
            }
            System.out.println();
        }

        SubtractionMatrix sub = new SubtractionMatrix();
        sub.showSubtractionMatrix(firstTwoDArray, secondTwoDArray, testNum);
    }
}

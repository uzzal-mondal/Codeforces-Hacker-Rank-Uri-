package DolarArray106.D_24_SubtractionMatrix_20;

public class SubtractionMatrix {
    public void showSubtractionMatrix(int[][] firstMatrix, int[][] secondMatrix, int testNum) {

        int[][] arrayResult = new int[2][2];
        // addition two matrix...
        for (int i = 0; i < testNum; i++) {
            for (int j = 0; j < testNum; j++) {
                arrayResult[i][j] = firstMatrix[i][j] - secondMatrix[i][j];
            }
        }


        System.out.println("Subtraction  are two matrix : ");
        for (int i = 0; i < testNum; i++) {
            for (int j = 0; j < testNum; j++) {
                System.out.printf("%d ", arrayResult[i][j]);
            }
            System.out.println();
        }
    }
}

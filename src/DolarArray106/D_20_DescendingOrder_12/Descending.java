package DolarArray106.D_20_DescendingOrder_12;

public class Descending {
    public void showDescendingOrder(int[] arrayNum, int testNum) {
        int i, j, temp;
        for (i = 0; i < testNum; i++) {
            for (j = i + 1; j < testNum; j++) {
                if (arrayNum[i] < arrayNum[j]) {
                    temp = arrayNum[i];
                    arrayNum[i] = arrayNum[j];
                    arrayNum[j] = temp;
                }
            }
        }
        for (i = 0; i < testNum; i++) {
            System.out.printf("%d ", arrayNum[i]);
        }
    }
}

package DolarArray106.D_19_SortElements_11;

public class SortedAscending {
    public void showBubbleSorting(int[] arrayNum, int testNum) {
        int i, j, temp;
        int flag;

        /**
         * bubble sort algo for best for sort with easy...
         */
        for (i = 0; i < testNum - 1; i++) {
            flag = 0;
            for (j = 0; j < testNum - 1 - i; j++) {
                if (arrayNum[j] > arrayNum[j + 1]) {
                    temp = arrayNum[j];
                    arrayNum[j] = arrayNum[j + 1];
                    arrayNum[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag != 0) {
                break;
            }
        }
        for (i = 0; i < testNum; i++) {
            System.out.printf("%d ", arrayNum[i]);
        }
    }

    /**
     * second way ascending  to sorted...
     *
     * @param arrayNum
     * @param testNum
     */
    public void showAscendingOrder(int[] arrayNum, int testNum) {
        int i, j, temp;
        for (i = 0; i < testNum; i++) {
            for (j = i + 1; j < testNum; j++) {
                if (arrayNum[i] > arrayNum[j]) {
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

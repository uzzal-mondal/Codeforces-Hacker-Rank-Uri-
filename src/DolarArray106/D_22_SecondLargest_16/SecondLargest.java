package DolarArray106.D_22_SecondLargest_16;

public class SecondLargest {
    public int showSecondLargest(int[] arrayNum, int testNum) {
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
        return arrayNum[testNum - 2];
    }

    public int showLargest(int[] arrayNum, int testNum) {
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
        //return arrayNum[testNum - 2];
        return arrayNum[testNum-1];
    }

}

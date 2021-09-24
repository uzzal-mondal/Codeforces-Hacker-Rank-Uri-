package DolarArray106.D_23_SecondSmallElement_17;

public class SecondSmallElement {
    public int showSmallElement(int[] arrayNum, int totalNum) {
        int i, j, temp;
        System.out.println("Large to small in array : ");
        for (i = 0; i < totalNum; i++) {
            for (j = i + 1; j < totalNum; j++) {
                if (arrayNum[i] < arrayNum[j]) {
                    temp = arrayNum[i];
                    arrayNum[i] = arrayNum[j];
                    arrayNum[j] = temp;
                }
            }

            System.out.printf("%d  ", arrayNum[i]);
        }
        return arrayNum[totalNum - 2];
    }
}

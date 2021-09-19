package DolarArray106.D_19_MaximumAndMinimum_9;

public class MaxMin {
    int i, max, min;

    /**
     * maximum value..
     */
    public void showMax(int[] arrayNum, int testNum) {
        max = arrayNum[0];
        for (i = 0; i < testNum; i++) {
            if (arrayNum[i] > max) { // when not bigger max then go to print.
                max = arrayNum[i]; // when get the max then print max.
            }
        }
        System.out.println("Maximum : " + max);
    }

    /**
     * minimum value..
     */
    public void showMin(int[] arrayNum, int testNum) {
        min = arrayNum[0];
        for (i = 0; i < testNum; i++) {
            if (arrayNum[i] < min) {
                min = arrayNum[i];
            }
        }
        System.out.println("Minimum : " + min);
    }
}

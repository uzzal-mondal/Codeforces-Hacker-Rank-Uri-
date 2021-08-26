package ProblemSolvingDayByDay.DataStructure.BubbleSort;

public class BubbleSort {
    /**
     * Bubble short logical part..
     */
    public void showBubbleShort(int[] arrayNum, int inputNum) {
        int i, j, temp;
        boolean swapped;
        /*----------------Descending order ----------------*/
        for (i = 0; i < inputNum - 1; i++) {
            swapped = false;
            for (j = 0; j < inputNum - 1 - i; j++) {
                if (arrayNum[j] < arrayNum[j + 1]) {
                    temp = arrayNum[j];
                    arrayNum[j] = arrayNum[j + 1];
                    arrayNum[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public void showPrintArray(int[] arrayNum, int inputNum) {
        int i;
        for (i = 0; i < inputNum; i++) {
            System.out.printf("%d ", arrayNum[i]);
        }
    }
}

package DolarArray106.D_14_ReverseArray_2;

public class ReverseArray {

    public int showReverseArray(int[] array, int testNum) {
        System.out.println("Array Reverse : ");
        for (int i = testNum - 1; i >= 0; i--) {
            System.out.printf("%d ", array[i]);
        }
        return testNum;
    }
}

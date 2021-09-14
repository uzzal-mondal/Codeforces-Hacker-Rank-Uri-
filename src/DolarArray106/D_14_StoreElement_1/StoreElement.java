package DolarArray106.D_14_StoreElement_1;

public class StoreElement {
    /**
     * C to store elements in an array and print it
     */

    public void showStoreArrayElement(int[] arrayNum, int testData) {
        int[] secondArray = new int[10];
        System.out.println("Elements in array are : ");
        for (int i = 0; i < testData; i++) {
            secondArray[i] = arrayNum[i];
            System.out.printf(" %d", secondArray[i]);
        }
    }

}

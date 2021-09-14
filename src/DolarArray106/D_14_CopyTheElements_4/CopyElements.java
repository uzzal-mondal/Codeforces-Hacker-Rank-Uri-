package DolarArray106.D_14_CopyTheElements_4;

/**
 * C to copy the elements of one array into another array
 */
public class CopyElements {

    public void showCopyElements(int[] arrayNum, int testData) {

        System.out.println("Before elements : ");
        for (int i = 0; i < testData; i++) {
            System.out.printf("%d ", arrayNum[i]);
        }

        int[] copyElements = new int[10];
        System.out.println("\nCopy elements : ");
        for (int i = 0; i < testData; i++) {
            copyElements[i] = arrayNum[i];
            System.out.printf("%d ", copyElements[i]);
        }
    }
}

package DolarArray106.D_14_DuplicateElements_5;

public class DuplicateArray {

    public void showDuplicateArray(int[] arrayNum, int testData) {
        /**
         * array print are..
         */
        System.out.println("Array print Before : ");
        for (int i = 0; i < testData; i++) {
            System.out.printf(" %d", arrayNum[i]);
        }
        /**
         * array duplicate...
         */

        System.out.println("\nDuplicate elements are : ");
        int count = 0;
        for (int i = 0; i < testData; i++) {
            for (int j = i + 1; j < testData; j++) {
                if (arrayNum[i] == arrayNum[j]) {
                    count++;
                    System.out.printf(" %d", arrayNum[j]);
                    break;
                }
            }
        }
        if (count != 0) {
            System.out.println("\nTotal duplicate elements found : " + count);
        }
    }
}

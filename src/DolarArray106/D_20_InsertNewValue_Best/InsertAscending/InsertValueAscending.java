package DolarArray106.D_20_InsertNewValue_Best.InsertAscending;

public class InsertValueAscending {

    public void showInsertAscendingValue(int[] arrayNum, int inputSize, int insertValue) {
        int i, pos = 0;

        /**
         * ascending to insert value store  less than  array..
         * i value store to position...
         * then break....
         * loop terminate.
         */
        for (i = 0; i < inputSize; i++) {
            if (insertValue < arrayNum[i]) {
                pos = i;
                break;
            }
        }

        /**
         * including of array position...
         * store of array position then another element of empty.
         * then again store data included in array..
         */
        for (i = inputSize; i >= pos; i--) {
            arrayNum[i] = arrayNum[i - 1];
        }

        /**
         *insert value include in arrayNum[pos]..
         */
        arrayNum[pos] = insertValue;

        /**
         * print the loop..
         * (inputSize + 1) cause of 1 size are increasing..
         */
        System.out.println("Inserting value select are position.");
        for (i = 0; i < inputSize + 1; i++) {
            System.out.printf("%d ", arrayNum[i]);
        }

    }
}

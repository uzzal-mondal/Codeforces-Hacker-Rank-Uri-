package DolarArray106.D_20_InsertNewValue_Best.InsertUnsorted;

public class InsertValue {

    public void showInsert(int[] arrayNum, int testSize, int insertValue, int position) {
        int i;

        /**
         * including of array position...
         * store of array position then another element of empty.
         * then again store data included in array..
         */
        for (i = testSize; i >= position; i--) {
            arrayNum[i] = arrayNum[i - 1];
        }

        /**
         * insert the new value you want select a position
         * array position start to - 0
         * that's why user position start to  - 1
         * array ( pos -1 ) then find user position.
         */
        arrayNum[position - 1] = insertValue;

        /**
         * print the loop..
         * cause of new value insert using to (size + 1)
         * (testSize + 1) cause of 1 size are increasing..
         */

        System.out.println("Inserting new values are : ");
        for (i = 0; i < testSize + 1; i++) {
            System.out.printf("%d ", arrayNum[i]);
        }


    }
}

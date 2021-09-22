package DolarArray106.D_21_DeleteElement_15;

public class DeleteElement {

    public void showDeleteElement(int[] arrayNum, int size, int pos) {
        int i;

        //10  20  30  40  50  60  70   80
        //0   1   2   3*   4   5   6    7

        //10  20  30    40     56      50       60      70      80           0
        //0   1   2     3*     4       5         6       7       8           9
        //             p-1     pos     s-4       s-3     s-2     s-1         size.

        // i = p-1; i<s-1; i++
        // p-1
        // a[i]  =  a[i + 1]
        // 3     =  a[3+1] - 4
        // 4     =  a[4+1] - 5
        // '''''''
        // ''''''''''''''
        //''''''''''''''''''''''

        for (i = pos - 1; i <= size - 2; i++) {
            arrayNum[i] = arrayNum[i + 1];
        }

        arrayNum[size] = 0;

        for (i = 0; i < size - 1; i++) {
            System.out.printf(" %d ", arrayNum[i]);
        }

    }
}

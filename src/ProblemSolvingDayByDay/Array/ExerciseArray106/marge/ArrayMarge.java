package ProblemSolvingDayByDay.Array.ExerciseArray106.marge;

public class ArrayMarge {
    public static void main(String[] args) {


        int[] arrayOne = {1, 3, 5, 7};
        int[] arrayTwo = {2, 4, 6, 8};

        /*--------determines a length of first array with second array---------*/
        int n1 = arrayOne.length;
        int n2 = arrayTwo.length;
        int[] array3 = new int[n1 + n2];


        mergeArrays(arrayOne, arrayTwo, n1, n2, array3);

        /*----------array after merging------------*/
        System.out.println("Array merging : ");
        for (int j : array3) {
            System.out.print(j + " ");
        }
    }

    public static void mergeArrays(int[] arrayOne, int[] arrayTwo, int n1, int n2,
                                   int[] arrayThree) {
        int i = 0, j = 0, k = 0;

        /*-------------Traverse both array-------------*/
        while ((i < n1) && (j < n2)) {

            // Check if current element of first
            // array is smaller than current element
            // of second array. If yes, store first
            // array element and increment first array
            // index. Otherwise do same with second array
            if (arrayOne[i] < arrayTwo[j]) {
                arrayThree[k++] = arrayOne[i++];
            } else if (arrayOne[i] > arrayTwo[j]) {
                arrayThree[k++] = arrayTwo[j++];
            }
        }

        /*--------store remaining elements of first array---------*/
        while (i < n1) {
            arrayThree[k++] = arrayOne[i++];
        }
        while (j < n2) {
            arrayThree[k++] = arrayTwo[j++];
        }

    }

}

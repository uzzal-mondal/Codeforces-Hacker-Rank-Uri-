package ProblemSolvingDayByDay.Array.ExerciseArray106;

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
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }

    public static void mergeArrays(int[] arrayOne, int[] arrayTwo, int n1, int n2,
                                   int[] arrayThree) {
        int p = 0, q = 0, k = 0;
        while (p < n1 && q < n2) {
            if (arrayOne[p] < arrayTwo[q]) {
                arrayThree[k++] = arrayOne[p++];
            } else if (arrayOne[p] > arrayTwo[q]) {
                arrayThree[k++] = arrayTwo[q++];
            }
        }

        /*--------store remaining elements of first array---------*/
        while (p < n1) {
            arrayThree[k++] = arrayOne[p++];
        }

        while (q < n2) {
            arrayThree[k++] = arrayTwo[q++];
        }

    }

}

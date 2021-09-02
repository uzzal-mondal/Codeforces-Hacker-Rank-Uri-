package ProblemSolvingDayByDay.Array.ExerciseArray106.A_106;

import java.util.Scanner;

public class _14_InsertNewValueUnsorted {
    public static void main(String[] args) {
        /**
         * C to insert New value in the array (unsorted list)
         */
        int i, insertValue, position;
        int[] arrayNum = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of array : ");
        int inputSize = sc.nextInt();
        System.out.printf("Input %d elements in the array in ascending order : \n", inputSize);

        /*------input array elements----*/
        for (i = 0; i < inputSize; i++) {
            System.out.printf("element [%d] : ", i);
            arrayNum[i] = sc.nextInt();
        }

        System.out.print("Input the value to be inserted : \n");
        insertValue = sc.nextInt();
        System.out.print("Input the Position, where the value to be inserted : \n");
        position = sc.nextInt();

        System.out.println("The current list of the array :");
        for (i = 0; i < inputSize; i++) {
            System.out.printf("%d ", arrayNum[i]);
        }

        //  arrayNum[position] = insertValue;
        // System.out.printf("\npos ele - %d ", arrayNum[position]);

        /**
         * this is very logical part here..
         */
        for (i = inputSize; i >= position; i--) {
            arrayNum[i] = arrayNum[i - 1];
        }
        arrayNum[position - 1] = insertValue;

        System.out.println("\nAfter Insert the element the new list is :");
        for (i = 0; i < inputSize + 1; i++) {
            System.out.printf("%d ", arrayNum[i]);
        }
    }
}

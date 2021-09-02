package ProblemSolvingDayByDay.Array.ExerciseArray106.A_106;

import java.util.Scanner;

public class _13_InsertNewValueArray {
    public static void main(String[] args) {
        /**
         * Insert new value in the array problem - 13
         */
        int inputNum, temp, position = 0;
        int[] arrayNum = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of array : ");
        inputNum = sc.nextInt();
        System.out.printf("Input %d elements array in ascending order: \n", inputNum);

        /*------input the array----------*/
        for (int i = 0; i < inputNum; i++) {
            System.out.printf("element [%d] : ", i);
            arrayNum[i] = sc.nextInt();
        }

        System.out.print("Input the value of inserted : ");
        int valueInsert = sc.nextInt();


        System.out.println("The exist array list is : ");
        for (int i = 0; i < inputNum; i++) {
            System.out.printf("%d ", arrayNum[i]);
        }

        /* Determine the position where the new value will be insert.*/

        for (int i = 0; i < inputNum; i++) {
            if (valueInsert < arrayNum[i]) {
                position = i;
                break;
            }
        }
        /* move all data at right side of the array */
        for (int i = inputNum; i >= position; i--) {
            arrayNum[i] = arrayNum[i - 1];
        }
        /*insert value of the proper position*/
        arrayNum[position] = valueInsert;

        /*-----------ascending order use to bubble sort-----------*/
        /**
         * need outer loop for - iteration.
         * if element 5 - then iteration n - 1.
         * inner loop for checking - comparison.
         * after comparison no need for last data.. #inputNum - 1 - i;
         */
        for (int i = 0; i < inputNum - 1; i++) {
            for (int j = 0; j < inputNum - 1 - i; j++) {
                if (arrayNum[j] > arrayNum[j + 1]) {
                    temp = arrayNum[j];
                    arrayNum[j] = arrayNum[j + 1];
                    arrayNum[j + 1] = temp;
                }
            }

        }


        /*----------after insert list------------*/
        System.out.println("\nAfter insert list is: ");
        for (int i = 0; i < inputNum + 1; i++) {
            System.out.print(arrayNum[i] + " ");
        }


    }
}

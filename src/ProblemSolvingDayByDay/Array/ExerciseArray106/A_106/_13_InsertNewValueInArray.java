package ProblemSolvingDayByDay.Array.ExerciseArray106.A_106;

import java.util.Scanner;

public class _13_InsertNewValueInArray {
    public static void main(String[] args) {
        /**
         * Insert new value in the array problem - 13
         */
        int[] arrayNum = new int[50];
        int inputNum, position = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of array : ");
        inputNum = sc.nextInt();
        System.out.printf("Input %d elements array ascending order: \n", inputNum);

        /*------input the array---------*/
        for (int i = 0; i < inputNum; i++) {
            System.out.printf("Element [%d] : ", i);
            arrayNum[i] = sc.nextInt();
        }

        System.out.print("Input the value to be inserted : ");
        int value = sc.nextInt();

        System.out.println("\nThe exist array list is : ");
        for (int i = 0; i < inputNum; i++) {
            System.out.printf("%d ", arrayNum[i]);
        }

        // position where the value insert...
        for (int i = 0; i < inputNum; i++) {
            if (value < arrayNum[i]) {
                // 8<5-f,   8<7-f,   8<9-t;
                // 0    ,       1,      2 ,
                position = i;
                break;
            }
        }


        /* move all data at right side of the array */
        for (int i = inputNum; i >= position; i--) {
            arrayNum[i] = arrayNum[i - 1];
        }
        arrayNum[position] = value;

        System.out.println("\nAfter Insert the list is :");
        for (int i = 0; i < inputNum + 1; i++) {
            System.out.printf("%d ", arrayNum[i]);
        }

    }
}


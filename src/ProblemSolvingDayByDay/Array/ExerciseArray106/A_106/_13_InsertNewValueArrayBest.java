package ProblemSolvingDayByDay.Array.ExerciseArray106.A_106;

import java.util.Scanner;

public class _13_InsertNewValueArrayBest {
    public static void main(String[] args) {
        /**
         * Insert new value in the array problem - 13
         */
        int[] arrayNum = new int[10];
        int i, j, inputNum, insertValue, position = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of array : ");
        inputNum = sc.nextInt();
        System.out.printf("Input %d elements in the array in ascending order : \n", inputNum);

        /*---------input array from user------*/
        for (i = 0; i < inputNum; i++) {
            System.out.printf("element [%d] : ", i);
            arrayNum[i] = sc.nextInt();
        }
        System.out.print("Input the value to be inserted : ");
        insertValue = sc.nextInt();


        System.out.println("The exist array list is : ");
        for (i = 0; i < inputNum; i++) {
            System.out.printf("%d ", arrayNum[i]);
        }

        /*-------insert value----------*/
        for (i = 0; i < inputNum; i++) {
            if (insertValue < arrayNum[i]) {
                position = i;
                break;
            }
        }

        // i index include for p.
        for (i = inputNum; i >= position; i--) {
            arrayNum[i] = arrayNum[i - 1];
        }
        // index : p =  2
        // insert value element : arrayNum[p] = 8;
        // 2 7 9.
        // 2 7 8 9.
        arrayNum[position] = insertValue;

        System.out.println("\nAfter Insert the list is : ");
        for (i = 0; i < inputNum + 1; i++) {
            System.out.printf("%d ", arrayNum[i]);
        }
    }
}

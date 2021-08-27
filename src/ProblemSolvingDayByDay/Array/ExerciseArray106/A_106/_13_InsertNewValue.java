package ProblemSolvingDayByDay.Array.ExerciseArray106.A_106;

import java.util.Scanner;

public class _13_InsertNewValue {
    public static void main(String[] args) {
        int[] array = new int[10];
        int inputNum, i, pos, value;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array elements : ");
        inputNum = sc.nextInt();

        /*--------array input-----------*/
        for (i = 0; i < inputNum; i++) {
            System.out.printf("element [%d] : ", i);
            array[i] = sc.nextInt();
        }

        System.out.println("\nEnter array are print : ");
        for (i = 0; i < inputNum; i++) {
            System.out.printf("%d ", array[i]);
        }

        /*-------position and value----------*/
        System.out.println("\nEnter your input pos : ");
        pos = sc.nextInt();
        System.out.println("Enter your input value : ");
        value = sc.nextInt();

        /*----------insert in array-----------------*/
        /**
         * we are starting to index - 0
         * Elements of 5 then when a loop run element - 1 .
         * when a position select then position - 1;
         */
        for (i = inputNum - 1; i >= pos - 1; i--) {
            /**
             * if the 3 index is store to 4 index then index num 3 is empty.
             */
            array[i + 1] = array[i];
        }
        array[pos] = value;

        for (i = 0; i < inputNum + 1; i++) {
            System.out.printf("%d ", array[i]);
        }

    }
}

package ProblemSolvingDayByDay.Array.ExerciseArray106.A_106;

import java.util.Scanner;

/**
 * frequency problem solving  - 08
 */

public class _8_FrequencyElement {
    public static void main(String[] args) {
        int inputNum, i, j, count = 0;
        int[] array1 = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.print("Input of elements to stored  array : ");
        inputNum = sc.nextInt();
        System.out.printf("Input %d elements in the array : \n", inputNum);

        for (i = 0; i < inputNum; i++) {
            System.out.printf("element - %d : ", i);
            array1[i] = sc.nextInt();
        }

        /**
         *  I face the problem here....
         */
        System.out.println("The frequency of all elements of an array : ");
        for (i = 0; i < inputNum; i++) {
            for (j = i + 1; j < inputNum; j++) {
                if (array1[i] == array1[j]) {
                    count++;
                }
            }
        }
        if (count != 0) {
            System.out.printf("%d occurs %d times\n", array1[i], count);
        }
    }
}

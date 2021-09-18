package ProblemSolvingDayByDay.Array.ExerciseArray106.A_106;

import java.util.Scanner;

/**
 * frequency problem solving  - 08
 */

public class _8_FrequencyElement {
    public static void main(String[] args) {
        int inputNum, i, j, count;
        int[] array1 = new int[50];
        int[] frequency = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.print("Input of elements to stored  array : ");
        inputNum = sc.nextInt();
        System.out.printf("Input %d elements in the array : \n", inputNum);

        for (i = 0; i < inputNum; i++) {
            System.out.printf("element - [%d] : ", i);
            array1[i] = sc.nextInt();
            frequency[i] = -1;
        }

        /**
         * frequency logical part here...
         */
        for (i = 0; i < inputNum; i++) {
            count = 1;
            for (j = i + 1; j < inputNum; j++) {
                if (array1[i] == array1[j]) {
                    count++;
                    frequency[j] = 0;
                }
            }
            if (frequency[i] != 0) {
                frequency[i] = count;
            }
        }

        for (i = 0; i < inputNum; i++) {
            if (frequency[i] != 0){
                System.out.printf("%d occurs %d times\n", array1[i], frequency[i]);
            }
        }
    }
}

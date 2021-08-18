package ProblemSolvingDayByDay.Array.ExerciseArray106;

import java.util.Scanner;

public class FrequencyElements {
    /**
     * Find the frequency of each element in the array
     */
    public static void main(String[] args) {
        int[] arrayNum = new int[50];
        int[] frequency = new int[50];
        int inputNum, i, j, count = 1;

        System.out.print("Enter the input num : ");
        Scanner sc = new Scanner(System.in);
        inputNum = sc.nextInt();
        System.out.printf("input %d elements in the arrayNum : \n", inputNum);

        for (i = 0; i < inputNum; i++) {
            System.out.printf("Element %d : ", i);
            arrayNum[i] = sc.nextInt();
            frequency[i] = -1;
        }

        /*-----------------array frequency------------------*/
        for (i = 0; i < inputNum - 1; i++) {
            for (j = i + 1; j < inputNum - 1; j++) {
                if (arrayNum[i] == arrayNum[j]) {
                    count++;
                    frequency[j] = 0;
                }
            }
            if (frequency[i] != 0) {
                frequency[i] = count;
            }
        }

        /*--------------frequency are print.-----------*/
        for (i = 0; i < inputNum; i++) {
            if (frequency[i] != 0) {
                System.out.printf("%d occurs %d times \n", arrayNum[i], frequency[i]);
            }
        }
    }
}

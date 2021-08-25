package ProblemSolvingDayByDay.Array.ExerciseArray106.A_106;

import java.util.Scanner;

public class _9_MaxAndMin {
    public static void main(String[] args) {
        /**
         * Maximum and minimum element of array...:)
         */
        int i, testNum, max = 0, min = 0;
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array : ");
        testNum = sc.nextInt();
        System.out.printf("Input %d elements in the array : \n", testNum);


        /*-------------- array test input -------------*/
        for (i = 0; i < testNum; i++) {
            System.out.printf("element [%d] - ", i);
            array[i] = sc.nextInt();
        }

        /*------------- array max value ---------*/
        max = array[0];
        for (i = 0; i < testNum; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Maximum value : " + max);

        /*------------- array Min value ---------*/
        min = array[0];
        for (i = 0; i < testNum; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Minimum value : " + min);
    }
}

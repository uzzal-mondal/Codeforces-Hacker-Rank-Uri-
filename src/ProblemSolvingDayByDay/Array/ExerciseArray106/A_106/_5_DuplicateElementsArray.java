package ProblemSolvingDayByDay.Array.ExerciseArray106.A_106;

import java.util.Scanner;

/**
 * C to count a total number of duplicate elements in an array.
 */

public class _5_DuplicateElementsArray {
    public static void main(String[] args) {

        int[] numOfArray = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements input store : ");
        int num = sc.nextInt();

        //elements are input...
        System.out.println("Enter elements array input : ");
        for (int i = 0; i < num; i++) {
            System.out.printf("Elements [%d] : ", i);
            numOfArray[i] = sc.nextInt();
        }

        //elements print...
        System.out.println("\nEnter elements are print");
        for (int i = 0; i < num; i++) {
            System.out.printf("%d ", numOfArray[i]);
        }

        /*todo: duplicate elements in array*/
        /**
         *  System.out.println("\nDuplicate elements in array : ");
         */

        System.out.println("\nTotal number of duplicate elements found in array : ");
        int count = 0;
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                if (numOfArray[i] == numOfArray[j]) {
                    System.out.printf("%d ", numOfArray[j]);
                    count++;
                }
            }
        }
        System.out.println("\nTotal count of duplicate elements : "+count);
    }
}

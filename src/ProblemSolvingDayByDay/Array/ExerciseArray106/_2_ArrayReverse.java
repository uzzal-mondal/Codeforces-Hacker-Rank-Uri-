package ProblemSolvingDayByDay.Array.ExerciseArray106;

import java.util.Scanner;

public class _2_ArrayReverse {
    public static void main(String[] args) {
        int inputNum;
        int[] arrayOfNum = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your user input number : ");
        inputNum = sc.nextInt();

        //user elements of input array
        System.out.println("Enter you elements : ");
        for (int i = 0; i < inputNum; i++) {
            System.out.printf("Elements of [%d] : ", i);
            arrayOfNum[i] = sc.nextInt();

        }

        //Array in print
        System.out.println("Enter array print : ");
        for (int i = 0; i < inputNum; i++) {
            System.out.printf("%d ", arrayOfNum[i]);
        }

        // array are reverse print..
        System.out.println("\nEnter array are reverse : ");
        for (int i = inputNum - 1; i >= 0; i--) {
            System.out.printf("%d ", arrayOfNum[i]);
        }
    }
}

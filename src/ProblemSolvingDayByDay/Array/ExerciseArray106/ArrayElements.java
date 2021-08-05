package ProblemSolvingDayByDay.Array.ExerciseArray106;

import java.util.Scanner;

public class ArrayElements {
    public static void main(String[] args) {
        int[] numOfArray = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input : ");
        int num = sc.nextInt();

        System.out.println("Array elements are input print : ");
        for (int i = 0; i < num; i++) {
            System.out.printf("Array elements[%d] : ", i);
            numOfArray[i] = sc.nextInt();
        }

        for (int i = 0; i < num; i++) {
            System.out.printf("Elements : %d Value : %d\n", i, numOfArray[i]);
        }
    }
}

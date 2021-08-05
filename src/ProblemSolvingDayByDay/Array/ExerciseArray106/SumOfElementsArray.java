package ProblemSolvingDayByDay.Array.ExerciseArray106;

import java.util.Scanner;

public class SumOfElementsArray {
    public static void main(String[] args) {

        int inputNum, sum = 0;
        int[] numOfArray = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input : ");
        inputNum = sc.nextInt();

        // input of array elements.
        System.out.println("Enter array input : ");
        for (int i = 0; i < inputNum; i++) {
            System.out.printf("[%d] : ", i);
            numOfArray[i] = sc.nextInt();
        }

        // array elements print.
        System.out.println("Enter array print : ");
        for (int i = 0; i < inputNum; i++) {
            System.out.printf("%d ", numOfArray[i]);
            sum = sum + numOfArray[i];
        }

        System.out.println("\nSum of elements of array : " + sum);


    }
}

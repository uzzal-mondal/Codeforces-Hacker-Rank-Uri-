package ProblemSolvingDayByDay.Array.ExerciseArray106.A_106;

import java.util.Scanner;

public class _11_AscendingOrder {
    public static void main(String[] args) {
        int[] arrayNum = new int[50];
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of array : ");
        int inputNum = sc.nextInt();
        System.out.printf("Input %d elements in the array : \n", inputNum);

        /*------------input elements----------*/
        for (int i = 0; i < inputNum; i++) {
            System.out.printf("element [%d] : ", i);
            arrayNum[i] = sc.nextInt();
        }

        /*---------Ascending order----------*/
        System.out.println("Array Ascending order : ");
        for (int i = 0; i < inputNum; i++) {
            for (int j = i + 1; j < inputNum; j++) {
                if (arrayNum[i] > arrayNum[j]) {
                    temp = arrayNum[i];
                    arrayNum[i] = arrayNum[j];
                    arrayNum[j] = temp;
                }
            }
        }

        for (int i = 0; i < inputNum; i++) {
            System.out.printf("%d ", arrayNum[i]);
        }
    }
}

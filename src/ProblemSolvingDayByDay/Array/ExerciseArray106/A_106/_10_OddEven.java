package ProblemSolvingDayByDay.Array.ExerciseArray106.A_106;

import java.util.Scanner;

public class _10_OddEven {
    public static void main(String[] args) {

        int[] arrayNum = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array : ");
        int inputNum = sc.nextInt();
        System.out.printf("Input %d elements in the array : \n", inputNum);

        /*-----------input all elements------------*/
        for (int i = 0; i < inputNum; i++) {
            System.out.printf("element [%d] : ", i);
            arrayNum[i] = sc.nextInt();
        }

        /*-----------even with odd elements------------*/
        System.out.println("Even elements are : ");
        for (int i = 0; i < inputNum; i++) {
            if (arrayNum[i] % 2 == 0) {
                System.out.printf("%d ", arrayNum[i]);
            }
        }
        System.out.println("\nOdd elements are : ");
        for (int i = 0; i < inputNum; i++) {
            if (arrayNum[i] % 2 != 0) {
                System.out.printf("%d ", arrayNum[i]);
            }
        }

    }
}

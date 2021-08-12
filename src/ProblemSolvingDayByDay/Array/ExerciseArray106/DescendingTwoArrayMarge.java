package ProblemSolvingDayByDay.Array.ExerciseArray106;

import java.util.Scanner;

public class DescendingTwoArrayMarge {
    public static void main(String[] args) {
        int[] arrayOne = new int[10];
        int[] arrayTwo = new int[10];
        // int[] arrayThree = new int[10];
        int p, q, k = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the first array : ");
        int n = sc.nextInt();

        System.out.printf("Input %d elements first array : \n", n);
        /*--------------input the first array-----------------*/
        for (int i = 0; i < n; i++) {
            System.out.printf("element - %d : ", i);
            arrayOne[i] = sc.nextInt();
        }

        /*------------------input the second array-------------*/
        System.out.println("Input the number of elements to be stored in the second array : " + n);
        System.out.printf("Input %d elements second array : \n", n);
        for (int i = 0; i < n; i++) {
            System.out.printf("element - %d : ", i);
            arrayTwo[i] = sc.nextInt();
        }


        //find out the length;
        int n1 = arrayOne.length;
        int n2 = arrayTwo.length;
        int[] arrayThree = new int[n1 + n2];

        /*------------- input the array marge---------------*/
        System.out.println("Array are marge : ");
        for (int i = 0; i < n; i++) {
            arrayThree[i] = arrayOne[i] + arrayTwo[i];
            System.out.printf("%d ", arrayThree[i]);
        }
    }
}

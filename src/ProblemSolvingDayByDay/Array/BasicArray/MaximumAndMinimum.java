package ProblemSolvingDayByDay.Array.BasicArray;

import java.util.Scanner;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        int n;
        int[] arrayOfNum = new int[5];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Enter your input number : " + n);


        for (int i = 0; i < n; i++) {
            arrayOfNum[i] = sc.nextInt();
            System.out.printf("%d - %d\n", i, arrayOfNum[i]);
        }


        int max = arrayOfNum[0];
        for (int i = 0; i < n; i++) {
            if (arrayOfNum[i] > max) {
                max = arrayOfNum[i];
            }
        }
        System.out.printf("Maximum num %d\n", max);


        int min = arrayOfNum[0];
        for (int i = 0; i < n; i++) {
            if (arrayOfNum[i] < min) {
                min = arrayOfNum[i];
            }
        }
        System.out.println("Minimum number are : " + min);


    }
}

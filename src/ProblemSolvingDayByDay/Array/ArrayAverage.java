package ProblemSolvingDayByDay.Array;

import java.util.Scanner;

public class ArrayAverage {
    // 100 students sum with average.
    public static void main(String[] args) {
        int[] num = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the elements you want to store : " + n);
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("All your array dada-");
        for (int i = 0; i < n; i++) {
            System.out.println(num[i]);
            sum = sum + num[i];
        }
        System.out.println("sum: " + sum);
        System.out.println("Avg: " + sum / num.length);

    }
}

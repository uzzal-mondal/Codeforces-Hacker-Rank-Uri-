package ProblemSolvingDayByDay.Array.BasicArray;

import java.util.Scanner;

public class ArrayFibonacci {
    public static void main(String[] args) {

        int[] arrayNum = new int[10];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter your data: " + n);

        arrayNum[0] = 0;
        arrayNum[1] = 1;
        for (int i = 2; i < n; i++) {
            arrayNum[i] = arrayNum[i - 1] + arrayNum[i - 2];
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arrayNum[i]);
        }


       /* int fNum = 0, sNum = 1, res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your data:");
        int n = sc.nextInt();

        System.out.printf("%d\n%d\n", fNum, sNum);
        for (int i = 0; i < n; i++) {
            res = fNum + sNum;
            fNum = sNum;
            sNum = res;
            System.out.println(res);
        }*/
    }
}

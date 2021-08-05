package ProblemSolvingDayByDay.Array.BasicArray;

import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args) {
        //copy all elements of an array to another array...
        // akti array er value onno akti array te copy kora.
        int[] arrayNumOne = new int[10];
        int[] arrayNumTwo = new int[10];
        System.out.println("Enter your data : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("your Input data  : " + n);

        // this array are input
        for (int i = 0; i < n; i++) {
            arrayNumOne[i] = sc.nextInt();
            System.out.printf("index %d - elements %d\n", i, arrayNumOne[i]);
        }

        //this array are copy two include the array two..
        for (int i = 0; i < n; i++) {
            arrayNumTwo[i] = arrayNumOne[i];
        }

        //array two are print.
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.printf("index %d - copy array value %d:\n", i, arrayNumTwo[i]);
        }

    }
}

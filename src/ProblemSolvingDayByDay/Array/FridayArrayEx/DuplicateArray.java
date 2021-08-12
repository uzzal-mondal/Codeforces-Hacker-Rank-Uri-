package ProblemSolvingDayByDay.Array.FridayArrayEx;

import java.util.Scanner;

public class DuplicateArray {
    public static void main(String[] args) {
        /*--------Duplicate values are print------------*/
        int[] arrayNum = new int[100];
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements store array : ");
        int testNum = sc.nextInt();
        System.out.printf("Input %d elements in array\n", testNum);


        /*---------elements are user input------------*/
        for (i = 0; i < testNum; i++) {
            System.out.printf("elements %d : ", i);
            arrayNum[i] = sc.nextInt();
        }


        /*------elements are print---*/
        System.out.println("\nElements are print : ");
        for (i = 0; i < testNum; i++) {
            System.out.printf("element - %d : %d\n", i, arrayNum[i]);
        }


        /*----------duplicate elements are print--------*/
        //System.out.println("duplicate  elements are print : ");
        int count = 0;
        for (i = 0; i < testNum; i++) {
            for (j = i + 1; j < testNum; j++) {
                if (arrayNum[i] == arrayNum[j]) {
                    count++;
                    //System.out.println("Total duplicate elements found in array : " + arrayNum[j]);
                }
            }
        }
        System.out.println("Total duplicate elements found in array : " + count);
    }
}

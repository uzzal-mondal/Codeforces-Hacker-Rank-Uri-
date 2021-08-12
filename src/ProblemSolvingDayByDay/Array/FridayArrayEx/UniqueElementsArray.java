package ProblemSolvingDayByDay.Array.FridayArrayEx;

import java.util.Scanner;

public class UniqueElementsArray {
    public static void main(String[] args) {
        int[] arrayNum = new int[10];
        int count, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number elements store  : ");
        int testNum = sc.nextInt();

        /*----------- array elements input ------------*/
        System.out.printf("Input %d elements in the array\n", testNum);
        for (i = 0; i < testNum; i++) {
            System.out.printf("elements [%d] : ", i);
            arrayNum[i] = sc.nextInt();
        }

        /*----------- array elements print ------------*/
        System.out.println("Array elements are print : ");
        for (i = 0; i < testNum; i++) {
            System.out.printf("element- %d : %d\n", i, arrayNum[i]);
        }

        /*----------- array elements unique ------------*/
        System.out.println("Array unique elements are print : ");
        for (i = 0; i < testNum; i++) {
            count = 0;
            for (j = 0; j < testNum; j++) {
                if (i != j) {
                    System.out.printf("i: %d - j: %d\n", i, j);
                    if (arrayNum[i] == arrayNum[j]) {
                        count++;
                    }
                }
            }
            if (count == 0) {
                System.out.printf("Unique elements find array : %d", arrayNum[i]);
            }
            System.out.println();
        }

    }
}

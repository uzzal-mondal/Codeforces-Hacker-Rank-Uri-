package ProblemSolvingDayByDay.function.DeleteElementArray;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arrayNum = new int[10];
        int testNum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of array : ");
        testNum = sc.nextInt();
        System.out.printf("Input %d elements of the array ascending order :\n", testNum);

        /**
         * input the elements from user...
         */
        for (int i = 0; i < testNum; i++) {
            System.out.printf("elements [%d] ", i);
            arrayNum[i] = sc.nextInt();
        }
        DeleteElementArray del = new DeleteElementArray();
        del.showTestArrayPrint(arrayNum, testNum);
        System.out.println("\nwhich position do you want to delete : ");
        int position = sc.nextInt();
        del.showDeleteElement(arrayNum, testNum, position);
    }
}

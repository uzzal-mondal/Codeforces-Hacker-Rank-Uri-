package ProblemSolvingDayByDay.DataStructure.BinarySearch;

import java.util.Scanner;

public class BinarySearchMain {
    public static void main(String[] args) {
        /**
         * Binary search algo.
         * must need to sorted.
         * conclude divide.
         */
        int[] arrayNum = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input data : ");
        int testNum = sc.nextInt();
        System.out.println("Enter your search data : ");
        int searchData = sc.nextInt();

        /**
         * array input the number,...
         */
        for (int i = 0; i < testNum; i++) {
            System.out.printf("Element [%d] : ", i);
            arrayNum[i] = sc.nextInt();
        }

        BinarySearch binarySearch = new BinarySearch();
        int res = binarySearch.showBinarySearch(arrayNum, testNum, searchData);
        if (res == -1) {
            System.out.println("Element not present ");
        } else {
            System.out.println("Element found at index: " + res + " search data : " + searchData);
        }


    }

}

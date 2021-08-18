package ProblemSolvingDayByDay.DataStructure;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        /**
         * linear search ... programming...
         */
        int[] arrayNum = new int[10];
        int i, found = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input data : ");
        int inputNum = sc.nextInt();
        System.out.printf("input %d elements in the arrayNum : \n", inputNum);

        for (i = 0; i < inputNum; i++) {
            System.out.printf("element %d : ", i);
            arrayNum[i] = sc.nextInt();
        }
        System.out.print("Enter your Searching data : ");
        int searchNum = sc.nextInt();
        for (i = 0; i < inputNum; i++) {
            if (arrayNum[i] == searchNum) {
                found++;
                break;
            }
        }

        if (found != 0) {
            System.out.println("data is found : " + searchNum + "\nposition of index : " + i);

        } else {
            System.out.println("Data is not found : " + searchNum + "\nposition of index : " + i);
        }

    }
}

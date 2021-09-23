package DolarArray106.D_22_SecondLargest;

import java.util.Scanner;

/**
 * Second largest num...
 * https://www.javatpoint.com/java-program-to-find-second-largest-number-in-an-array
 */

public class SecondLargestMain {
    public static void main(String[] args) {
        int[] arrayNum = new int[50];
        System.out.print("Test data : ");
        Scanner sc = new Scanner(System.in);
        int testInput = sc.nextInt();

        for (int i = 0; i < testInput; i++) {
            System.out.printf("element [%d] : ", i);
            arrayNum[i] = sc.nextInt();
        }

        for (int i = 0; i < testInput; i++) {
            System.out.printf(" %d ", arrayNum[i]);
        }

        // second largest number find..
        System.out.print("\nSecond largest number :");
        SecondLargest sl = new SecondLargest();
        int secondLargest = sl.showSecondLargest(arrayNum, testInput);
        System.out.printf(" %d ", secondLargest);
        System.out.print("\nlargest number.");
        int largest = sl.showLargest(arrayNum, testInput);
        System.out.printf(" %d ", largest);

    }
}

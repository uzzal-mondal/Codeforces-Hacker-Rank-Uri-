package ProblemSolvingDayByDay.Array.ExerciseArray106.A_106;

import java.util.Scanner;

/**
 * C to copy the elements of one array into another array
 */

public class _4_CopyElements {
    public static void main(String[] args) {
        //todo: copy elements to another array..:)
        int[] numOfArray = new int[10];
        int[] copyOfArray = new int[10];
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input elements store : ");
        num = sc.nextInt();

        System.out.println("First elements array input : ");
        for (int i = 0; i < num; i++) {
            System.out.printf("elements [%d] : ", i);
            numOfArray[i] = sc.nextInt();
        }

        System.out.println("First elements array Print : ");
        for (int i = 0; i < num; i++) {
            System.out.printf("%d ", numOfArray[i]);
        }

        // System.out.println("Second elements store Copy of Array first elements :");
        for (int i = 0; i < num; i++) {
            copyOfArray[i] = numOfArray[i];
        }

        System.out.println("\nFirst elements to Second elements Copy Array :");
        for (int i = 0; i < num; i++) {
            System.out.printf("%d ", copyOfArray[i]);
        }
    }
}

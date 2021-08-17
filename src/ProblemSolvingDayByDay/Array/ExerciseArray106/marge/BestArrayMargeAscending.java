package ProblemSolvingDayByDay.Array.ExerciseArray106.marge;

import java.util.Scanner;

public class BestArrayMargeAscending {
    public static void main(String[] args) {
        int[] array1 = new int[50];
        int[] array2 = new int[50];
        int[] arrayMarge = new int[50];
        int i, j, k, temp;

        System.out.print("Enter elements in size One : ");
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();

        /*----------------array one input-----------------*/
        System.out.println("Array One input : ");
        for (i = 0; i < size1; i++) {
            array1[i] = sc.nextInt();
            arrayMarge[i] = array1[i];
        }
        k = i;
        System.out.println("first K elements: " + k);

        System.out.print("Enter elements in size Two : ");
        int size2 = sc.nextInt();

        /*----------------array second input-----------------*/
        System.out.println("Array Second input : ");
        for (i = 0; i < size2; i++) {
            array2[i] = sc.nextInt();
            arrayMarge[k] = array2[i];
            k++;
        }
        System.out.println("second k elements:  = " + k);

        /*-------------array arrange -------------*/
        for (j = 0; j < k - 1; j++) {
            for (i = 0; i < k - 1; i++) {
                System.out.printf("index [%d] : %d\n", i, arrayMarge[i]);
                if (arrayMarge[i] > arrayMarge[i + 1]) {
                    temp = arrayMarge[i];
                    arrayMarge[i] = arrayMarge[i + 1];
                    arrayMarge[i + 1] = temp;
                }
            }
        }

        System.out.println("\nArray ascending marge: ");
        for (i = 0; i < k; i++) {
            System.out.printf("%d ", arrayMarge[i]);
        }
    }
}

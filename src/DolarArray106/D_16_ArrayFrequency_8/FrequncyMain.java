package DolarArray106.D_16_ArrayFrequency_8;


import java.util.Scanner;

/**
 * C to count the frequency of each element of an array
 * https://www.geeksforgeeks.org/counting-frequencies-of-array-elements/
 */
public class FrequncyMain {
    public static void main(String[] args) {
        int[] arrayNum = new int[10];
        int[] freeQuency = new int[10];
        int count, i, j;
        System.out.println("Test data :");
        Scanner sc = new Scanner(System.in);
        int testNum = sc.nextInt();
        System.out.println("Input the number of elements to be stored in the array : " + testNum);

        /**
         * user input...
         */
        for (i = 0; i < testNum; i++) {
            System.out.printf("elements [%d] : ", i);
            arrayNum[i] = sc.nextInt();
            freeQuency[i] = -1;
        }

       /* Frequency f = new Frequency();
        f.countFreeQuency(arrayNum, testNum);*/

        for (i = 0; i < testNum; i++) {
            count = 1;
            for (j = i + 1; j < testNum; j++) {
                if (arrayNum[i] == arrayNum[j]) {
                    count++;
                    freeQuency[j] = 0;
                }
            }
            if (freeQuency[i] != 0) {
                freeQuency[i] = count;
            }
        }

        System.out.println("The frequency of all elements of array : ");
        for (i = 0; i < testNum; i++) {
            if (freeQuency[i] != 0) {
                System.out.printf("%d occurs %d times\n", arrayNum[i], freeQuency[i]);
            }
        }

    }
}

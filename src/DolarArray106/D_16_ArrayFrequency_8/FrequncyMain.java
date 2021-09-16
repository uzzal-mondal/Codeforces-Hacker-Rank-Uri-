package DolarArray106.D_16_ArrayFrequency_8;


import java.util.Scanner;

/**
 * C to count the frequency of each element of an array
 */
public class FrequncyMain {
    public static void main(String[] args) {
        int[] arrayNum = new int[10];
        int[] freeQuency = new int[10];
        int count = 0, i;
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
            freeQuency[i] = arrayNum[i];
        }

        /**
         * frequency...
         */
        for (i = 0; i < testNum; i++) {
            //System.out.printf("%d ", arrayNum[i]);
            if (arrayNum[i] == freeQuency[i]) {
                count++;
            }
            if (count != 0) {
                System.out.printf("%d occurs %d times\n", freeQuency[i], count);
            }
            count = 0;
        }

    }
}

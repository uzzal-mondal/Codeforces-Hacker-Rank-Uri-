package DolarArray106.D_16_ArrayFrequency_8;


import java.util.Scanner;

/**
 * C to count the frequency of each element of an array
 * https://www.w3resource.com/c-programming-exercises/array/c-array-exercise-8.php
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
            freeQuency[i] = -1; // -1
           // System.out.printf("FQ : %d \n", freeQuency[i]);
        }

       /* Frequency f = new Frequency();
        f.countFreeQuency(arrayNum, testNum);*/

        for (i = 0; i < testNum; i++) {
            count = 1;
            for (j = i + 1; j < testNum; j++) {
                if (arrayNum[i] == arrayNum[j]) {
                    count++;
                    freeQuency[j] = 0;
                    //System.out.printf("fq %d : \n",freeQuency[j]);
                }
            }
            if (freeQuency[i] != 0) {
                freeQuency[i] = count; // f =  2
                //System.out.printf(" f = %d \n",freeQuency[i]);
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

package DolarArray106.D_15_ArrayMargeSorted_7_Best;

import java.util.Scanner;

/**
 * Array marge important program...
 */
public class ArrayMargeBestThinkingBest {
    public static void main(String[] args) {

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] arrayMarge = new int[10];
        int i, k, size1, size2;
        Scanner sc = new Scanner(System.in);
        System.out.println("First user  data  : ");
        size1 = sc.nextInt();
        System.out.printf("Input %d elements in the first array\n", size1);

        //use input size1
        for (i = 0; i < size1; i++) {
            System.out.printf("i = %d , ", i);
            System.out.printf("elements [%d] : ", i);
            array1[i] = sc.nextInt();
            // like as array copy from array[i] put in array marge.
            arrayMarge[i] = array1[i];


        }
        k = i; // 0 , 1 , 2  total = 3 ,  if you input 3
        System.out.printf("k = %d ", k);

        System.out.println("\n\nSecond user data  : ");
        size2 = sc.nextInt();
        System.out.printf("Input %d elements in the second array\n", size2);
        for (i = 0; i < size2; i++) {
            System.out.printf("index : %d , ", i);
            System.out.printf("elements [%d] : ", i);
            array2[i] = sc.nextInt();
            arrayMarge[k] = array2[i]; // input that store that 1 , 2 , 3
            System.out.printf("array marge {%d} , ", arrayMarge[k]);
            k++;// was k = 3 now 4, 5, 6
            System.out.printf("count k : %d , ", k);
        }

        /**
         * logical bubble sort..
         */
        System.out.println();
        DescendingBubbleSort ds = new DescendingBubbleSort();
        ds.showBubbleShort(arrayMarge, k);
        ds.showPrintArray(arrayMarge, k);
    }
}


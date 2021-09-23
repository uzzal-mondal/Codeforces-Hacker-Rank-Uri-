package DolarArray106.D_21_DeleteElement_15;

import java.util.Scanner;

/**
 * https://www.youtube.com/watch?v=uemAVFC_4bw&t=282s
 * Delete element in an array...
 */

public class DeleteElementMain {
    public static void main(String[] args) {

        int[] arrayNum = new int[20];
        System.out.println("Test data : ");
        Scanner sc = new Scanner(System.in);
        int sizeInput = sc.nextInt();
        System.out.printf("Input %d elements array ascending order \n", sizeInput);

        /*
         * using loop from user input..
         */
        for (int i = 0; i < sizeInput; i++) {
            System.out.printf("element [%d] : ", i);
            arrayNum[i] = sc.nextInt();
        }

        System.out.print("In the position where to delete : ");
        int delPos = sc.nextInt();
        // System.out.printf(" %d \n", delPos);

        DeleteElement del = new DeleteElement();
        del.showDeleteElement(arrayNum, sizeInput, delPos);


        /*
         * delete position in an array..
         * delPos - 1 , when will position the delete ,
         * then before the number [d + 1] fill up to the position means [d]...
         * d is our position..
         -------------------------------------
         *  element start - 8, index of - 9.
         *  so, last element is (size - 1.)
         *  also, last element is (fill - 0) so, i am using (size - 2).
         */
       /* for (int d = delPos - 1; d <= sizeInput - 2; d++) {
            arrayNum[d] = arrayNum[d + 1];
        }

        arrayNum[sizeInput - 1] = 0;

        *//*
         * array are print..
         *//*
        for (int i = 0; i < sizeInput - 1; i++) {
            System.out.printf("%d ", arrayNum[i]);
        }*/
    }
}

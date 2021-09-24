package DolarArray106.D_23_SecondSmallElement_17;

import java.util.Scanner;

public class SecondSmallElementMain {
    public static void main(String[] args) {
        int totalNum, i, j, temp;
        int[] arrayNum = new int[20];
        System.out.print("Input the size of array : ");
        Scanner sc = new Scanner(System.in);
        totalNum = sc.nextInt();


        for (i = 0; i < totalNum; i++) {
            System.out.printf("element [%d] : ", i);
            arrayNum[i] = sc.nextInt();
        }

        /*for (i = 0; i < totalNum; i++) {
            System.out.printf("%d ", arrayNum[i]);
        }*/

        SecondSmallElement s = new SecondSmallElement();
        int res = s.showSmallElement(arrayNum, totalNum);
        System.out.printf("\nSecond small num : %d\n", res);


    }
}

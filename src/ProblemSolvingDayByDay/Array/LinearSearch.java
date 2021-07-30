package ProblemSolvingDayByDay.Array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        // linear search..
        // a little bit data to search use to linear search..
        // find the position with value..
        int[] arrayNum = new int[10];
        int i;
        System.out.println("Enter your input data: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("your data is : " + n);

        // array for input
        for (i = 0; i < n; i++) {
            arrayNum[i] = sc.nextInt();
            System.out.printf("index %d - value %d\n", i, arrayNum[i]);
        }

        // linear search
        System.out.println("Enter your finding array value: ");
        int value = sc.nextInt();
        //array start to 0, so first think data isn't find our array..
        int position = -1;
        for (i = 0; i < n; i++) {
            //System.out.printf("index %d - value %d\n", i, arrayNum[i]);
            if (value == arrayNum[i]) {
                position = i + 1;
            }
        }

        if (position == -1) {
            System.out.println("Not found!");
        } else {
            System.out.printf("Found value %d , position %d\n", value, position);
        }









        /*int[] arrayNum = {10, 12, 15, 18, 20};
        int value = 15;
        //array start to 0, so first think data isn't find our array..
        int position = -1;

        for (int i = 0; i < arrayNum.length; i++) {
            //System.out.println(arrayNum[i]);
            if (value == arrayNum[i]) {
                position = i + 1;
                break;
            }
        }

        if (position == -1) {
            System.out.println("Data not found!");
        } else {
            System.out.printf("value %d position %d \n", value, position);
        }*/

    }
}

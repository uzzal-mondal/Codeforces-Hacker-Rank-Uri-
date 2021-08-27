package ProblemSolvingDayByDay.DataStructure.InsertArrayElement;

import java.util.Scanner;

public class InsertArrayElementMain {
    public static void main(String[] args) {
        int[] array = new int[10];
        int inputNum;
        int value, pos;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your total Array elements num : ");
        inputNum = sc.nextInt();

        /*----- input array elements from user--------*/
        for (int i = 0; i < inputNum; i++) {
            System.out.printf("element [%d] : ", i);
            array[i] = sc.nextInt();
        }
        InsertArrayElement ine = new InsertArrayElement();
        ine.showArrayElement(array, inputNum);
        System.out.println("Enter pos : ");
        pos = sc.nextInt();
        System.out.println("Enter value : ");
        value = sc.nextInt();
        System.out.println("value : " + value + " position : " + pos);
        ine.showInsertArray(array, inputNum, value, pos);
    }
}

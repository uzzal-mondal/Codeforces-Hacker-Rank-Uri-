package ProblemSolvingDayByDay.C.FunctionReverse;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        char[] resultArray = name.toCharArray();

        for (int i = name.length() - 1; i >= 0; --i) {
            System.out.printf("%s ,%d\n", resultArray[i], i);
        }
    }
}

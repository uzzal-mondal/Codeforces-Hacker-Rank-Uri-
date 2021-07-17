package ProblemSolvingDayByDay.C.UserDefinedFunction;

import java.util.Scanner;

public class FunctionOne {
    public static void main(String[] args) {
        int i, j, k, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fast number");
        i = sc.nextInt();
        System.out.println("Enter second number");
        j = sc.nextInt();
        System.out.println("Enter third number");
        k = sc.nextInt();
        sum = sumNum(i, j);
        int div = divNum(i, j);
        int mul = mulNum(i, j, k);
        System.out.println("Sum : " + sum);
        System.out.println("Div : " + div);
        System.out.println("Div : " + mul);
    }

    static int sumNum(int a, int b) {
        return a + b;
    }

    static int divNum(int a, int b) {
        return a / b;
    }

    static int mulNum(int a, int b, int c) {
        return a * b * c;
    }
}

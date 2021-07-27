package ProblemSolvingDayByDay.CodeForces.FridayRevise;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {

        //todo: follow the  java Team..

        int a, b, c, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if (a + b + c >= 2) {
                count++;
            }
        }
        System.out.println(count);
    }
}

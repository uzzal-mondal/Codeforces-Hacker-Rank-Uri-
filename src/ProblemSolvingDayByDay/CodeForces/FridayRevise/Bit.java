package ProblemSolvingDayByDay.CodeForces.FridayRevise;

import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        int n, x = 0;
        char s;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            s = sc.next().charAt(0);
            if (s == '+') {
                x++;
            } else if (s == '-') {
                x--;
            }
        }
        System.out.println(x);
    }
}

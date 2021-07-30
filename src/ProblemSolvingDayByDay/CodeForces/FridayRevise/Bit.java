package ProblemSolvingDayByDay.CodeForces.FridayRevise;

import java.util.Scanner;

/*
 *
 */

public class Bit {
    public static void main(String[] args) {
        int n, x = 0;
        String s;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            s = sc.next();
            if (s.charAt(0) == 'X') {
                if (s.charAt(1) == '+') {
                    x++;
                }
                if (s.charAt(1) == '-') {
                    x--;
                }
            } else if (s.charAt(0) == '+') {
                ++x;
            } else if (s.charAt(1) == '-') {
                --x;
            }
        }
        System.out.println(x);
    }
}

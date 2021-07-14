package ProblemSolvingDayByDay.CodeForces.Java;

import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        int x = 0;
        int n;
        String s;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            s = sc.next();
            // System.out.println(s);
            if (s.charAt(0) == '+' && (s.charAt(1) == '+')) {
                x++;
            } else if (s.charAt(0) == 'X' && (s.charAt(1) == '+')) {
                x++;
            } else if (s.charAt(0) == '-' && (s.charAt(1) == '-')) {
                x--;
            } else if (s.charAt(0) == 'X' && (s.charAt(1) == '-')) {
                x--;
            }

        }
        System.out.println(x);


    }
}

package ProblemSolvingDayByDay.CodeForces.Java;

import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {

        long m, n, a, length, width;
        Scanner sc = new Scanner(System.in);
        m = sc.nextLong();
        n = sc.nextLong();
        a = sc.nextLong();

        length = m / a; // 1
        width = n / a; // 1
       // System.out.println("Length: " + length + " width: " + width);

        if (m % a != 0) {
            ++length;
           // System.out.println(length);
        }

        if (n % a != 0) {
            ++width;
           // System.out.println(width);
        }

        System.out.println(length * width);


    }
}

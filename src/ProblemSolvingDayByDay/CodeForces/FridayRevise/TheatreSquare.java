package ProblemSolvingDayByDay.CodeForces.FridayRevise;

import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        long n, m, a, width, height;
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter width - n : ");
        n = sc.nextLong();
        // System.out.println("Enter height - m :");
        m = sc.nextLong();
        //  System.out.println("Enter flagstone size - a:");
        a = sc.nextLong();

        height = n / a; // 6 / 4 - 1.5
        width = m / a; // 10 / 4 - 2.5

        if (n % a != 0) {
            System.out.println("h: " + height);
            ++height;
            System.out.println("Height : " + height);
        }
        if (m % a != 0) {
            System.out.println("w: " + width);
            ++width;
            System.out.println("width : " + width);
        }

        System.out.println(height * width); // 1.5 * 2.5 = 3.75 = 4.


    }
}

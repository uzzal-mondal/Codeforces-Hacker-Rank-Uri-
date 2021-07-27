package ProblemSolvingDayByDay.CodeForces.Java;

import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {

        long m, n, a, height, width;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width n : ");
        n = sc.nextLong();
        System.out.println("Enter height m : ");
        m = sc.nextLong();
        System.out.println("Enter flagstone a : ");
        a = sc.nextLong();

        width = n / a; // 10 / 4 - 2.5 = 2
        height = m / a; // 6 / 4 - 1.5 = 1
        System.out.println("width: " + width + " height: " + height); // 2 , 1

        if (n % a != 0) { // 10 % 4
            System.out.println("W: " + width);// 2
            ++width; // pre increment next find then increasing , 1: 2
            System.out.println("Width : " + width); // 3 - YES
        }

        if (m % a != 0) { // 6 % 4
            System.out.println("h: " + height); // 1
            ++height; // 1
            System.out.println("height: " + height); // 2 - YES
        }

        System.out.println(height * width); // 6 answer.
    }
}

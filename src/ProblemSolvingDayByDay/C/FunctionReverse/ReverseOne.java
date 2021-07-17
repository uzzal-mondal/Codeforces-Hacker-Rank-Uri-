package ProblemSolvingDayByDay.C.FunctionReverse;

import java.util.Scanner;

public class ReverseOne {
    public static void main(String[] args) {

        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        System.out.println(showReverse(data));
    }

    static String showReverse(String s) {
        String rev = "";
        for (int i = s.length(); i > 0; --i) {
            char ch = s.charAt(i - 1);
            System.out.println(ch);
            rev = rev + ch;
            System.out.println(rev);
        }
        return rev;
    }
}

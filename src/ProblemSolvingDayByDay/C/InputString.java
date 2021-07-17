package ProblemSolvingDayByDay.C;

import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {

        int n, i, j = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("First string input: ");
        char[] str = sc.next().toCharArray();
        System.out.println("Second char input: ");
        char c = sc.next().charAt(0);

        for (i = 0; i < str.length; i++) {
            for (j = 0; j < i - 1; j++) {
                if (str[i] != c) {
                    str[j] = str[i];
                }
            }
        }
        System.out.printf("%c", str[j]);

       /* //n = str.length;
        for (i = 0, j = 0; i < str.length; i++) {
           // System.out.println(str.length);
            if (str[i] != c) {
                str[j] = str[i];
               // System.out.printf("[%c]", str[j]);
                j++;
            }
        }
        System.out.println(str);*/

         /* for (i = 0; i < str.length; i++) {
            for (j = 0; j < i; j++) {
                if (str[i] != c) {
                    str[j] = str[i];
                }
            }
        }*/

    }
}

package ProblemSolvingDayByDay.CodeForces.Java;

import java.util.Scanner;

public class DeleteVowel {
    public static void main(String[] args) {
        String word;
        //todo: a string builder class is changing - mutable..
        // but string is not changing - immutable..
        StringBuilder s2 = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter your word: ");
        word = sc.next();

        String lowerCase = word.toLowerCase();
        char[] charArray = lowerCase.toCharArray();

        for (char c : charArray) {
            // System.out.printf("%d - %c\n", i, charArray[i]);
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'y':
                case 'o':
                case 'u':
                    break;
                default:
                    //notVowel = charArray[i];
                    s2.append('.');
                    s2.append(c);
                    // System.out.printf(".%c", notVowel);
                    break;
            }
        }
        System.out.print(s2);
    }
}




package ProblemSolvingDayByDay.CodeForces.Java;

import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {

        //todo: a string builder class is changing - mutable..
        // but string is not changing - immutable..
        StringBuilder stringBuilder = new StringBuilder();
        String word;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input your word: ");
        word = sc.next();
        //all string lower case.
        String lowerCase = word.toLowerCase();
        // find a char from string..
        char[] charArray = lowerCase.toCharArray();

        //todo: all index with elements are storage c from charArray.
        for (char c : charArray) {
            switch (c) {
                //if the vowel then break..
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                    break;
                default:
                    // don't vowel, show consonant append (.) with c means consonant.
                    stringBuilder.append('.');
                    stringBuilder.append(c);
            }

        }
        System.out.print(stringBuilder);



       /* String s2 = "";
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        //convert lower case.
        String lowerCase = word.toLowerCase();
        //find the single word use to toCharArray..
        char[] c = lowerCase.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u' || c[i] == 'y') {
                continue;
            } else {
                s2 += '.';
                s2 += c[i];
            }
        }
        System.out.print(s2);*/

    }
}

package ProblemSolvingDayByDay.C;

import java.util.Arrays;
import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.next().toCharArray();
        int sNum = str.length;
        System.out.println(removeDuplicateValue(str, sNum));

    }

    static String removeDuplicateValue(char[] str, int stringNum) {
        int index = 0, removeLetter = 0, allLetter = 0, total = 0;
        int i, j;

        for (i = 0; i < stringNum; i++) {
            for (j = 0; j < i; j++) {
                if (str[i] == str[j]) {
                    total++;
                    removeLetter++;
                    break;
                }
            }
            if (j == i) {
                str[index++] = str[i];
                allLetter++;
                str[total++] = str[i];
            }
        }
        System.out.println("Remove same letter: " + removeLetter);
        System.out.println("Show letter: " + allLetter);
        System.out.println("Total: " + total);
        return String.valueOf(Arrays.copyOf(str, index));
        //return removeLetter;

    }
}

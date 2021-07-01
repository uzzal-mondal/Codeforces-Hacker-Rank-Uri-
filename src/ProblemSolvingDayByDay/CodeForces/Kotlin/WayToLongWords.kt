package ProblemSolvingDayByDay.CodeForces.Kotlin

import java.util.*

/**
 * Way to long words A - 2
 * 4
word
localization
internationalization
pneumonoultramicroscopicsilicovolcanoconiosis
outputCopy
word
l10n
i18n
p43s
 */

object WayToLongWords {
    @JvmStatic
    fun main(args: Array<String>) {
        var testNum: Int;
        var words: String;
        var sc = Scanner(System.`in`);
        testNum = sc.nextInt();

        for (i in 0..testNum) {
            words = sc.nextLine()
            if (words.length <= 10) {
                println(words)
            } else {
                var res = words
                firstAndLastChar(res)

            }
        }
    }

    fun firstAndLastChar(str: String) {
        //finding to string length;
        val n = str.length;
        val first = str[0];
        val second = str[n - 1]
        print(first)
        print(n - 2)
        println(second)
    }
}
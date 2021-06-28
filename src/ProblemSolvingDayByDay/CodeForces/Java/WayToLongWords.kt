package ProblemSolvingDayByDay.CodeForces.Java

import java.util.*

object WayToLongWords {
    @JvmStatic
    fun main(args: Array<String>) {
        val testNum: Int
        var words: String
        val sc = Scanner(System.`in`)
        testNum = sc.nextInt()
        for (i in 0..testNum) {
            words = sc.nextLine()
            // System.out.println("Lenght :" + words.length());
            if (words.length <= 10) {
                println(words)
            } else {
                val str = words
                firstAndLastChar(str)
            }
        }
    }

    fun firstAndLastChar(str: String) {
        //finding string length
        val n = str.length
        //first char of a string.
        val first = str[0]
        //second char of a string
        val last = str[n - 1]
        print(first)
        print(n - 2)
        println(last)
    }
}
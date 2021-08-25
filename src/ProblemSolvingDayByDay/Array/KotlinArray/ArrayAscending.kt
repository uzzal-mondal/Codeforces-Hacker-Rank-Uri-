package ProblemSolvingDayByDay.Array.KotlinArray

import java.util.*

fun main(args: Array<String>) {
    var i: Int;
    var j: Int;
    var temp: Int;
    var testNum: Int
    var arrayNumber = IntArray(50)

    var sc = Scanner(System.`in`)
    print("Enter your input data : ")
    testNum = sc.nextInt();
    println("your $testNum input data .")

    /**
     * input array ...
     */
    for (i in 0 until testNum) {
        print("element $i : ")
        arrayNumber[i] = sc.nextInt();
    }

    for (i in 0 until testNum) {
        for (j in i + 1 until testNum) {
            if (arrayNumber[i] > arrayNumber[j]) {
                temp = arrayNumber[i]
                arrayNumber[i] = arrayNumber[j]
                arrayNumber[j] = temp;
            }
        }
    }

    for (i in 0 until testNum) {
        print("${arrayNumber[i]} ")
    }
}
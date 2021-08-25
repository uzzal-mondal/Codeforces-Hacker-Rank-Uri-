package ProblemSolvingDayByDay.Array.KotlinArray

import java.util.*

object MaxAndMin {
    @JvmStatic
    fun main(args: Array<String>) {
        /**
         * Max and Min value find out..
         */
        val arrayNum = IntArray(50)
        println("Enter your input data : ")
        val sc = Scanner(System.`in`)
        val testNum = sc.nextInt()
        for (i in 0 until testNum) {
            System.out.printf("element [%d] - ", i)
            arrayNum[i] = sc.nextInt()
        }
        showMaxMin(arrayNum, testNum)
    }

    fun showMaxMin(arr: IntArray, testNum: Int) {
        var max: Int
        var min: Int
        max = arr[0]
        min = arr[0]
        /**
         * Maximum value
         * Minimum value
         */
        for (i in 0 until testNum) {
            if (arr[i] > max) {
                max = arr[i]
            } else if (arr[i] < min) {
                min = arr[i]
            }
        }
        println("Max : $max")
        println("Min : $min")
    }
}
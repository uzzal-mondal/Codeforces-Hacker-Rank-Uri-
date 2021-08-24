package ProblemSolvingDayByDay.Array.KotlinArray

import java.util.*

object MaxMin {
    @JvmStatic
    fun main(args: Array<String>) {
        /**
         * Maximum and minimum element of array...:)
         */
        var i: Int
        val testNum: Int
        var max = 0
        var min = 0
        val array = IntArray(10)
        val sc = Scanner(System.`in`)
        print("Input the elements stored in array : ")
        testNum = sc.nextInt()

        /**
         * input array
         */
        for (i in 0..testNum) {
            print("index: $i element : ")
            array[i] = sc.nextInt();
        }

        /**
         * Max and min number..
         */
        max = array[0];
        min = array[0];
        for (i in 0..testNum) {
            if (array[i] > max) {
                max = array[i]
            } else if (array[i] < min) {
                min = array[i]
            }
        }
        println("Max : $max")
        println("Min : $min")


    }
}
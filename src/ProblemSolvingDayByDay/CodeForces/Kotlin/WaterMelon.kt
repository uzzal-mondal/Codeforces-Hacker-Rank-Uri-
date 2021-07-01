package ProblemSolvingDayByDay.CodeForces.Kotlin

/**
 * Water melon A - 1
 */
import java.util.*

fun main() {
    var w: Int
    var sc = Scanner(System.`in`)
    w = sc.nextInt()

    when {
        w == 2 -> println("No")
        w % 2 == 0 -> {
            println("Yes")
        }
        else -> {
            println("No")
        }
    }


}
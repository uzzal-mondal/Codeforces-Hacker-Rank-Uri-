package ProblemSolvingDayByDay.CodeForces.Kotlin

import java.util.*

fun main() {
    var testNum: Int
    var fFriend: Int
    var sFriend: Int
    var tFriend: Int
    var res: Int
    var count = 0;
    var sc = Scanner(System.`in`)
    testNum = sc.nextInt();

    for (i in 1..testNum) {
        fFriend = sc.nextInt()
        sFriend = sc.nextInt()
        tFriend = sc.nextInt()

        res = fFriend + sFriend + tFriend
        if (res >= 2) {
            count++
        }
    }
    println(count)
}
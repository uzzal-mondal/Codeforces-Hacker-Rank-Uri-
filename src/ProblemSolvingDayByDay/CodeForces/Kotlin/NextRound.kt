package ProblemSolvingDayByDay.CodeForces.Kotlin

import java.util.*

fun main() {
    val np: Int;
    val kth: Int
    var score: Int
    var minScore: Int = 0
    val sc = Scanner(System.`in`)
    np = sc.nextInt()
    kth = sc.nextInt()
    var dataScore = IntArray(np + 1);

    for (i in 1..np) {
        score = sc.nextInt();
        //print("$score ")
        dataScore[i] = score;
        // print("${dataScore[i]} ")
        if (i == kth) {
            minScore = score
        }
    }

    var count = 0;
    for (i in 1..np) {
        if (dataScore[i] >= minScore && minScore > 0) {
            count++;
        }
    }

    println(count)


}
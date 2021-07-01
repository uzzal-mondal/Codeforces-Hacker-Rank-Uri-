package ProblemSolvingDayByDay.CodeForces.Kotlin

import java.util.*

fun main(args: Array<String>) {

    var m: Long
    var n: Long
    var width: Long;
    var height: Long
    var a: Long;

    var sc = Scanner(System.`in`);
    m = sc.nextLong();
    n = sc.nextLong();
    a = sc.nextLong();

    width = m / a;
    height = n / a;

    if (m % a != null) {
        ++width;
    }

    if (n % a != null) {
        ++height
    }

    println(width * height)


}


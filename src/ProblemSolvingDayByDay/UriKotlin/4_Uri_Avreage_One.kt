package ProblemSolvingDayByDay.UriKotlin

import java.util.*

fun main() {
    var x: Float
    var y: Float
    var a: Double = 3.5
    var b: Double = 7.5
    var sc = Scanner(System.`in`)
    x = sc.nextFloat();
    y = sc.nextFloat();

    var fRes = x * a
    var sRes = y * b
    var totalRes = fRes + sRes
    var totalWeight = a + b;

    var res = totalRes / totalWeight
    System.out.printf("MEDIA = %.5f\n", res)


}
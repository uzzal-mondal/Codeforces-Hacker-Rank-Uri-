package ProblemSolvingDayByDay.UriKotlin

import java.util.*

fun main() {
    var r: Double
    var circleArea: Double
    var PI: Double = 3.14159
    var sc = Scanner(System.`in`)
    r = sc.nextDouble();

    circleArea = PI * r * r;
    System.out.printf("A=%.4f\n", circleArea);

}
package first_step

/**
 *Created by Jasonhaven.Dai on2018/3/21.
 *
 **/


fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun min(a: Int, b: Int) = if (a < b) a else b

fun getArea(l: Int = 1, w: Int = 1): Int = l * w//默认参数

fun test(a: Int, b: Int = 1, c: Int = 2): Int = a + b + b

fun main(args: Array<String>) {
    println(max(10, 12))
    println(min(10, 12))

    var f = { x: Int, y: Int -> x + y }
    println(f(1, 2))

    var f2: (Int, Int) -> Int = { x, y -> x + y }
    println(f2(1, 2))

    println(getArea())
    println(getArea(2, 3))

    println(test(1, 2, 3))
    println(test(1))


}


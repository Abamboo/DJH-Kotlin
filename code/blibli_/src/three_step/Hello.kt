package three_step

import java.math.BigInteger

/**
 *Created by Jasonhaven.Dai on2018/3/22.
 *
 **/

fun factorial(num: Int): BigInteger {
    if (num == 1) return BigInteger.valueOf(1)
    return BigInteger.valueOf(num.toLong()).times(factorial(num - 1))
}


tailrec fun factorial_tail(num: Int, result: BigInteger): BigInteger {
    if (num == 1) return result.times(BigInteger.valueOf(1L))
    return factorial_tail(num - 1, result.times(BigInteger.valueOf(num.toLong())))
}

fun main(args: Array<String>) {
//    var t = T("dai")
//    t.t()
//    t.exten()
//    println(factorial(10000))//stackoverflow
    var result: BigInteger = BigInteger.valueOf(1)
    println(factorial_tail(10000, result))
}


class T(var a: String) {
    var x: String = ""

    init {
        x = a
        println("init...")
    }

    fun t() {
        println(x)
    }
}

fun T.exten() {
    println("extention function")
}

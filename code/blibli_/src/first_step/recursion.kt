package first_step

/**
 *Created by Jasonhaven.Dai on2018/3/21.
 *
 **/

fun main(args: Array<String>) {
    var rst = sum(10)
    println(rst)

    rst = 0
    rst = tail_Call_Optimization_sum(10, rst)//尾递归优化
    println(rst)

}

fun sum(n: Int): Int {
    if (n == 1) return 1
    else
        return n + sum(n - 1)
}

fun tail_Call_Optimization_sum(n: Int, result: Int): Int {
    if (n == 1) return result + 1
    else
        return tail_Call_Optimization_sum(n - 1, result + n)
}

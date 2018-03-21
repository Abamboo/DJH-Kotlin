package first_step

/**
 *Created by Jasonhaven.Dai on2018/3/21.
 *
 **/

//人机交互
fun main(args: Array<String>) {
    println("input a number:")
    var numStr1 = readLine()
    println("input a number:")
    var numStr2 = readLine()

    var n1: Int = numStr1!!.toInt()//不为空
    var n2: Int = numStr2!!.toInt()//不为空

    println("${n1 + n2}")


}
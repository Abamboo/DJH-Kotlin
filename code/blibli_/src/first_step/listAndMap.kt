package first_step

import java.util.*

/**
 *Created by Jasonhaven.Dai on2018/3/21.
 *
 **/


fun main(args: Array<String>) {
    var lst = listOf(2, 3, 4, 45, 6, 47, 6756)
    for ((i, s) in lst.reversed().withIndex()) {
        println("" + i + ',' + s)
    }

    var mp = TreeMap<String, String>()
    mp["learn"] = "学习"
    mp["hi"] = "你好"
    println(mp)

}
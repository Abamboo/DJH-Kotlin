package first_step

/**
 *Created by Jasonhaven.Dai on2018/3/21.
 *
 **/

fun main(args: Array<String>) {
    var lst = 1..10
    println(lst)

    for (x in lst) println(x)//闭区间

    for (x in 1 until 10) println(x)//开区间

    for (i in 1..5) {
        println(i)
    }

    for (i in 1..10 step 2) {
        println(i)
    }

    for (i in 10 downTo 1) {
        println(i)
    }

    for (i in 10 downTo 1 step 3) {
        println(i)
    }

    var i = 0
    while (i < 10) {
        if (i == 0) println("i is zero!")
        else if (i == 9) println("i is nine!")
        else {
            when (i) {
                2 -> println("two")
                3 -> println("three")
            }
        }
        i++
    }

}
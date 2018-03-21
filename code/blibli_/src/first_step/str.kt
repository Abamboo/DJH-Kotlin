package first_step

/**
 *Created by Jasonhaven.Dai on2018/3/21.
 *
 **/
fun main(args: Array<String>) {
    val a = "abc"
    val b = "ABC"
    println(a == b)
    println(a.equals(b))
    println(a.equals(b, true))
    println(a.hashCode())
    println(b.hashCode())

    var x1 = "13"
    var x2 = 10

    x1 = x2.toString()
    x2 = x1.toInt()

    println(x1)
    println(x2)

}
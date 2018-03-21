package first_step

/**
 *Created by Jasonhaven.Dai on2018/3/21.
 *
 **/

val template: String = "今天天气晴朗，万里无云，我们去 place 游玩"

fun genStr(place: String): String {
    return template.replace("place", "$place")
}

fun main(args: Array<String>) {
    val places = listOf("中山公园", "人民大会堂", "鸟巢")
    for (p in places) {
        println(genStr(p))
    }
    val a = 10
    val b = 20
    println("${a} is less than ${b}")
}
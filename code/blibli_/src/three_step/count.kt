package three_step

/**
 *Created by Jasonhaven.Dai on2018/3/22.
 *
 **/

fun main(args: Array<String>) {
    var text = "fun main(args: Array<String>)"
    text.filter {
        !it.isWhitespace()
    }.groupBy {
        it
    }.map {
        println("" + it.key + "->" + it.value)
    }
}
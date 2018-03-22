package three_step

/**
 *Created by Jasonhaven.Dai on2018/3/22.
 *
 **/
//fun main(args: Array<String>) {
//
//}


//可变参数
fun main(vararg args: String) {
    args.flatMap {
        it.split("_").map {
            print("$it ")//字符串模板
        }
    }
}
package first_step

/**
 *Created by Jasonhaven.Dai on2018/3/21.
 *
 **/

fun main(args: Array<String>) {
    //Byte Short Int Long Float Double String
    //type inference类型推断
    //显示类型声明
    //不同的数据类型 用 不同的容器保存

    val a1: Int = 10
    val a2: Int
    a2 = 11
    val a3 = "12"//type inference
    println("$a1,$a2,$a3")


    var x1 = '1'//type inference
    x1 = 'a'
    var x2 = 3//type inference
    x2 = 20
    var x3 = "asd"//type inference
    x3 = "adasdasd"
    println("$x1,$x2,$x3")
}
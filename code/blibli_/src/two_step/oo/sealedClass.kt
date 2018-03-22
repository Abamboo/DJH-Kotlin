package two_step.oo

/**
 *Created by Jasonhaven.Dai on2018/3/21.
 *
 **/

//母驴、公马、公驴、生出来的儿子类

//印章类，子类固定的类型

sealed class Son1 {

    fun sayHello() {
        println("hello")
    }

    class 小小驴() : Son1()
    class 小小骡() : Son1()
}

fun main(args: Array<String>) {
    var s1: Son1 = Son1.小小驴()
    var s2: Son1 = Son1.小小骡()
    var s3: Son1 = Son1.小小骡()

    var lst = listOf(s1, s2, s3)
    for (s in lst) {
        println(s.sayHello())
    }
}

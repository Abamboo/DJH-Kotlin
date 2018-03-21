package first_step

/**
 *Created by Jasonhaven.Dai on2018/3/21.
 *
 **/


//接受非空参数
fun sayHello(name: String): String {
    return "Hello " + name
}

//接受可以为空参数
fun sayHello2(name: String?): String? {
    if (name == null) return null
    return "Hello " + name
}

fun main(args: Array<String>) {
    //空值处理

    //null在计算机中，也是一个值，表示什么都没有

    val name = "张三"
    println(sayHello(name))

//    print(first_step.sayHello(null))//Error:Null can not be a value of a non-null type String
    print(sayHello2(null))

}
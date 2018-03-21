package first_step

/**
 *Created by Jasonhaven.Dai on2018/3/21.
 *
 **/
fun main(args: Array<String>) {
    var tplt = "first_step.max=maxValue,first_step.min=minValue"
    println(tplt.replace("maxValue", "$Byte.MAX_VALUE").replace("minValue", newValue = "$Byte.MIN_VALUE"))
    println("" + Byte.MAX_VALUE + "," + Byte.MIN_VALUE)
    println("" + Short.MAX_VALUE + "," + Short.MIN_VALUE)
    println("" + Int.MAX_VALUE + "," + Int.MIN_VALUE)
    println("" + Long.MAX_VALUE + "," + Long.MIN_VALUE)
    println("" + Float.MAX_VALUE + "," + Float.MIN_VALUE)
    println("" + Double.MAX_VALUE + "," + Double.MIN_VALUE)

    val aInt: Int = 0b0011
    println(aInt)//十进制大印

}
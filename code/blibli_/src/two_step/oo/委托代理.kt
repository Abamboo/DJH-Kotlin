package two_step.oo

/**
 *Created by Jasonhaven.Dai on2018/3/21.
 *
 **/
//洗碗的接口
interface IWashBowl {
    fun wash()
}

class BigHeadSon : IWashBowl {
    override fun wash() {
        println("大头儿子洗碗....")
    }

}

//代理  by关键字 爸爸将洗碗的功能交给儿子代理实现
class SmallHeadDad : IWashBowl by BigHeadSon() {
    override fun wash() {
        println("小头爸爸洗碗....")
        BigHeadSon().wash()
    }
}

fun main(args: Array<String>) {
    var son = BigHeadSon()
    var dad = SmallHeadDad()
    son.wash()
    dad.wash()
}
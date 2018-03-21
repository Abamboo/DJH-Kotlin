package two_step.oo

/**
 *Created by Jasonhaven.Dai on2018/3/21.
 *
 **/

class Girl(var name: String, var voice: String) {

    private var x: Int = 0

    fun smile() {
        println("laughing....")
    }

    fun cry() {
        println("crying...")
    }

    fun test(x: Int) {
        update(x)
    }

    fun visit_x(){
        println(x)
    }

    private fun update(x: Int) {
        this.x = x
    }

}

fun main(args: Array<String>) {
    var g1 = Girl("xiao", "sweet")
    println(g1.toString())
    g1.smile()
    g1.cry()

    g1.visit_x()
    g1.test(10)
    g1.visit_x()

}
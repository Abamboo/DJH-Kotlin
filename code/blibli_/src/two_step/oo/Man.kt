package two_step.oo

/**
 *Created by Jasonhaven.Dai on2018/3/21.
 *
 **/

class Man(name: String) : Human(name), IMan {
    override fun xiaodidi() {
        println("xiaodidi")
    }

    override fun eat() {
        println("吃得多！！！")
    }

    override fun pee() {
        println("站着尿尿...")
    }
}
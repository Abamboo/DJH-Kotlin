package two_step.oo

/**
 *Created by Jasonhaven.Dai on2018/3/21.
 *
 **/

class Woman(name: String) : Human(name) {
    override fun eat() {
        println("吃得少！！！")
    }

    override fun pee() {
        println("蹲着尿尿...")
    }
}
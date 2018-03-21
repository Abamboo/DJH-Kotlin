package two_step.oo

/**
 *Created by Jasonhaven.Dai on2018/3/21.
 *
 **/

fun main(args: Array<String>) {
    var man = Man("小明")
    var woman = Woman("小红")
    man.eat()
    woman.eat()

    var people = listOf(man, woman)
    for (m in people) {
        m.pee()
    }

    man.xiaodidi()
}
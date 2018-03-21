package basic_syntax

/**
 *Created by Jasonhaven.Dai on2018/3/21.
 *
 **/

/*

Defining packages
Package specification should be at the top of the source file:

package my.demo

import java.util.*

// ...
It is not required to match directories and packages: source files can be placed arbitrarily in the file system.

* */


val PI = 3.14
var x = 0

fun incrementX() {
    x += 1
}

fun main(args: Array<String>) {
    println(sum(3, 5))
    println(sum2(3, 4))
    printSum(2, 4)


    //Defining variables
    // val 只读变量，var 可变变量
    val a: Int = 1  // immediate assignment
    val b = 2   // `Int` type is inferred
    val c: Int  // Type required when no initializer is provided

    c = 3       // deferred assignment
    println("a = $a, b = $b, c = $c")

    incrementX()
    println("x=$x")

    var x = 5 // `Int` type is inferred
    x += 1
    println("x = $x")

    x = 1
    // simple name in template:
    val s1 = "a is $x"

    x = 2
    // arbitrary expression in template:
    val s2 = "${s1.replace("is", "was")}, but now is $x"
    println(s2)

    println("max of 0 and 42 is ${maxOf(0, 42)}")
    println("max of 0 and 42 is ${maxOf2(0, 42)}")
    println("a is '$a'")
    println("a is $a")

    //loop
    var items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }

    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }

    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }

    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("other"))

    x = 10
    val y = 9
    if (x in 1..y + 1) {
        println("fits in range")
    }

    val list = listOf("a", "b", "c")

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range too")
    }
    for (x in 1..5) {
        print(x)
    }

    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print(x)
    }

    var sets = setOf("apple", "banana", "kiwifruit")
    when {
        "orange" in sets -> println("juicy")
        "apple" in sets -> println("apple is fine too")
    }

    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }

    val rectangle = Rectangle(5.0, 2.0) //no 'new' keyword required
    val triangle = Triangle(3.0, 4.0, 5.0)

}

//Defining functions
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxOf2(a: Int, b: Int) = if (a > b) a else b


fun describe(obj: Any): String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"
        }
//class

abstract class Shape(val sides: List<Double>) {
    val perimeter: Double get() = sides.sum()
    abstract fun calculateArea(): Double
}

interface RectangleProperties {
    val isSquare: Boolean
}

class Rectangle(
        var height: Double,
        var length: Double
) : Shape(listOf(height, length, height, length)), RectangleProperties {
    override val isSquare: Boolean get() = length == height
    override fun calculateArea(): Double = height * length
}

class Triangle(
        var sideA: Double,
        var sideB: Double,
        var sideC: Double
) : Shape(listOf(sideA, sideB, sideC)) {
    override fun calculateArea(): Double {
        val s = perimeter / 2
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }
}
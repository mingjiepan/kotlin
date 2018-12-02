package com.mjie.function

//默认参数（default arguments）

fun test(a: Int = 0, b: Int = 0)  = println(a - b)

fun test2(a: Int, b: Int = 2) = println(a + b)
fun test3(a: Int = 2, b: Int) = println(a * b)

fun main(args: Array<String>) {
    test(1, 2)
    test()
    test(a = 2)
    test(b = 2)

    println("-----------------")

    val b = B()
    b.method()

    println("-----------")

    test2(1)
    test3(b = 1)
}

/*
对于重写的方法来说，子类所拥有的重写方法会使用与父类相同的默认参数值
在重写一个拥有默认参数值的方法时，方法签名中必须要将默认参数值省略。
 */
open class A {
    open fun method(a: Int = 1, b: Int = 4) = a +b
}

class B: A() {
    override fun method(a: Int, b: Int): Int = a - b
}
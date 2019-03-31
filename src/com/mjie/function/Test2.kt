package com.mjie.function

fun test4(a: Int = 1, b: Int = 2, compute: (x: Int, y: Int) -> Unit) {
    compute(a, b)
}

fun test5(a: Int, b: Int = 2, c: Int = 3, d: Int) = println(a + b + c + d)

/*
    具名参数：在调用函数时，函数参数可以是具名的。
    当一个函数有大量参数或是一些参数拥有默认值时，这种调用方式比较方便的
 */

fun main(args: Array<String>) {
    test4(2, 4, ::test)
    println("---------")

    test4(1, 2, { a, b -> println(a - b) })
    println("---------")

    test4(1, 2) { a, b -> println(a - b) }
    println("---------")

    test4(3) { a, b -> println(a - b) }
    println("---------")

    test4(compute = { x, y -> println(x - y) })
    println("----")

    test4 { x, y -> println(x - y) }

    println("------------------------")

    test5(1, d = 3)
}

package com.mjie.lambda

/*
    匿名函数
 */
fun main(args: Array<String>) {
    fun(a: Int, b: Int) = a + b
    fun(a: Int, b: Int): Int {
        return a + b
    }

    val strings = arrayOf("hello", "world", "welcome")
    strings.filter { it.length > 3 }.forEach { println(it) }

    //匿名函数需要放在括号()里面
    strings.filter(fun(item): Boolean = item.length > 3).forEach { println(it) }
}




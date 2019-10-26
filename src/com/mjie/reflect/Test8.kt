package com.mjie.reflect

/**
 * 构造方法引用
 * 要求有2点
 * 函数对象的参数要与构造方法的参数保持一致（体现在参数个数和参数类型）
 * 函数对象的返回结果要与构造方法所在类的类型保持一致
 */


class B(val x: Int)

fun method(factory: (Int) -> B): Unit {
    val b: B = factory(12)
    println(b.x)
}

fun main() {
    method (::B)
}
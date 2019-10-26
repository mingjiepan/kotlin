package com.mjie.reflect

/**
 * 属性引用
 *
 * 属性引用的用法与函数引用的用法完全一致，都是通过::形式来引用
 *
 * 表达式 ::a 表示类型KProperty<Int>的属性对象，我们可以通过get()方法来获取其值，也可以通过name属性来获取其名字
 *
 * 对于可变属性来说，比如说 var b = 5, ::b返回的是类型KMutableProperty<Int>的值，它拥有一个set()方法
 */


const val a = 3

var b = 5

fun main() {
    println(::a)
    println(::a.get())
    println(::a.name)

    println("-----------")

    ::b.set(10)
    println(b)
    println(::b.get())
    println(::b::class)
}
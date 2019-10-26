package com.mjie.reflect


/**
 * 我们可以引用特定对象的一个实例方法
 */
fun main() {
    val str = "abc"
    val getReference = str::get
    val invoke = getReference.invoke(2)

    println(invoke)

    println("-------")

    val myProp = "test"::length
    println(myProp.get())

    println("----------")

    val myProp2 = String::length
    println(myProp2.get("hello world"))
}
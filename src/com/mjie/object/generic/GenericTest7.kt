package com.mjie.`object`.generic

//泛型函数
fun <T> getValue(item: T): T {
    return item
}

fun main(args: Array<String>) {
    val value = getValue("hello")
    println(value)
}
class UpperBoundsClass<T: List<T>>

/*
    实现T多个上界
 */
class UpperBoundsClass2<T> where T: Comparable<T>, T: Any

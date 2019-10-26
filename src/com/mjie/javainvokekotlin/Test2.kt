package com.mjie.javainvokekotlin

/**
 * 泛型擦除
 */
fun List<String>.myFilter() : List<String> {
    return listOf("hello", "world")
}

@JvmName("myFilter2")
fun List<Int>.myFilter(): List<Int> {
    return listOf(1, 2)
}

fun main() {
    val list1 = listOf<String>()
    println(list1.myFilter())

    val list2 = listOf<Int>()
    println(list2.myFilter())
}
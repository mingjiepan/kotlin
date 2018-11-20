package com.mjie.`object`.generic

import kotlin.test.assertEquals

/*
 use-site variance (type projection), 类型投影(使用处协变)
*/
//数组的浅拷贝
fun copy(from: Array<out Any>, to: Array<Any>) {
    assertEquals(from.size, to.size)

    for (index in from.indices) {
        to[index] = from[index]
    }
}

fun setValue(array: Array<in String>, index: Int, value: String) {
    array[index] = value
}

fun main(args: Array<String>) {
    val from:Array<Int> = arrayOf(1, 2, 3, 4)
    val to:Array<Any> = Array(4) { it -> "hello$it" }
    copy(from, to)
    println("-------------")

    val array:Array<String> = Array(4) { _ -> "hello"}
    setValue(array, 1, "world")

    for(item in array) {
        println(item)
    }

    println("------------")

    val array2:Array<Any> = Array(4) {it -> "hello$it"}
    setValue(array2, 1, "welcome")
}
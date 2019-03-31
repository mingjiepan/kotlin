package com.mjie.collection

/*
    kotlin严格区分可变集合与不可变集合
    要清楚的一点是：区分可变集合的只读视图与实际上真正的不可变集合
 */
fun main(args: Array<String>) {
    val stringList: MutableList<String> = mutableListOf("hello", "world")
    val readOnlyView: List<String> = stringList

    println(stringList)

    stringList.add("welcome")

    println(readOnlyView)
}
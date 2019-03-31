package com.mjie.collection

fun main(args: Array<String>) {
    val map = mapOf("name" to "zhangsan", "address" to "xiamen")
    map.mapValues { entry -> "hello ${entry.value}" }.forEach {key, value -> println("key = $key, value = $value")}
    println("------------")
    map.mapValues { (key, value) -> "hello $value" }.forEach {println(it)}
    println("------------")
    map.mapValues { (_, value) -> "hello $value" }.forEach {println(it)}
    println("------------")

    //kotlin允许我们为解构声明整体指定类型，也可以为每一个具体的component指定类型
    map.mapValues { (_, value): Map.Entry<String, String> -> "hello $value" }.forEach {println(it)}
    map.mapValues { (_, value:String) -> "hello $value" }.forEach {println(it)}
}
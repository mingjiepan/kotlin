package com.mjie.delagation

import java.util.*

/*
map委托

将属性存储到map中
一种常见的应用场景是将属性值存储到map当中。
这通常出现在JSON解析或是一些动态行为。
在这种情况中，你可以将map实例作为委托，作为类中属性的委托

map中的key要和类中的属性名字保持一致
 */

class Student(map: Map<String, Any?>) {
    val name: String by map
    val address: String by map
    val age: Int by map
    val birthday: Date by map
}

class Student2(map: MutableMap<String, Any?>) {
    val address: String by map
}

fun main(args: Array<String>) {
    val map = mapOf<String, Any?>(
            "name" to "zhangsan",
            "address" to "xiamen",
            "age" to 20,
            "birthday" to Date()
    )
    val student = Student(map)
    println(student.name)
    println(student.address)
    println(student.age)
    println(student.birthday)

    println("---------------------------------")
    val map2 = mutableMapOf<String, Any?>(
            "address" to "xiamen"
    )
    val student2 = Student2(map2)
    println(map2["address"])
    println(student2.address)

    map2["address"] = "beijing"
    println(student2.address)
}
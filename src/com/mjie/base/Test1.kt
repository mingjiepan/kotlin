package com.mjie.base


fun main(args: Array<String>) {
    val a: Int = 1 //val修饰的是常量
    val b = 2 //类型推断

    var c = 3 //var修饰的是变量
    c = 4

    /*
    /*
    kotlin可以嵌套注释
     */
     */
    var d: Byte = 1
    var e: Int = 2
    //e = d //kotlin中不能讲范围小的变量赋值给范围大的变量，类型需要准确匹配
    e = d.toInt()

    println(e)

    val arr = intArrayOf(1, 2, 3)
//    arr = intArrayOf(2, 3, 4)
    arr.set(2, 10) //不能修改常量直接指向的对象，但是可以修改指向对象的内容
}
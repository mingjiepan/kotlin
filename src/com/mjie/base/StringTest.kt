package com.mjie.base


/**
 * 字符串有两种表达方式，一对双引号"str"  ，三对双引号"""str"""，三对双引号会保留字符串的原始内容，包括转义字符
 */
fun main(args: Array<String>) {
    var str:String = "hello \n\r world"
    println(str)

    str = "welcome to \\n\\r xiamen"
    println(str)

    str = """think you very much \n\r mjie"""
    println(str)

    println("-------------------------------------")
    val strArr:Array<String> = arrayOf("hello", "world", "welcome")
    for (str:String in strArr) {
        println(str)
    }
}
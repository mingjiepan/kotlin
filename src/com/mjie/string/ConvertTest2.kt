package com.mjie.string

fun main(args: Array<String>) {
    println(convert2Uppercase("hello world"))
    println(convert2Uppercase("123"))
}


fun convert2Uppercase(str: Any): String? {
    if(str is String) {
        return str.toUpperCase() //在if语句块内kotlin已经认为是String类型了。要是在Java，需要进行强制类型转换
    }
    return null
}
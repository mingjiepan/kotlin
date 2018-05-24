package com.mjie.string

fun main(args: Array<String>) {

    var result = convert2Int("23")
    println(result)

    printMultiply("b", "12")
}

fun convert2Int(str: String) : Int? {
    try {
        return str.toInt()
    } catch (ex: Exception) {
        return null
    }
}

fun printMultiply(a: String, b: String) {
    val a2Int = convert2Int(a)
    val b2Int = convert2Int(b)

    if(null != a2Int && null != b2Int) {
        println(a2Int * b2Int)
    } else {
        println("param not int")
    }
}

fun printMultiply2(a: String, b: String) {
    val a2Int = convert2Int(a)
    val b2Int = convert2Int(b)
//    println(a2Int * b2Int)
}




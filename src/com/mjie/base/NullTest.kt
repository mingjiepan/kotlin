package com.mjie.base

fun main(args: Array<String>) {
    var result = str2Int("23")
    println("result = $result")
    println("--------------")
    result = str2Int("abc")
    println("result = $result")
}


/**
 * is 类似Java的instanceof关键字，但是在kotlin中，既然判断属于某个具体的类型后，无需像
 * Java那样，进行强制类型转换
 * 此处还有一个注意点，返回值Int? 中?号表示此方法可能返回null，若是没有加问号，则方法一定不会返回null
 */
fun str2Int(str: Any) : Int? {
    if (str is String) {
        val result: Int
        try {
            result =  str.toInt()
        } catch (ex : Exception) {
            return null
        }
        return result
    }
    return null
}
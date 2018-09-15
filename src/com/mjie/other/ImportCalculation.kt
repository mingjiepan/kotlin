package com.mjie.other

import com.mjie.base.multiply as myMultiply //指定别名

//import com.mjie.`fun`.*  //引入该包下面所有的函数
//import com.mjie.base.multiply

fun main(args: Array<String>) {
//    val result = multiply(3, 4)
    val result = myMultiply(3, 4)
    println(result)
}
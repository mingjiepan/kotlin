package com.mjie.`object`.extension


fun main(args: Array<String>) {
    var testChild3 = TestChild3()
    testChild3.echo()
}

open class TestParent3

class TestChild3 : TestParent3()

fun TestParent3.echo() {
    println("TestParent3 echo")
}


/**
 * 扩展函数也可以重写
 */
fun TestChild3.echo() {
    println("TestChild3 echo")
}

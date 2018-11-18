package com.mjie.`object`.extension

/**
 * 扩展类的实例方法
 */
class MyTest {
    fun echo() {
        println("myTest")
    }
}

fun MyTest.sayHello(name: String) {
    println("hello")
}

fun main(args: Array<String>) {
    var myTest = MyTest()
    myTest.echo()
    myTest.sayHello("zhangsan")
    println("hello")
}
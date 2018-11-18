package com.mjie.`object`.extension

/**
 * 扩展类的伴生对象的函数
 */

class MyTest2 {
   companion object {
       fun echo() {
           println("myTest2")
       }
   }
}

fun MyTest2.Companion.sayHello() {
    println("hello myTest2")
}

fun main(args: Array<String>) {
    MyTest2.echo()
    MyTest2.sayHello()
}
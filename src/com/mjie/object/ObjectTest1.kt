package com.mjie.`object`

/**
 * kotlin 类默认情况下public，文件名和类名无需相同
 *
 * 在kotlin中，一个类可以有一个primary构造方法以及一个或多个secondary构造方法
 * primary构造方法是类头（class header）的一部分，它位于类名后面，可以拥有若干参数
 *
 * 如果primary构造方法没有任何注解或是可见性关键字修饰，那么constructor关键字可省略
 */
class EmptyClass

class MyClass constructor(username: String) {
    private val username: String = username.toUpperCase()

    init {
        println("username : $username")
    }
}

fun main(args: Array<String>) {
    var myClass = MyClass("zhangsan")
}



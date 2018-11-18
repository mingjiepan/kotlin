package com.mjie.`object`.extension

/**
扩展的作用域
1. 扩展函数所定义在的类实例叫做分发接收者（dispatch receiver）
2. 扩展函数所扩展的那个类的实例叫做扩展接收者（extension receiver）
3. 当以上两个名字出现冲突时，扩展接收者的优先级最高
 */

//扩展接收者
class ExtReceiver {
    fun echo() {
        println("ExeReceiver")
    }
}

//分发接收者
class DispatchReceiver(extReceiver: ExtReceiver) {

    var extReceiver: ExtReceiver = extReceiver

    fun ExtReceiver.hello() {
        println("ExtReceiver hello")
        this@DispatchReceiver.hello()
    }

    fun hello() {
        println("DispatchReceiver hello")
    }

    fun invokeHello() {
        extReceiver.hello()
    }
}

fun main(args: Array<String>) {
    var ext = ExtReceiver()
    var dis = DispatchReceiver(ext)
    dis.hello()

    println("-----------------------------")
    dis.invokeHello()
}


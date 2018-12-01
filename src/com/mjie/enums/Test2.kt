package com.mjie.enums

import java.awt.event.ActionEvent
import java.awt.event.ActionListener

/*
对象声明与对象表达式的区别
1. 对象表达式是立刻初始化或执行的
2. 对象声明式延迟初始化的，在首次访问的时候进行
3. 伴生对象是其所在对应的类被加载时初始化的，对应于Java的静态初始化
 */
object MyObject {
    fun echo() {
        println("hello world")
    }
}

object MyObject2 : ActionListener {
    override fun actionPerformed(e: ActionEvent?) {
        println("hello world")
    }
}

fun main(args: Array<String>) {
    MyObject.echo()
}
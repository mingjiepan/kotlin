package com.mjie.function

/*
中缀符号（infix notation）

函数还可以通过中缀符号形式来调用，需要满足如下3个条件
1. 是成员函数或是扩展函数
2. 拥有单个参数
3. 声明时使用infix关键字
 */
class InfixTest(private val a: Int) {
    infix fun add(b: Int) = this.a + b
}

fun main(args: Array<String>) {
    val infixTest = InfixTest(2)

    //两种方式等价
    println(infixTest.add(3))
    println(infixTest add 3)
}
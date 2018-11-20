package com.mjie.`object`

/**
 * 密封类 （sealed class）
 *
 * 1. 密封类表示受限的类的层次结构，可以看成枚举的扩展
 * 2. 密封类可以有子类
 * 3. 密封类和子类必须定义在同一个文件
 * 4. 密封类是抽象的类
 * */

sealed class Calculator

class Add: Calculator()

class Subtract: Calculator()

class Multiply: Calculator()

fun calculate(a:Int, b:Int, cal: Calculator) = when (cal) {
    is Add -> a +b
    is Subtract -> a - b
    else -> a * b
}

fun main(args: Array<String>) {
    var result = calculate(1, 2, Add())
    println(result)
    println("----------")
}
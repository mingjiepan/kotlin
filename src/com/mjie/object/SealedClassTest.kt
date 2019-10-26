package com.mjie.`object`

/**
 * 密封类 （sealed class）
 *
 * 1. 密封类表示受限的类的层次结构，可以看成枚举的扩展
 * 2. 密封类可以有子类
 * 3. 密封类和子类必须定义在同一个文件
 * 4. 密封类是抽象的类
 * */

sealed class Calculator {

    object Add : Calculator() {
        fun method(a: Int, b: Int): Int {
            return a + b
        }
    }
}

class Decrease : Calculator() {
    fun method(a: Int, b: Int): Int {
        return a - b
    }
}

fun main() {
    var addClass = Calculator.Add
    addClass.method(1, 2)

    var deClass = Decrease()
    deClass.method(2, 1)
}
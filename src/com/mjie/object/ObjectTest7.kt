package com.mjie.`object`

open class MyParent4 {
    open fun method() {
        println("MyParent4")
    }
}

/**
 * 子类可以用抽象方法重写父类的concrete方法
 */
abstract class MyChild4 : MyParent4() {
    abstract override fun method()
}
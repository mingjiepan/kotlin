package com.mjie.delagation

import kotlin.reflect.KProperty

//委托属性（delegated property）

/*
    有4种情况在实际开发中比较有用
    1. 延迟属性
    2. 可观测属性
    3. 非空属性
    4. map属性
 */

class MyPropertyClass {
    var str: String by MyDelegate()
}

class MyDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>) : String = "$thisRef, property = ${property.name}"
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) = println("$thisRef new value is $value")
}

fun main(args: Array<String>) {
    val myPropertyClass = MyPropertyClass()
    myPropertyClass.str = "hello world"
    println(myPropertyClass.str)
}


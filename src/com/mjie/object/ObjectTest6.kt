package com.mjie.`object`


/**
 * 在kotlin中，一个类的属性或者方法默认是final的，若是属性或者方法是从父类继承来的，那么就是open的，如果不让其他类继承，需要
 * 显示声明为final的
 */
open class MyParent {
    open val name:String = "parent"
}

open class MyChild:MyParent() {
    override val name:String = "child"
}

//直接通过primary构造方法override父类的属性
class MyChild2(override val name: String): MyParent() {
}

//val可以override val
//var 可以 override val
//val 无法 override var
//本质上，val相当于get方法，var相当于get与set方法

open class MyParent3 {
    open fun method() {
    }
    open val name: String get() = "parent"
}

class MyChild3 : MyParent3() {
    override fun method () {
        super.method()
        println("myChild3")
    }

    override val name:String
    get() = super.name + " mychild3"
}

fun main(args: Array<String>) {
    var myChild = MyChild()
    println(myChild.name)
    println("-------------------------")

    var myChild3 = MyChild3()
    myChild3.method()
    println(myChild3.name)
}
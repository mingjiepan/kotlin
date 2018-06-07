package com.mjie.objects

open class MyParent {
    open val name: String = "parent"
}

class MyChild: MyParent() {
    override val name: String = "child"
}

class MyChild2(override val name: String): MyParent() {
}

fun main(args: Array<String>) {
    var myChild2 = MyChild2("hello")
    println(myChild2)
}

//val属性是可以被val或者var所override的，而var属性不能被val所override
//val表示只读的，只有get方法，而var表示可读和可写，有get和set方法

open class MyParent3 {
    open fun method(): Unit {
        println("parent3 method")
    }
    open val name: String get() = "parent3"
}

class MyChild3: MyParent3() {
    override fun method() {
        super.method()
        println("myChild3 method")
    }
    override val name: String get() = super.name + " and child"
}
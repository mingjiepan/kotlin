package com.mjie.delagation

import kotlin.properties.Delegates

//非空属性
//noNull 用于无法在初始化阶段就确定属性值的场合
class MyPerson {
    var addres: String by Delegates.notNull<String>()
}

/*
可观测属性（Observable）

Delegates.observable接收两个参数：初始值与修改处理器
处理器会在我们每次对属性赋值时得到调用（在赋值完成之后被调用）
处理器本身接收3个参数：被赋值的属性本身，旧的属性值与新的属性值

Delegates.vetoable的调用时机与Delegates.observable相反，它是在对属性赋值之前被调用，根据Delegates.vetoable
的返回结果是true还是false，来决定是否真正对属性进行赋值
 */
class MyPerson2 {
    var age: Int by Delegates.observable(20) { property, oldValue, newValue ->
        println("${property.name}, oldValue: $oldValue, newValue: $newValue")
    }
}


class MyPerson3 {
    var age: Int by Delegates.vetoable(20) { _, oldValue, newValue ->
        when {
            oldValue <= newValue -> true
            else -> false
        }
    }
}

fun main(args: Array<String>) {
    val myPerson = MyPerson()
    myPerson.addres = "xiamen"
    println(myPerson.addres)
    println("-------------------------------")

    val myPerson2 = MyPerson2()
    println(myPerson2.age)
    myPerson2.age = 30
    myPerson2.age = 40

    println("-----------------------------")

    val person3 = MyPerson3()
    println(person3.age)

    person3.age = 40
    println(person3.age)

    person3.age = 30
    println(person3.age)
}
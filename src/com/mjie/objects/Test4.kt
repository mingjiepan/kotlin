package com.mjie.objects


//在kotlin中，所有类在默认情况下是无法被继承的，换句话说，在kotlin中，所有类默认情况下都是final的
//在kotlin中，如果没有primary构造方法，那么这个类的每个secondary构造方法都需要通过super关键字来初始化
//父类型，或是通过其他secondary构造方法完成这个任务，不同的secondary构造方法可以调用父类型不同的构造方法

open class Parent(var name:String, var age:Int) {

}

class Child(name:String, age:Int): Parent(name, age) {

}

fun main(args: Array<String>) {
    var child = Child("zhangsan", 20)
}


open class Parent2(name: String) {

}

class Child2:Parent2 {
    constructor(name: String): super(name) {

    }
}


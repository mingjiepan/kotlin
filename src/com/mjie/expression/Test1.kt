package com.mjie.expression

//对象表达式（Object expression）
//Java当中匿名内部类在很多场景下都得到了大量使用
//kotlin的对象表达式就是为了解决匿名内部类的一些缺陷而产生的

/*
1. 匿名内部类是没有名字的类
2. 匿名内部类一定是继承了某个父类，或是实现了某个接口
3. Java运行时会将该匿名内部类当做它所实现的接口或是所继承的父类来看待
 */

/*
对象表达式的格式
    object : [若干个父类型，中间用逗号隔开] {

    }
 */

interface MyInterface {
    fun echo(i: Int)
}

abstract class MyAbstractClass {
    abstract val age: Int
    abstract fun myPrint()
}

fun main(args: Array<String>) {

    var myObject = object: MyInterface {
        override fun echo(i: Int) {
            println("i = $i")
        }
    }
    myObject.echo(10)

    println("---------------")

    var myObject2 = object {
        init {
            println("init invoked")
        }

        var name: String = "hello world"
        fun echoName() {
            println("name = $name")
        }
    }
    myObject2.echoName()

    println("------------------")

    var myObject3 = object : MyInterface, MyAbstractClass() {
        override fun echo(i: Int) {
            println("object3 i = $i")
        }

        override val age: Int
            get() = 20

        override fun myPrint() {
            println("myprint")
        }
    }

    myObject3.myPrint()
    println(myObject3.age)
    myObject3.echo(20)
}

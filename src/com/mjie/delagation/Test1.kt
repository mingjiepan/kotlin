package com.mjie.delagation

//委托（delegation）
//类委托
interface MyInterface {
    fun myPrint()
}

class MyInterfaceImpl(private val str: String) : MyInterface {
    override fun myPrint() {
        println("welcome $str")
    }
}

/*
委托原理：
by关键字后面的对象实际上会被存储在类的内部，编译器会将父接口中的所有方法都实现出来，并且将
实现转移给委托对象去执行
 */
class MyClass(myInterface: MyInterface) : MyInterface by myInterface {
    /*override fun myPrint() {
        println("hello world")
    }*/
}

fun main(args: Array<String>) {
    val myInterfaceImpl = MyInterfaceImpl("hello")

    val myClass = MyClass(myInterfaceImpl)
    myClass.myPrint()
}
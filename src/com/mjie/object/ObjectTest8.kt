package com.mjie.`object`

open class MyCar {
    open var name:String = "zhangsan"
    open val age:Int = 10
    open var height: Int = 128

    open fun method() {
        println("hello world")
    }
}

open class MyCar1 : MyCar() {
    final override var name:String = "lisi"

    override var age: Int = 20

//    override val height: Int = 102

    override fun method() {
        println("world")
    }
}

class MyCar2 : MyCar1() {
//    override var name:String = "wangwu"
}


fun main() {

}




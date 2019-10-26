package com.mjie.nested

class OuterClass3 {

    fun method() {
        println("OuterClass3 method")
    }

    fun method2() {
        println("outerClass3 method2")
    }

    class InnerClass3 {
        fun method() {
            this.method2()
            println("InnerClass3 method")
        }

        fun method2() {
            println("innerClass3 method2")
        }
    }

    inner class InnerClass4 {
        fun method() {
            this@OuterClass3.method()
            this@InnerClass4.method2()
            println("inner class method")
        }
        fun method2() {
            println("inner class method2")
        }
    }
}

fun main() {
    val outerClass3 = OuterClass3()
    outerClass3.method()
    println("----")

    val innerClass3 = OuterClass3.InnerClass3()
    innerClass3.method()

    println("------")

    val innerClass = OuterClass3().InnerClass4()
    innerClass.method()
}
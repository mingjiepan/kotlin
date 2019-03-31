package com.mjie.kotlininvokejava

class MyClass {
    companion object {
        fun method1() {
            println("method1")
        }

        @JvmStatic
        fun method2() {
            println("method2")
        }
    }
}
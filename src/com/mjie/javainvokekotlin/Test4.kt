package com.mjie.javainvokekotlin

class MyClass2 @JvmOverloads constructor(x: Int, y: String = "hello") {

}

fun main() {
    val myClass2 = MyClass2(1)
}
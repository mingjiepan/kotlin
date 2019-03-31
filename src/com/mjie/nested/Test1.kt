package com.mjie.nested

//嵌套类(Nested Class)
class OuterClass {
    private val str: String = "hello world"

    //类比Java的静态的只能访问静态，不能访问非静态的，因此无法使用this@OuterClass，也就是嵌套类不能访问外部类的其他成员，只能访问另一个嵌套类
    class NestedClass {
        fun nestedMethod() = "welcome"
    }

    class NestedClass2 {
        private val name: String = "hello world"
        val nestedClass = NestedClass()
    }

    //局部嵌套类
    fun getName(): String {
        class LocalNestedClass {
            val name: String = "world"
        }

        var localNestedClass = LocalNestedClass()
        return localNestedClass.name
    }
}

fun main(args: Array<String>) {
    println(OuterClass.NestedClass().nestedMethod())
}



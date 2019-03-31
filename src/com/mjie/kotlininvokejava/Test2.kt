package com.mjie.kotlininvokejava

/*
在Java中，所有引用都可能为null，然而在kotlin中，对null是有严格的检查与限制的，
这就使得某个来自于Java的引用在kotlin中变得不再适合；基于这个原因，在kotlin中，将来自于Java的声明类型称为平台类型（platform types）
对于这种类型（平台类型）来说，kotlin的null检查就会得到一定的缓和，变得不再那么严格了，这样就使得空安全的语义变得与Java一致
 */

fun main(args: Array<String>) {
    val list = ArrayList<String>()
    val size = list.size
    val item = list[0]

    val s: String? = item //允许，总是可以的
    val s2: String = item //允许，不过可能会在运行期失败

    /*
    如果我们使用了不可空类型，编译器会在赋值时生成一个断言。这会防止kotlin的不可空变量持有null值，同样，这一点也
    适用于kotlin方法参数传递，我们在将一个平台类型值传递给方法的一个不可空参数时，也会生成一个断言
    总体来说，kotlin会竭尽所能防止null的赋值蔓延到程序的其他地方，而是在发生问题之外就立刻通过断言来解决
     */
}

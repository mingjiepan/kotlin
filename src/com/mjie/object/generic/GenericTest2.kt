package com.mjie.`object`.generic

/**
 * 协变（covariant, ? extends 生产者，读取）与逆变 (? super 消费者)
 *
 * List<Object> List<String>
 * List<String>并不是List<Object>的子类
 * List<String> list = new ArrayList();
 * List<Object> list2 = list;//编译失败
 *
 * list2.add(new Date());
 * String str = list.get(0);
 *
 * 通配符
 * List<? extends Object> list = new ArrayList()
 *
 * interface Collection<E> {
 *  void addAll(Collection<E> items)
 * }
 *
 * void copyAll(Collection<Object> to, Collection<String> from) {
 *  to.addAll(from) //错误的
 * }
 *
 * interface Collection<E> {
 *   void addAll(Collection<? extends E> items)
 * }
 *
 * Collection<String> 就是Collection<? extends Object>的子类型
 *
 * List<? super String>
 *
 * 我们如果只从中读取数据，而不往里面写入内容，那么这样的对象叫做生产者；如果只向里面写入内容，而不从中取数据，那么这样的对象称为消费者；
 * */

class MyClass<out T, in M>(t: T, m: M) {
    private var t: T
    private var m: M
    init {
        this.t = t
        this.m = m
    }
    fun get():T = this.t

    fun set(m: M) {
        this.m = m
    }
}

fun myTest(myClass: MyClass<String, Number>) {
//    var myObject: MyClass<String> = myClass
    var myObject: MyClass<Any, Int> = myClass
    println(myObject.get())
}

fun main(args: Array<String>) {
    var myClass = MyClass<String, Number>("hello", 2)
    myTest(myClass)
}










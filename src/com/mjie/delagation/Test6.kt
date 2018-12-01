package com.mjie.delagation

import kotlin.properties.ReadOnlyProperty
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/*
关于属性委托的要求
对于只读属性来说（val修饰的属性），委托需要提供一个getValue的方法，该方法接受如下参数：
1. thisRef, 需要是属性拥有者相同的类型或其父类型（对于扩展属性来说，这个类型指的是被扩展的那个类型）
2. property，需要是KProperty<*>类型或是其父类型
getValue 方法需要返回与属性相同的类型或是其子类型

对于可变属性来说（var修饰的属性），委托需要提供getValue和setValue方法，getValue方法和上面的一样，setValue方法需要接收如下参数
1. thisRef，与getValue方法的thisRef要求一致
2. property，与getValue方法的property要求一致
3. newValue，需要与属性的类型相同或是其父类型

getValue与setValue方法既可以作为委托类的成员方法实现，也可以作为其扩展方法来实现

这两个方法都必须标记为operator关键字，对于委托类来说，它可以实现ReadOnlyProperty或是ReadWriteProperty接口，这些接口
包含了相应的getValue和setValue方法，同时对于委托类来说，也可以不去实现这两个接口，而是自己单独实现相应的getValue和setValue方法

委托转换规则
对于每个委托属性来说，kotlin编译器在底层会生成一个辅助的属性，然后将对原有属性的访问委托给这个辅助属性
比如说，对于属性prop来说，kotlin编译器所生成的隐含的属性名为prop$delegate,然后对原有的prop属性的访问器的访问都只是委托给了这个
kotlin编译器所生成的辅助属性。

提供委托（providing a delegate）

通过定义provideDelegate operator，我们可以扩展委托的创建逻辑过程。如果对象定义了provideDelegate方法，那么该方法就会被调用
来创建属性委托实例
 */
class PersonDelegate: ReadOnlyProperty<Person, String> {
    override fun getValue(thisRef: Person, property: KProperty<*>): String {
        return "hello"
    }
}

class PersonLauncher {
    operator fun provideDelegate(thisRef: Person, property: KProperty<*>): ReadOnlyProperty<Person, String> {
        println("hello world")

        when (property.name) {
            "name", "address" -> return PersonDelegate()
            else -> throw Exception("not valid name")
        }
    }
}

class Person {
    val name: String by PersonLauncher()
    val address: String by PersonLauncher()
    val city: String by PersonLauncher()
}

fun main(args: Array<String>) {
    val person = Person()
    println(person.name)
    println(person.address)
}
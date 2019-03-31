//指定kotlin源文件生成字节码文件的名字，而不是使用默认的kt.class
@file: JvmName("hello kotlin")

package com.mjie.annotation

import kotlin.reflect.KClass

/*
注解构造方法所允许的参数类型
与Java原生类型所对应的类型（Int，Long）
字符串：String
class而是
其他的注解
上述类型的数组类型

kotlin的注解参数是不允许为可空类型的，因为jvm不支持以null的形式存储注解属性的
如果某个注解被用作其他注解的参数，那么其名字就不需要以@字符开头

 */

annotation class MyAnnotation2(val str: String) {
}

@MyAnnotation2("hello")
class MyClass3 {
}

annotation class MyAnnotation3(val str: String, val myAnnotation2: MyAnnotation2)

@MyAnnotation3(str = "hello", myAnnotation2 = MyAnnotation2("world"))
class MyClass4

/*
如果需要将某个class作为注解的参数，那么请使用kotlin class(KClass)
kotlin编译器会自动将其转换为Java class
这样，Java代码就可以正常看到注解和参数了
 */

annotation class MyAnnotation4(val arg1: KClass<*>, val arg2: KClass<out Any>)

@MyAnnotation4(String::class, Int::class)
class MyClass5


//注解使用处目标 （use-site target）

/*
在对类的属性或是主构造方法的参数声明注解时，会存在多个Java元素都可以通过对应额kotlin元素生成出来，
因此，在所生成的Java字节码中，就会存在多个可能的位置来生成相应的注解，若想精确指定如何来生成注解，那么可以
使用注解的使用处目标方法来实现
 */
@Target(AnnotationTarget.FIELD, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.VALUE_PARAMETER)
annotation class MyAnnotation7

class MyClass6(@field:MyAnnotation7 val arg1: String, //注解Java field
               @get:MyAnnotation7 val arg2: String, //注解Java getter
               @param:MyAnnotation7 val arg3: String) //注解Java的构造方法参数


















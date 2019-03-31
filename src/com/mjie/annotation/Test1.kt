package com.mjie.annotation

@Target(AnnotationTarget.CLASS, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.EXPRESSION, AnnotationTarget.FUNCTION,
        AnnotationTarget.TYPE_PARAMETER, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.PROPERTY_SETTER)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class MyAnnotation {
}

@MyAnnotation
class MyClass {
    @MyAnnotation
    fun sayHello(@MyAnnotation name: String): String {
        return (@MyAnnotation "hello $name")
    }
}

class MyClass2 @MyAnnotation constructor(val name: String) {
    var a: Int? = null
        @MyAnnotation set(value) {
            field = value
        }
}

package com.mjie.objects

open class BaseClass {
    open fun method() {
    }
}

abstract class ChildClass: BaseClass() {
    override abstract fun method()
}


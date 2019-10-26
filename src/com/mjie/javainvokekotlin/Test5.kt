package com.mjie.javainvokekotlin

import java.io.FileNotFoundException

/**
 * kotlin中，不存在checked exception
 */
class  MyClass4 {

    @Throws(FileNotFoundException::class)
    fun method(){
        println("method not found")
        throw FileNotFoundException()
    }

}
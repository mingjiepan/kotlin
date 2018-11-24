package com.mjie.nested

class Person(val name: String, var age: Int) {

    private val str: String = "person str"

    private inner class PersonFeature(var height: Int, var weight: Int) {

        private val str: String = "personFeature str"

        fun getPersonFeature() {
            val str: String = "localVariable"

            println("height: $height, weight: $weight")
            println("person str : ${this@Person.str}, personFeature str: ${this.str}, localVariable: $str")
            this@Person.method()
        }
    }
    private fun method() {
        println("invoked person method")
    }

    fun getPerson() {
        val personFeature = PersonFeature(180, 130)
        personFeature.getPersonFeature()
    }
}

fun main(args: Array<String>) {
    val person = Person("hello", 20)
    person.getPerson()
}
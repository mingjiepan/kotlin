package com.mjie.`object`.generic

/**
 * kotlin：声明处协变；Java：使用处协变
 *
 * kotlin中的out关键字叫做variance annotation，因为它是在类型参数声明处所制定的，因此我们称之为声明处协变（declaration-site variance）
 *
 * 对于Java来说则是使用处协变（use-site variance），其中类型通配符使得类型协变成为可能.
 * List<? extends Number>：使用处协变
 *
 * */
/*
    如果泛型类只是将泛型类型作为其方法的输出类型，那么我们就可以使用out
    produce = output = out
 */
interface Producer<out T> {
    fun produce() : T
}
/*
    如果泛型类只是将泛型类型作为其方法的输入类型，那么我们就可以使用in
    consume = input = in
 */
interface Consumer<in T> {
    fun consume(item: T)
}
/*
    如果泛型类同时将泛型类型作为其方法的输入类型与输出类型，那么我们就不能使用out与in来修饰泛型类型
 */
interface ProducerConsumer<T> {
    fun consume(item: T)
    fun produce(): T
}

fun main(args: Array<String>) {

    val producer1: Producer<Fruit> = FruitProducer()
    val producer2: Producer<Fruit> = AppleProducer()
    val producer3: Producer<Fruit> = ApplePearProducer()

    val produce:Fruit = producer2.produce()

    println("-------------")

    val consumer1: Consumer<ApplePear> = AppleConsumer()
    val consumer2: Consumer<Apple> = FruitConsumer()
    consumer1.consume(ApplePear())
}


open class Fruit

open class Apple: Fruit()

class ApplePear: Apple()


class FruitProducer : Producer<Fruit> {
    override fun produce(): Fruit {
        println("produce fruit")
        return Fruit()
    }
}

class FruitConsumer: Consumer<Fruit> {
    override fun consume(item: Fruit) {
        println("consume fruit")
    }
}

class AppleProducer : Producer<Apple> {
    override fun produce(): Apple {
        println("produce apple")
        return Apple()
    }
}

class AppleConsumer: Consumer<Apple> {
    override fun consume(item: Apple) {
        println("consume apple")
    }
}

class ApplePearProducer: Producer<ApplePear> {
    override fun produce(): ApplePear {
        println("produce applePear")
        return ApplePear()
    }
}

class ApplePearConsumer: Consumer<ApplePear> {
    override fun consume(item: ApplePear) {
        println("consume applePear")
    }
}























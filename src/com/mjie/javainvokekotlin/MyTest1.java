package com.mjie.javainvokekotlin;

/**
 * @author panmingjie
 * @date 2018/12/8 14:29
 */
public class MyTest1 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        int calc = myClass.calc(1, 2);
        System.out.println(calc);

        String str = Test1Kt.getStr();
        System.out.println(str);
        Test1Kt.test();

        System.out.println("-------");

        //我们无法通过new关键字来创建kotlin编译器自动生成的以Kt结尾的类的实例
        //因为在生成的字节码中没有不带参数的构造方法
//        Test1Kt test1Kt = new Test1Kt();
    }
}

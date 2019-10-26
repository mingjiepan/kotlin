package com.mjie.javainvokekotlin;

import java.util.ArrayList;
import java.util.List;

public class MyTest2 {
    public static void main(String[] args) {
        List<String> stringList = Test2Kt.myFilter(new ArrayList<>());
        System.out.println(stringList);

        List<Integer> integerList = Test2Kt.myFilter2(new ArrayList<>());
        System.out.println(integerList);
    }
}

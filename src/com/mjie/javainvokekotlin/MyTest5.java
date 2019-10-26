package com.mjie.javainvokekotlin;

import java.io.FileNotFoundException;

public class MyTest5 {
    public static void main(String[] args) {
        MyClass4 myClass4 = new MyClass4();
        try {
            myClass4.method();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}

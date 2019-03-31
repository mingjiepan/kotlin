package com.mjie.kotlininvokejava;

import java.io.IOException;

/**
 * @author panmingjie
 * @date 2018/12/8 14:06
 */
public class MyException {
    public void method() throws IOException {
        throw new IOException("I/O异常");
    }
}

package com.mjie.other;

import java.util.Arrays;
import java.util.List;

/**
 * @author panmingjie
 * @date 2018/12/22 14:42
 */
public class Test1 {
    public static void main(String[] args) {
        List<String> filter1 = Test1Kt.myFilter(Arrays.asList("hello", "world"));
        List<Integer> filter2 = Test1Kt.myFilter2(Arrays.asList(10, 20));
        System.out.println(filter1);
        System.out.println(filter2);
    }
}

package com.mjie.`object`.generic

/*
* star projection (星投影)
* Star<out T> ：如果T的上界是TUpper,那么Star<*>就相当于Star<out T>，
* 这表示当T的类型未知时，你可以从Star<*>当中安全地读取TUpper类型的值
*
* Star<in T> ：Star<*>就相当于Star<in Nothing>，这表示你无法向其写入任何值
*
* Star<T>，如果T的上界为TUpper，那么Star<*>就相当于读取时的Star<out TUpper>以及写入时的Star<in Nothing>
*
* */



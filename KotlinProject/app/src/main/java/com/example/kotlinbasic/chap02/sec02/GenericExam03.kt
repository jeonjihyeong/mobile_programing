package com.example.kotlinbasic.chap02.sec02

fun <T: Number> getSum(num1: T, num2: T): T{
    return (num1.toDouble()+ num2.toDouble()) as T
}

fun main(){
    println(getSum(num1: 10, num2: 20))
    println(getSum(num1: 10.0f, num2: 20.0f))
    println(getSum(num1: 10.0, num2: 20.0))
}
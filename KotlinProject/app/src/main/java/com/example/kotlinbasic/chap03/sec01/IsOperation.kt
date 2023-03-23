package com.example.kotlinbasic.chap03.sec01

fun main(){
    val obj1 = b()

    if(obj1 is A){
        println("A Class Type")
    }else{
        println("Not A Class Type")
    }

    if(obj1 is B){
        println("B Class Type")
    }else {
        println("Not B Class Type")
    }
}

open class A {}
class B: A() {}
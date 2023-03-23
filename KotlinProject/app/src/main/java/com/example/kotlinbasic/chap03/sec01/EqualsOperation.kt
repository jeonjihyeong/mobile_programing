package com.example.kotlinbasic.chap03.sec01

fun main(){
    val v1: Int = 100; val v2: Int = 200; val v3: Int = 100
    println("v1==v2 : ${v1 == v2}")
    println("v1.equals(v3) : ${v1.equals(v3)}")
    println("v1!=v2 : ${v1 != v2}")

    val obj1 = Score(a: 100, b: 200); val obj2 = Score(a: 300, b: 400)
    val obj3 = Score(a: 100, b: 200)

    println("obj1 == obj2 : ${obj1==obj2}")
    println("obj1 == obj3 : ${obj1==obj3}")
    println("obj1equals(obj3) : ${obj1.equals(obj3)}")
    println("obj1 === obj2 : ${obj1===obj3}")
    println("obj1 !== obj2 : ${obj1!==obj3}")

    var nullTest: String? = "Kotlin"

    println("nullTest?.length : ${nullTest?.length}")

    val length = nullTest?.length ?: -1
    println("length : ${length}")
}

data class Score(val a: Int, val b: Int){ }
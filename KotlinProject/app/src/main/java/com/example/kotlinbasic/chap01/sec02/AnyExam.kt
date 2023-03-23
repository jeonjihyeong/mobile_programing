package com.example.kotlinbasic.chap01.sec02

fun main() {
    checkArgs(type: "Kotlin")
    checkArgs(type: 100)
    checkArgs(type: 100.0)
}


fun checkArgs(type: Any){
    when(type){
        is String -> println("Type is String: $type")
        is Int -> println("Type is Int: $type")
        is Double -> println("Type is Double: $type")
    }
}
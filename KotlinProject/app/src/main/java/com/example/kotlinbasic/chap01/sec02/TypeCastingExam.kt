package com.example.kotlinbasic.chap01.sec02

fun main(){
    var intData = 100

    val data1: Long = intData.toLong()
    if(data1 is Long) println("data: Long = $data1")
    val data2: Float = intData.toFloat()
    if(data2 is Float) println("data: Float = $data2")
    val data3: Long = intData.toDouble()
    if(data3 is Double) println("data: Double = $data3")


    var strData: String = "Kotlin"
    println("strData: $strData")

    strData = "Android"
    println("strData: $strData")

    val data4: Int = 100

    val data6: String = data4.toString()
    println("data6: $data6")

    val data7: String = "100"
    val data8: Int = data7.toInt()
    println("data8: $data8")
    val data9: String = "98.72"
    val data10 = data9.toFloat()
    println("data10: $data10")

    val data11: String ="100o"
    val data13: Int? = data11.toIntOrNull()
    println("data13: $data13")

    try{
        val data14: Int = data11.toInt()
    }catch (e: NumberFormatException){
    println("data11 is not number: $data11")
    }
}
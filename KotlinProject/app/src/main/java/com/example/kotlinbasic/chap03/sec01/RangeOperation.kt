package com.example.kotlinbasic.chap03.sec01
import java.time.LocalDate

fun main(){
    val lowerAlphaRange = 'a' .. 'z'
    val numberRange = 1 .. 100
    println("isLower: ${'d' in lowerAlphaRange}")
    println("isNumber: ${101 in numberRange}")
    println()

    for (i in 1.. 10) print("$i, ")
    println()
    for (i in 'a'..'z') print("$i, ")
    println()

    val start = LocalDate.now()
    println("start : $start")
    val end = start..start.plusDays( daysToAdd: 5 )
    println("end : $end")

    println("add weeks : ${start.plusWeeks(weeksToAdd: 1)}")
    println("add weeks : ${start..start.plusWeeks(weeksToAdd: 1)}")
}
package com.example.kotlinbasic.chap05.sec01

fun main(){
    val president = Employee(name: "김대표", manager:null)
    val director = Employee(name: "김부장", president)

    println(managerInfo(president))
    println(managerInfo(director))
}

class Employee(val name: String, val manager: Employee)

fun managerInfo(employee: Employee): String? = employee.manager?.name
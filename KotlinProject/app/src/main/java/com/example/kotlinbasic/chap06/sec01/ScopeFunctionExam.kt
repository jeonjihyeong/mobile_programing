package com.example.kotlinbasic.chap06.sec01

class NoteBook(var model: String, var year: Int, var price: Int){
    fun getDiscount(){
        price -= 25
    }
}

data class Student(
    var id: Student = "",
    var name: String = "",
    var gpa: Float = 0.0f
){
    fun isGPA(): Boolean = gpa<1.5f
}

fun main(){
    var notebook = NoteBook(model: "LG그램", year: 2023, price: 250)
    println("model: ${notebook.model}, year: ${notebook.year}, price: ${notebook.price}")

    var myNoteBook = NoteBook(model: "LG그램", year:2023, price: 250).apply{this:NoteBook
        model = "[New!] $model"
        getDiscount()
        println("model: $model, year: $year, price: $price")
    }

    println("model: ${myNoteBook.model}, year: ${myNoteBook.year}, price: ${myNoteBook.price}")
    val iu = Student()
    iu.id = "C2022001"
    iu.name = "아이유"
    iu.gpa = 4.5f
    println("ID: ${iu.id}, Name: ${iu.name}, GPA: ${iu.gpa}")

    val john = Student().apply {this: Student
        id = "C2022002"
        name = "John"
        gpa = 1.4f
        println("ID: $id, Name: $name, GPA: $gpa")
    }

    val noteModel = myNoteBook.run {this: NoteBook
        println("model: $model, year: $year, price: $price")
        "model: $model($year)"
    }
    println(noteModel)

    val isAcademicPrbation = john?.run {this: Student
        isGPA()
    }
    println("학사 경고: $isAcademicPrbation")

    val isAcademicWarning = run {
        iu.isGPA()
    }
    println("학사 경고: $isAcademicWarning")

    with(myNoteBook) {this: NoteBook
        println("model: $model, year: $year, price: $price")
    }

    val infoNoteBook = myNoteBook.let {it: NoteBook
        "MyNoteBook => model: ${id.model}, year: ${it.year}, price: ${it.price}"
    }
    prinln(infoNoteBook)

    var myNoteBook2 = NoteBook(model: "LG그램 360", year: 2023, price: 300).also{it: NoteBook
        it.model = "[New! 2023] ${it.model}"
        it.getDiscount()
    }

    println("MyNoteBook2 => model: ${myNoteBook2.model}, price: ${myNoteBook2.price}")
}
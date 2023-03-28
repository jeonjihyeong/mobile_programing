package com.example.kotlinbasic.chap09.sec03

data class Customer(val name: String, val age: Int, val tel: String){
    init{
        println("멤버 속성이 초기화 되었습니다.")

    }

    var nationality: String = "Korea"
    constructor(name: String, age: Int, tel: String, _nationality: String):this(name,age,tel){
        nationality = _nationality
    }
}

fun main(){
    val obj1 = Customer("손흥민", 28, "010-123-4567")
    val obj2 = Customer("이강인", 19, "010-456-7890")
    val obj3 = Customer("봉준호", 52, "Korea")

    println("obj1: $obj1")
    println("obj2: $obj2")
    println("obj3: $obj3")

    println("${obj3.name} 감독의 국적은 ${obj3.nationality}입니다.")

    println(obj1 == obj2)

    println(obj1.hashCode() ==obj2.hashCode())
    println("obj1.hashCode(): ${obj1.hashCode()} == obj2.hashCode(): ${obj2.hashCode()}")

    val obj4 = obj1.copy(tel="010-777-7777")
    println(obj4)

    println(obj4==obj1)

    println(obj4===obj1)
    val (fName, fAge, fTel)=obj1
    println("$fName, $fAge, $fTel")

    val customerList = listOf(obj1, obj2, obj3, obj4)
    for ((name, age, tel) in customerList){
        println("name: $name, age: $age, tel: $tel")
    }

    val lambdaCustom = {
        (name, age, tel): Customer ->
            println("name:$name, age: $age, tel: $tel")
    }

    for(obj in customerList){
        lambdaCustom(obj)
    }

    val obj5 = Customer("김민재", 27, "010-321-1234")
    val obj6 = Customer("김혜인", 17, "010-111-1111")
    val obj7 = Customer("최민아", 21, "010-333-3333")






    val manager = CustomerManger()
    manager.joinCustomer(obj1)
    manager.joinCustomer(obj2)

}

class CustomerManger {
    private val customList = ArrayList<Customer>()

    fun joinCustomer(customer: Customer){
        when{
            customer.age< 20 ->
        }
    }


}
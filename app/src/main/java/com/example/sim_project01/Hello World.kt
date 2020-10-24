package com.example.sim_project01

fun main() {
    val one : Int = 22 // val : 바꿀 수 없는 값
    var hello : String = "Hello World" // var : 변경 할 수 있는 값
    // var hello : String? = null : ?를 넣어야 null 값을 넣을 수 있다
    // one = 100 val은 변경할 수 없기 때문에 쓸 수 없다고 나옴
    hello = "치즈" // var는 변경 가능 하니까 쓸 수 있음
    println(hello)
    println(one)
    println(hi())
    println(ho())
    println(add(4,5))

}

fun hi() : String { //함수 호출
    return "사랑합니다."
}

fun ho() : Unit { //함수 호출
    println("좋아합니다.") // return을 사용하는 것이 아니라면 Unit을 사용하지만 생략해도 됨
}

// 두 수를 더하는 함수
fun add(a : Int, b : Int) : Int {
    return a+b
}

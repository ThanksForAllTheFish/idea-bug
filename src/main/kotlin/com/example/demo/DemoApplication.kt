package com.example.demo

interface Something

class Test(
    private val something: Something
)

fun stub() = object : Something {}

fun main() {
    WithinALambda {
        Test(stub())
    }
}

class WithinALambda(body: WithinALambda.() -> Unit) {
    init {
        body()
    }
}
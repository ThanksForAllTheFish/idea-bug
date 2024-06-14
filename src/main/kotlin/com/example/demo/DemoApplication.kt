package com.example.demo

class Test

fun main() {
    WithinALambda {
        Test()
    }
}

class WithinALambda(body: WithinALambda.() -> Unit) {
    init {
        body()
    }
}
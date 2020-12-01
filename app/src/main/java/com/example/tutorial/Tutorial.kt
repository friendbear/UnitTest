package com.example.tutorial

class Calculator {
    fun multiply(x: Int, y: Int): Int {
        return x * y
    }
    fun divide(x: Int, y: Int): Double {

        if (y == 0)
            throw IllegalArgumentException("divide by zero")

        return x / y.toDouble()
    }
}

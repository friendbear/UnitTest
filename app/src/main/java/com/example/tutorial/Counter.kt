package com.example.tutorial

class Counter {
    var count = 0
    fun increment(): Int {
        count += 1
        return count
    }
    fun decrement(): Int {
        count -= 1
        return count
    }
}
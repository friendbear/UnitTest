package com.example.tutorial


class FizzBuzz {

    fun fizzBuzz(value: Int): String {

        val a = value % 3 == 0
        val b = value % 5 == 0

        return if (a && b) {
            "FizzBuzz"
        } else if (a && !b) {
            "Fizz"
        } else if (!a && b) {
            "Buzz"
        } else {
            value.toString()
        }
    }
}
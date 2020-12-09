package com.example.tutorial


class FizzBuzz {

    fun fizzBuzz(value: Int): String {

        val a = value % 3 == 0
        val b = value % 5 == 0

        return when {
            (a && b)  -> "FizzBuzz"
            (a && !b) -> "Fizz"
            (!a && b) -> "Buzz"
            else ->      value.toString()

        }
    }
}